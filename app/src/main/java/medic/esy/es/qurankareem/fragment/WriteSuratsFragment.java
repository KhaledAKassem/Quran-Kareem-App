package medic.esy.es.qurankareem.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import medic.esy.es.qurankareem.R;
import medic.esy.es.qurankareem.adapter.WriteSuratsAdapter;
import medic.esy.es.qurankareem.model.Surats;



public class WriteSuratsFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.write_surats_fragment,container,false);


        RecyclerView recyclerReader = (RecyclerView) v.findViewById(R.id.recyclerWriteSurat);
        recyclerReader.setLayoutManager(new LinearLayoutManager(getContext()));

        WriteSuratsAdapter writeSuratsAdapter = new WriteSuratsAdapter(getContext(), getWriteSuratsList());
        recyclerReader.setAdapter(writeSuratsAdapter);


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


    public ArrayList<Surats> getWriteSuratsList(){

        ArrayList<Surats> suratses = new ArrayList<>();

        for (int i=0 ; i<nameOfSurat.length;i++){
            Surats surats = new Surats();

            surats.setSuratName(nameOfSurat[i]);
            suratses.add(surats);
        }


        return suratses;
    }


    }
