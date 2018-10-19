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
import medic.esy.es.qurankareem.adapter.OtherAdapter;
import medic.esy.es.qurankareem.model.Surats;



public class OtherFragment  extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.other_fragment,container,false);


        RecyclerView recyclerOther = (RecyclerView) v.findViewById(R.id.recyclerOther);
        recyclerOther.setLayoutManager(new LinearLayoutManager(getContext()));

        OtherAdapter otherAdapter = new OtherAdapter(getContext(), getWriteSuratsList());
        recyclerOther.setAdapter(otherAdapter);


        return v;
    }


    String  other [] = {"Duaa from Quran","Virtues of reading the Quran","The most important Verse in the Quran"
            ,"Some of Prophet Muhammad (PBUH) hadith"
    };


    public ArrayList<Surats> getWriteSuratsList(){

        ArrayList<Surats> suratses = new ArrayList<>();

        for (int i=0 ; i<other.length;i++){
            Surats surats = new Surats();

            surats.setSuratName(other[i]);
            suratses.add(surats);
        }


        return suratses;
    }


}

