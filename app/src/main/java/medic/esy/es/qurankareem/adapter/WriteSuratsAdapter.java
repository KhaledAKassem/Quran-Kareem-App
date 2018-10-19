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


public class WriteSuratsAdapter extends RecyclerView.Adapter<WriteSuratsAdapter.WriteSuratsHolder> {

    Context context ;
    ArrayList<Surats> list ;

    public WriteSuratsAdapter(Context context , ArrayList<Surats> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public WriteSuratsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View suratRow = LayoutInflater.from(context).inflate(R.layout.write_surats_item,parent,false);
        WriteSuratsHolder holder =new WriteSuratsHolder(suratRow);

        return holder;
    }

    @Override
    public void onBindViewHolder(WriteSuratsHolder holder, final int position) {

        Surats s = list.get(position);
        holder.suratsWriteName.setText(s.getSuratName());



        holder.suratsWriteClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("write_position",position+"");
                bundle.putString("f",1+"");

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

    class WriteSuratsHolder extends RecyclerView.ViewHolder{

        TextView suratsWriteName;
        LinearLayout suratsWriteClick;

        public WriteSuratsHolder(View itemView) {
            super(itemView);

            suratsWriteName = (TextView) itemView.findViewById(R.id.suratsWriteName);
            suratsWriteClick = (LinearLayout) itemView.findViewById(R.id.suratsWriteClick);

        }
    }
}
