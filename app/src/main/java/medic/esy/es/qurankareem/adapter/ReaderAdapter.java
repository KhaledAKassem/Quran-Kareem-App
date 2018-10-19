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

import medic.esy.es.qurankareem.model.Data;
import medic.esy.es.qurankareem.R;
import medic.esy.es.qurankareem.fragment.SuratsFragment;

import java.util.ArrayList;


public class ReaderAdapter extends RecyclerView.Adapter<ReaderAdapter.ReaderHolder>{

    Context context;
    ArrayList<Data> readerList;

    public ReaderAdapter(Context context, ArrayList<Data> readerList){
        this.context = context;
        this.readerList = readerList;
    }

    @Override
    public ReaderHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(context).inflate(R.layout.reader_item,parent,false);
        ReaderHolder holder = new ReaderHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(ReaderHolder holder, final int position) {
        final Data data = readerList.get(position);
        holder.readerTextName.setText(data.getName());
        holder.readerItemId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String linkName = data.getLinkName();
                String server = data.getServer();
                int p = position;

                Bundle bundle = new Bundle();
                bundle.putString("reader_position",p + "");
                bundle.putString("reader_link",linkName);
                bundle.putString("server",server);

                FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SuratsFragment suratsFragment = new SuratsFragment();
                suratsFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.content_home,suratsFragment);
                fragmentTransaction.commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        return readerList.size();
    }

    public class ReaderHolder extends RecyclerView.ViewHolder{

        public TextView readerTextName;
        public LinearLayout readerItemId;

        public ReaderHolder(View itemView) {
            super(itemView);

            readerTextName = (TextView) itemView.findViewById(R.id.readerTextName);
            readerItemId = (LinearLayout) itemView.findViewById(R.id.readerItemId);
        }
    }
}
