package medic.esy.es.qurankareem.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import medic.esy.es.qurankareem.R;
import medic.esy.es.qurankareem.fragment.ShowSuratFragment;
import medic.esy.es.qurankareem.model.Surats;

import java.util.ArrayList;

public class OtherAdapter extends RecyclerView.Adapter<OtherAdapter.OtherHolder> {

    Context context ;
    ArrayList<Surats> list ;

    public OtherAdapter(Context context , ArrayList<Surats> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public OtherHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View otherRow = LayoutInflater.from(context).inflate(R.layout.other_item,parent,false);
        OtherHolder holder =new OtherHolder(otherRow);

        return holder;
    }

    @Override
    public void onBindViewHolder(OtherHolder holder, final int position) {

        Surats s = list.get(position);
        holder.otherWriteName.setText(s.getSuratName());



        holder.otherClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("write_position",position+"");
                bundle.putString("f",2+"");

                FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                ShowSuratFragment showSuratFragment = new ShowSuratFragment();
                showSuratFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.content_home,showSuratFragment);
                fragmentTransaction.commit();

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class OtherHolder extends RecyclerView.ViewHolder{

        TextView otherWriteName;
        LinearLayout otherClick;

        public OtherHolder(View itemView) {
            super(itemView);

            otherWriteName = (TextView) itemView.findViewById(R.id.otherWriteName);

            otherClick = (LinearLayout) itemView.findViewById(R.id.otherClick);

        }
    }
}

