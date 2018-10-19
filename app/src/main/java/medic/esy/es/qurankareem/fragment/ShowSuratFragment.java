package medic.esy.es.qurankareem.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import medic.esy.es.qurankareem.R;


public class ShowSuratFragment extends Fragment{

    TextView sName,suratText,besm_allah;

    int txtSize = 18;

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

    String  favOfSurat [] = {
            "بسم الله الرحمن الرحيم",
            "الفاتحة",
            "البقرة",
            "أية الكرسى",
            "خواتيم سورة البقرة",
            "آل عمران",
            "الأنعام",
            "التوبة",
            "الإسراء",
            "الكهف",
            "النور",
            "یس",
            "الزمر",
            "المؤمن",
            "الفتح",
            "الدخان",
            "الرحمن",
            "الواقعة",
            "الحشر",
            "الملك",
            "الضحى",
            "القدر",
            "الزلزال",
            "التكاثر",
            "الكافرون",
            "النصر",
            "قريش",
            "الإخلاص",
            "الفلق والناس",
    };


    String  other [] = {"الْأدْعِيَةُ القرآنية","فضائل القرآن الكريم","آيات تدعو لتلاوة القرآن الكريم وتدبره والتأثر به"
            ,"أحاديث تدعو لتلاوة القرآن الكريم وتدبره والتأثر به"
    };



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.show_surat_fragment,container,false);

        besm_allah = (TextView) v.findViewById(R.id.besm_allah);
        suratText = (TextView) v.findViewById(R.id.suratText);



        try {

            Bundle bundle = getArguments();


            String fileName = bundle.getString("write_position");
            int f = Integer.parseInt(bundle.getString("f"));

            switch (f){
                case 1:
                    openWords("quran/q"+fileName+".txt");
                    sName.setText("سوره "+nameOfSurat[Integer.parseInt(fileName)]);
                    if (Integer.parseInt(fileName) != 8)
                        besm_allah.setText("بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ");
                    break;
                case 2:
                    openWords("other/o"+fileName+".txt");
                    besm_allah.setText(other[Integer.parseInt(fileName)]);
                    break;
                case 3:
                    openWords("fav/f"+fileName+".txt");
                    besm_allah.setText("فضل "+favOfSurat[Integer.parseInt(fileName)]);

                    break;

            }


        }catch (Exception e){

        }



        return v;
    }

    public void openWords(String l) throws IOException {

        InputStream inputStream = getActivity().getAssets().open(l);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i = inputStream.read();
        while (i != -1)
        {
            byteArrayOutputStream.write(i);
            i = inputStream.read();
        }
        inputStream.close();
        Typeface type = Typeface.createFromAsset(getActivity().getAssets(),"qq.ttf");

        suratText.setText(byteArrayOutputStream.toString());
        suratText.setTypeface(type);

    }
}
