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

public class FavAdapter extends RecyclerView.Adapter<FavAdapter.FavHolder> {

    Context context ;
    ArrayList<Surats> list ;

    public FavAdapter(Context context , ArrayList<Surats> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public FavHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View favRow = LayoutInflater.from(context).inflate(R.layout.fav_item,parent,false);
        FavHolder holder =new FavHolder(favRow);

        return holder;
    }

    @Override
    public void onBindViewHolder(FavHolder holder, final int position) {

        Surats s = list.get(position);
        holder.favWriteName.setText(s.getSuratName());



        holder.favClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("write_position",position+"");
                bundle.putString("f",3+"");

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

    class FavHolder extends RecyclerView.ViewHolder{

        TextView favWriteName;
        LinearLayout favClick;

        public FavHolder(View itemView) {
            super(itemView);

            favWriteName = (TextView) itemView.findViewById(R.id.favWriteName);

            favClick = (LinearLayout) itemView.findViewById(R.id.favClick);

        }
    }
}

