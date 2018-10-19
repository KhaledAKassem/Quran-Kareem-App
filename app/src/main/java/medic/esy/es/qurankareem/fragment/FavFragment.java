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
import medic.esy.es.qurankareem.adapter.FavAdapter;
import medic.esy.es.qurankareem.model.Surats;


public class FavFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fav_fragment,container,false);


        RecyclerView recyclerOther = (RecyclerView) v.findViewById(R.id.recyclerFav);
        recyclerOther.setLayoutManager(new LinearLayoutManager(getContext()));

        FavAdapter favAdapter = new FavAdapter(getContext(), getWriteSuratsList());
        recyclerOther.setAdapter(favAdapter);


        return v;
    }


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


    public ArrayList<Surats> getWriteSuratsList(){

        ArrayList<Surats> suratses = new ArrayList<>();

        for (int i=0 ; i<favOfSurat.length;i++){
            Surats surats = new Surats();

            surats.setSuratName(favOfSurat[i]);
            suratses.add(surats);
        }

        return suratses;
    }


}

