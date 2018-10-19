package medic.esy.es.qurankareem.fragment;

import android.app.DownloadManager;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import medic.esy.es.qurankareem.BackgroundSoundService;
import medic.esy.es.qurankareem.OnItemClick;
import medic.esy.es.qurankareem.R;
import medic.esy.es.qurankareem.adapter.SuratAdapter;
import medic.esy.es.qurankareem.model.Surats;

import static android.content.Context.DOWNLOAD_SERVICE;


public class SuratsFragment extends Fragment implements OnItemClick {

    PlayerTask playerTask;

    MediaPlayer sound = new MediaPlayer();

    String[] myArray;
    String linkName,server;

    String x;

    Button checkSuratState;
    Boolean checkSurat = false;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.surats_fragment,container,false);

        checkSuratState = (Button) v.findViewById(R.id.checkSuratState);
        checkSuratState.setEnabled(false);
        checkSuratState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (checkSurat){
                    checkSurat = false;

                    BackgroundSoundService.onPause();
                    checkSuratState.setText("Start");
                } else {
                    checkSurat = true;

                    BackgroundSoundService.onStart();
                    checkSuratState.setText("Pause");

                }
            }
        });

        Button fab = (Button) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Now choose anthor reader ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                SuratsFragment suratsFragment=new SuratsFragment();
                int id = container.getId();

                ReadersFragment nextFrag= new ReadersFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(id, nextFrag,"findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });


        RecyclerView recyclerReader = (RecyclerView) v.findViewById(R.id.recyclerSurat);
        recyclerReader.setLayoutManager(new LinearLayoutManager(getContext()));

        Bundle bundle = getArguments();

        linkName = bundle.getString("reader_link");
        server = bundle.getString("server");

        String fileName = bundle.getString("reader_position");


        InputStream inputStream = null;
        try {
            inputStream = getActivity().getAssets().open("readers/n"+fileName+".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1)
            {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        myArray = TextUtils.split(byteArrayOutputStream.toString(), ",");


        SuratAdapter suratAdapter = new SuratAdapter(getContext(), getSuratsList(myArray),this);
        recyclerReader.setAdapter(suratAdapter);




        return v;
    }


    String  nameOfSurat [] = {
            "Surat Al-Fatihah | الفاتحة","Surat Al-Baqarah | البقرة ","Surat Aal-E-imran | آل عِمرَان","Surat An-Nisa | النساء","Surat Al-Maidah | المَائدة" ,"Surat Al-Anam | الانعام","Surat Al-Araf | الاعراف","Surat Al-Anfal | الانفال","Surat Al-Tawbah | التوبة ","Surat Yunus | يونس",
            "Surat Hud | هود","Surat Yusuf | يُوسُف","Surat Ar-Ra'd | الرَّعْد","Surat Ibrahim | إبراهِيم ","Surat Al-Hijr | الحِجْر","Surat An-Nahl |النَّحْل  ","Surat Al-Isra | الإسْرَاء   ","Surat Al-Kahf | الكهْف","Surat Maryam | مَريَم ","Surat Ta-Ha | طه",
            "Surat Al-Anbiya | الأنبيَاء","Surat Al-Hajj | الحج","Surat Al-Mu'minoon | المُؤمنون","Surat An-Nur | النُّور","Surat Al-Furqan | الفُرْقان","Surat Ash-Shura | الشُّعَرَاء","Surat An-Naml | النَّمْل","Surat Al-Qasas | القَصَص","Surat Al-Ankabut | العَنكبوت","Surat Ar-Rum | الرُّوم" ,
            "Surat Luqman | لقمَان","Surat As-Sajda | السَّجدَة","Surat Al-Ahzab | الأحزَاب","Surat Saba | سَبَأ","Surat Fatir | فَاطِر","Surat Ya Sin | يس","Surat As-Saaffat | الصافات ","Surat Sad | ص","Surat Az-Zumar | الزمر","Surat Ghafir | غافر",
            "Surat Fussilat | فصلت","Surat Ash-Shura | الشورى","Surat Az-Zukhruf | الزخرف","Surat Ad-Dukhan | الدخان","Surat Al-Ghashiyah | الجاثية","Surat Al-Ahqaf | الاحقاف","Surat Muhammad | محمد ","Surat Al-Fath | الفتح","Surat Al-Hujurat | الحجرات","Surat Qaf | ق",
            "Surat Az-Zariyat | الذَّاريَات ","Surat At-Tur | الطُّور","Surat An-Najm | النَّجْم","Surat Al-Qamar | القَمَر","Surat Ar-Rahman | الرَّحمن","Surat Al-Waqi'a | الوَاقِعَة","Surat Al-Hadid | الحَديد","Surat Al-Mujadila | المجَادلة","Surat Al-Hashr | الحَشر","Surat Al-Mumtahanah | المُمتَحنَة",
            "Surat As-Saff | الصَّف","Surat Al-Jumu'ah | الجُمُعَة","Surat Al-Munafiqun | المنَافِقون","Surat At-Taghabun | التغَابُن","Surat At-Talaq | الطلَاق","Surat At-Tahrim | التحْريم","Surat Al-Mulk | المُلْك","Surat Al-Qalam | القَلَم","Surat Al-Haaqqa | الحَاقَّة","Surat Al-Maarij | المعَارج" ,
            "Surat Nuh | نُوح","Surat Al-Jinn | الجن","Surat Al-Muzzammil | المُزَّمِّل","Surat Al-Muddathir | المُدَّثِّر","Surat Al-Qiyama | القِيَامَة" ,"Surat Al-Insan | الإنسَان","Surat Al-Mursalat | المرسلات","Surat An-Naba | النَّبَأ","Surat An-Naziat | النازعات","Surat Abasa | عَبَس",
            "Surat At-Takwir | التَّكوير","Surat Al-Infitar | الانفِطار ","Surat Al-Mutaffifin | المطفِّفِين","Surat Al-Inshiqaq | الانْشِقَاق","Surat Al-Burooj | البروج","Surat At-Tariq | الطارق","Surat Al-Ala | الاعلى","Surat Al-Ghashiyah | الغَاشِية","Surat Al-Fajr | الفجر","Surat Al-Balad | البلد",
            "Surat Ash-Shams | الشمس","Surat Al-Lail | الليل","Surat Ad-Dhuha | الضحى","Surat Al-Inshirah | الشرح","Surat At-Tin | التين","Surat Al-Alaq | العلق" ,"Surat Al-Qadr | القَدْر","Surat Al-Bayyina | البَينَة","Surat Az-Zalzala | الزلزَلة","Surat Al-Adiyat | العَادِيات",
            "Surat Al-Qaria | القارعة","Surat At-Takathur | التكاثر","Surat Al-Asr | العصر ","Surat Al-Humaza | الهُمَزَة","Al-Fil | الفيل" ,"Surat Quraysh | قريش","Surat Al-Ma'un | الماعون","Surat Al-Kawthar | الكوثر","Surat Al-Kafirun | الكافرون","An-Nasr | النصر",
            "Surat Al-Masad | المسد","Surat Al-Ikhlas | الإخْلَاص" ,"Surat Al-Falak  | الفلق","Surat An-Nās | النصر"
    };

    public ArrayList<Surats> getSuratsList(String[] arr){

        ArrayList<Surats> suratses = new ArrayList<>();

        for (int i=0 ; i<arr.length;i++){
            Surats surats = new Surats();

            int x = (Integer.parseInt(arr[i]))-1;

            String s = nameOfSurat[x];
            surats.setSuratName(s);
            suratses.add(surats);
        }
        return suratses;
    }


    public boolean isOnline() {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8");
            int     exitValue = ipProcess.waitFor();
            return (exitValue == 0);
        }
        catch (IOException e)          { e.printStackTrace(); }
        catch (InterruptedException e) { e.printStackTrace(); }

        return false;
    }

    @Override
    public void onClick(int value,int f) {



        x = myArray[value];

        if (f == 0) {

            closeAsyncTask();
            checkSuratState.setEnabled(false);
            checkSuratState.setText("Wait .. Loading..");

            try{
                sound.stop();
                sound.reset();
            } catch (Exception e){}

            playerTask = (PlayerTask) new PlayerTask().execute();
        }else {

            String link = null;

            switch (x.length()){
                case 1:
                    link = "http://server"+server+".mp3quran.net/"
                            +
                            linkName
                            +
                            "/00"+x+".mp3";
                    break;

                case 2:
                    link = "http://server"+server+".mp3quran.net/"
                            +
                            linkName
                            +
                            "/0"+x+".mp3";
                    break;

                case 3:
                    link = "http://server"+server+".mp3quran.net/"
                            +
                            linkName
                            +
                            "/"+x+".mp3";
                    break;

            }

            DownloadManager downloadManager = (DownloadManager) getActivity().getSystemService(DOWNLOAD_SERVICE);
            Uri Download_Uri = Uri.parse(link);
            DownloadManager.Request request = new DownloadManager.Request(Download_Uri);

            //Restrict the types of networks over which this download may proceed.
            request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
            //Set whether this download may proceed over a roaming connection.
            request.setAllowedOverRoaming(false);
            //Set the title of this download, to be displayed in notifications (if enabled).
            try{
                request.setTitle(nameOfSurat[Integer.parseInt(x)-1]);
            }catch (Exception e){
                request.setTitle("القران الكريم");

            }            //Set a description of this download, to be displayed in notifications (if enabled)
            request.setDescription("جاري التنزيل");
            //Set the local destination for the downloaded file to a path within the application's external files directory
            request.setDestinationInExternalFilesDir(getContext(),Environment.DIRECTORY_DOWNLOADS,"/quran/"+selectName(link)+".mp3");

            //Enqueue a new download and same the referenceId
            downloadManager.enqueue(request);


        }
    }
    public String selectName(String n){

        String name = null;
        for (int i=28;i<n.length()-4;i++){
            name+=n.charAt(i);
        }
        return name;
    }


    public void clickStart(){

        getActivity().stopService(new Intent(getContext(),
                BackgroundSoundService.class));



        String link = null;

        switch (x.length()){
            case 1:
                link = "http://server"+server+".mp3quran.net/"
                        +
                        linkName
                        +
                        "/00"+x+".mp3";
                break;

            case 2:
                link = "http://server"+server+".mp3quran.net/"
                        +
                        linkName
                        +
                        "/0"+x+".mp3";
                break;

            case 3:
                link = "http://server"+server+".mp3quran.net/"
                        +
                        linkName
                        +
                        "/"+x+".mp3";
                break;

        }
        Intent serviceIntent = new Intent(getContext(),BackgroundSoundService.class);
        Log.v("aaaaaaaaaaaaaa","1");
        serviceIntent.putExtra("url", link);
//        serviceIntent.putExtra("url", "http://server8.mp3quran.net/saber/002.mp3");
        Log.v("aaaaaaaaaaaaaa","2");
        getActivity().startService(serviceIntent);
        Log.v("aaaaaaaaaaaaaa","3");

/*
        playAudio(link,Integer.parseInt(x));
        */

    }

    private void playAudio(final String link, int x){

        sound.stop();
        sound.reset();


        sound.setAudioStreamType(AudioManager.STREAM_MUSIC);


        try {

            sound.setDataSource(link);

        } catch (Exception e) {

            e.printStackTrace();

        }

        try {

            sound.prepare();

        } catch (Exception e) {

            e.printStackTrace();

        }

        sound.start();

    }

    @Override
    public void onPause() {
        super.onPause();

        sound.pause();
    }

    @Override
    public void onResume() {
        super.onResume();

        sound.start();
    }

    @Override
    public void onStop() {
        super.onStop();

        sound.stop();
        sound.reset();

    }



    class PlayerTask extends AsyncTask<Void,Void,Boolean> {


        @Override
        protected Boolean doInBackground(Void... params) {



            if (isOnline()){
                checkSurat = true;

                clickStart();

            }else {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.content_home,new NoInternet());
                transaction.addToBackStack(null);
                transaction.commit();

            }


            return null;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            sound.start();
            checkSuratState.setEnabled(true);
            checkSuratState.setText("Pause");
            checkSurat = true;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (checkSurat)
            sound.release();
    }

    @Override
    public void onStart() {
        super.onStart();
        closeAsyncTask();
    }

    public void closeAsyncTask(){
        try {
            sound.stop();
            sound.reset();
            playerTask.cancel(true);
        }catch (Exception e){

        }

    }
}
