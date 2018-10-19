package medic.esy.es.qurankareem.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import medic.esy.es.qurankareem.Home;
import medic.esy.es.qurankareem.R;
import medic.esy.es.qurankareem.adapter.ReaderAdapter;
import medic.esy.es.qurankareem.model.Data;


public class ReadersFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.readers_fragment,container,false);
        ReadersFragment ff=new ReadersFragment();
         RecyclerView recyclerReader = (RecyclerView) v.findViewById(R.id.recyclerReader);

        recyclerReader.setLayoutManager(new LinearLayoutManager(getContext()));
        Button fab2 = (Button) v.findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Home.class);
                startActivity(intent);

            }
        });
        ReaderAdapter readerAdapter = new ReaderAdapter(getContext(), Data.getData());
        recyclerReader.setAdapter(readerAdapter);


        return v;
    }



}
