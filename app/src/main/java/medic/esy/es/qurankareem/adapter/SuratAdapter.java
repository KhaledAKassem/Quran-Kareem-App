package medic.esy.es.qurankareem.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import medic.esy.es.qurankareem.OnItemClick;
import medic.esy.es.qurankareem.R;
import medic.esy.es.qurankareem.model.Surats;

import java.util.ArrayList;


public class SuratAdapter extends RecyclerView.Adapter<SuratAdapter.SuratHolder>{

    Context context ;
    ArrayList<Surats> list ;
    private OnItemClick mCallback;
    int selectedPosition=-1;
    private TextView suratTextName;

    public SuratAdapter(Context context , ArrayList<Surats> list,OnItemClick listener){
        this.context = context;
        this.list = list;
        this.mCallback = listener;
    }

    @Override
    public SuratHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View suratRow = LayoutInflater.from(context).inflate(R.layout.surats_item,parent,false);
        SuratHolder holder =new SuratHolder(suratRow);


        return holder;
    }

    @Override
    public void onBindViewHolder(SuratHolder holder, final int position) {

        Surats s = list.get(position);
        holder.suratTextName.setText(s.getSuratName());



        if(selectedPosition==position) {
            holder.suratsClick.setBackgroundColor(Color.parseColor("#08B455"));
            holder.suratTextName.setTextColor(Color.parseColor("#ffffff"));
        }else {
            holder.suratsClick.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.suratTextName.setTextColor(Color.parseColor("#08B455"));
        }
        holder.suratsClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedPosition=position;
                notifyDataSetChanged();
                mCallback.onClick(position,0);
            }
        });
        holder.download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mCallback.onClick(position,1);

            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class SuratHolder extends RecyclerView.ViewHolder{

        TextView suratTextName;
        ImageView download;
        LinearLayout suratsClick;
        public SuratHolder(View itemView) {
            super(itemView);

            suratTextName = (TextView) itemView.findViewById(R.id.suratTextName);

            download = (ImageView) itemView.findViewById(R.id.download);
            suratsClick = (LinearLayout) itemView.findViewById(R.id.suratsClick);
        }
    }
}
