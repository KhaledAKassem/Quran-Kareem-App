package medic.esy.es.qurankareem.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import medic.esy.es.qurankareem.Fdata.explainviewweb;
import medic.esy.es.qurankareem.R;
import medic.esy.es.qurankareem.model.suratNameExplaination;

/**
 * Created by khaled on 25/09/18.
 */

public class ExplainationAdapter extends RecyclerView.Adapter<ExplainationAdapter.ViewHolder>{

    private List<suratNameExplaination>listItems;
    private Context context;
    String data="";

    public ExplainationAdapter(List<suratNameExplaination> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.explaincard,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


        suratNameExplaination modelObject=listItems.get(position);
        holder.suratName.setText(modelObject.getSuratNameExplaination());
        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(position== 0 ){
                    data="http://www.imadislam.com/tafsir/001.htm";

                }
                else if(position== 1){
                    data="http://www.imadislam.com/tafsir/002_01.htm";
                }
                else if(position== 2){
                    data="http://www.imadislam.com/tafsir/003_01.htm";
                }
                else if(position== 3){
                    data="http://www.imadislam.com/tafsir/004_01.htm";
                }
                else if(position== 4){
                    data="http://www.imadislam.com/tafsir/005_01.htm";
                }
                else if(position== 5){
                    data="http://www.imadislam.com/tafsir/006_01.htm";
                }
                else if(position== 6){
                    data="http://www.imadislam.com/tafsir/007_01.htm";
                }
                else if(position== 7){
                    data="http://www.imadislam.com/tafsir/008_01.htm";
                } else if(position== 8){
                    data="http://www.imadislam.com/tafsir/009_01.htm";
                }
                else if(position== 9){
                    data="http://www.imadislam.com/tafsir/010_01.htm";
                }
                else if(position== 10){
                    data="http://www.imadislam.com/tafsir/011_01.htm";
                }
                else if(position== 11){
                    data="http://www.imadislam.com/tafsir/012_01.htm";
                }
                else if(position== 12){
                    data="http://www.imadislam.com/tafsir/013_01.htm";
                }
                else if(position== 13){
                    data="http://www.imadislam.com/tafsir/014_01.htm";
                }
                else if(position== 14){
                    data="http://www.imadislam.com/tafsir/015_01.htm";
                }
                else if(position== 15){
                    data="http://www.imadislam.com/tafsir/016_01.htm";
                }
                else if(position== 16){
                    data="http://www.imadislam.com/tafsir/017_01.htm";
                }
                else if(position== 17){
                    data="http://www.imadislam.com/tafsir/018_01.htm";
                }
                else if(position== 18){
                    data="http://www.imadislam.com/tafsir/019_01.htm";
                }
                else if(position== 19){
                    data="http://www.imadislam.com/tafsir/020_01.htm";
                }
                else if(position== 20){
                    data="http://www.imadislam.com/tafsir/021_01.htm";
                }
                else if(position== 21){
                    data="http://www.imadislam.com/tafsir/022_01.htm";
                }
                else if(position== 22){
                    data="http://www.imadislam.com/tafsir/023_01.htm";
                }
                else if(position== 23){
                    data="http://www.imadislam.com/tafsir/024_01.htm";
                }
                else if(position== 24){
                    data="http://www.imadislam.com/tafsir/025_01.htm";
                }
                else if(position== 25){
                    data="http://www.imadislam.com/tafsir/026_01.htm";
                }  else if(position== 26){
                    data="http://www.imadislam.com/tafsir/027_01.htm";
                }  else if(position== 27){
                    data="http://www.imadislam.com/tafsir/028_01.htm";
                }
                else if(position== 28){
                    data="http://www.imadislam.com/tafsir/029_01.htm";
                }
                else if(position== 29){
                    data="http://www.imadislam.com/tafsir/030_01.htm";
                }
                else if(position== 30){
                    data="http://www.imadislam.com/tafsir/031_01.htm";
                }
                else if(position== 31){
                    data="http://www.imadislam.com/tafsir/032_01.htm";
                }
                else if(position== 32){
                    data="http://www.imadislam.com/tafsir/033_01.htm";
                }
                else if(position== 33){
                    data="http://www.imadislam.com/tafsir/034_01.htm";
                }
                else if(position== 34){
                    data="http://www.imadislam.com/tafsir/035_01.htm";
                }
                else if(position== 35){
                    data="http://www.imadislam.com/tafsir/036_01.htm";
                }
                else if(position== 36){
                    data="http://www.imadislam.com/tafsir/037_01.htm";
                }
                else if(position== 37){
                    data="http://www.imadislam.com/tafsir/038_01.htm";
                }
                else if(position== 38){
                    data="http://www.imadislam.com/tafsir/039_01.htm";
                }
                else if(position== 39){
                    data="http://www.imadislam.com/tafsir/040_01.htm";
                }
                else if(position== 40){
                    data="http://www.imadislam.com/tafsir/041_01.htm";
                }
                else if(position== 41){
                    data="http://www.imadislam.com/tafsir/042_01.htm";
                }  else if(position== 42){
                    data="http://www.imadislam.com/tafsir/043_01.htm";
                }  else if(position== 43){
                    data="http://www.imadislam.com/tafsir/044_01.htm";
                }  else if(position== 44){
                    data="http://www.imadislam.com/tafsir/045_01.htm";
                }
                else if(position== 45){
                    data="http://www.imadislam.com/tafsir/046_01.htm";
                }
                else if(position== 46){
                    data="http://www.imadislam.com/tafsir/047_01.htm";
                }
                else if(position== 47){
                    data="http://www.imadislam.com/tafsir/048_01.htm";
                }
                else if(position== 48){
                    data="http://www.imadislam.com/tafsir/049_01.htm";
                }
                else if(position== 49){
                    data="http://www.imadislam.com/tafsir/050_01.htm";
                }
                else if(position==50 ){
                    data="http://www.imadislam.com/tafsir/051_01.htm";
                }  else if(position== 51){
                    data="http://www.imadislam.com/tafsir/052_01.htm";
                }  else if(position== 52){
                    data="http://www.imadislam.com/tafsir/053_01.htm";
                }  else if(position== 53){
                    data="http://www.imadislam.com/tafsir/054_01.htm";
                }  else if(position== 54){
                    data="http://www.imadislam.com/tafsir/055_01.htm";
                }  else if(position== 55){
                    data="http://www.imadislam.com/tafsir/056_01.htm";
                }  else if(position== 56){
                    data="http://www.imadislam.com/tafsir/057_01.htm";
                }  else if(position== 57){
                    data="http://www.imadislam.com/tafsir/058_01.htm";
                }
                else if(position== 58){
                    data="http://www.imadislam.com/tafsir/059_01.htm";
                }
                else if(position== 59){
                    data="http://www.imadislam.com/tafsir/060_01.htm";
                }
                else if(position== 60){
                    data="http://www.imadislam.com/tafsir/061_01.htm";
                }
                else if(position== 61){
                    data="http://www.imadislam.com/tafsir/062_01.htm";
                }
                else if(position== 62){
                    data="http://www.imadislam.com/tafsir/063_01.htm";
                }
                else if(position== 63){
                    data="http://www.imadislam.com/tafsir/064_01.htm";
                }
                else if(position== 64){
                    data="http://www.imadislam.com/tafsir/065_01.htm";
                }
                else if(position== 65){
                    data="http://www.imadislam.com/tafsir/066_01.htm";
                }
                else if(position==66){
                    data="http://www.imadislam.com/tafsir/067_01.htm";
                }
                else if(position== 67){
                    data="http://www.imadislam.com/tafsir/068_01.htm";
                }
                else if(position== 68){
                    data="http://www.imadislam.com/tafsir/069_01.htm";
                }
                else if(position== 69){
                    data="http://www.imadislam.com/tafsir/070_01.htm";
                }
                else if(position== 70){
                    data="http://www.imadislam.com/tafsir/071_01.htm";
                }
                else if(position== 71){
                    data="http://www.imadislam.com/tafsir/072_01.htm";
                }
                else if(position== 72){
                    data="http://www.imadislam.com/tafsir/073_01.htm";
                }
                else if(position== 73){
                    data="http://www.imadislam.com/tafsir/074_01.htm";
                }
                else if(position== 74){
                    data="http://www.imadislam.com/tafsir/075_01.htm";
                }
                else if(position== 75){
                    data="http://www.imadislam.com/tafsir/076_01.htm";
                }
                else if(position== 76){
                    data="http://www.imadislam.com/tafsir/077_01.htm";
                }
                else if(position== 77){
                    data="http://www.imadislam.com/tafsir/078_01.htm";
                }
                else if(position== 78){
                    data="http://www.imadislam.com/tafsir/079_01.htm";
                }
                else if(position== 79){
                    data="http://www.imadislam.com/tafsir/080_01.htm";
                }
                else if(position== 80){
                    data="http://www.imadislam.com/tafsir/081_01.htm";
                }
                else if(position== 81){
                    data="http://www.imadislam.com/tafsir/082_01.htm";
                }
                else if(position== 82){
                    data="http://www.imadislam.com/tafsir/083_01.htm";
                }
                else if(position== 83){
                    data="http://www.imadislam.com/tafsir/084_01.htm";
                }
                else if(position== 84){
                    data="http://www.imadislam.com/tafsir/085_01.htm";
                }
                else if(position== 85){
                    data="http://www.imadislam.com/tafsir/086_01.htm";
                }
                else if(position== 86){
                    data="http://www.imadislam.com/tafsir/087_01.htm";
                }
                else if(position== 87){
                    data="http://www.imadislam.com/tafsir/088_01.htm";
                }
                else if(position== 88){
                    data="http://www.imadislam.com/tafsir/089_01.htm";
                }
                else if(position== 89){
                    data="http://www.imadislam.com/tafsir/090_01.htm";
                }
                else if(position== 90){
                    data="http://www.imadislam.com/tafsir/091_01.htm";
                }
                else if(position== 91){
                    data="http://www.imadislam.com/tafsir/092_01.htm";
                }
                else if(position== 92){
                    data="http://www.imadislam.com/tafsir/093_01.htm";
                }
                else if(position== 93){
                    data="http://www.imadislam.com/tafsir/094_01.htm";
                }
                else if(position== 94){
                    data="http://www.imadislam.com/tafsir/095_01.htm";
                }
                else if(position== 95){
                    data="http://www.imadislam.com/tafsir/096_01.htm";
                }
                else if(position== 96){
                    data="http://www.imadislam.com/tafsir/097_01.htm";
                }
                else if(position== 97){
                    data="http://www.imadislam.com/tafsir/098_01.htm";
                }
                else if(position== 98){
                    data="http://www.imadislam.com/tafsir/099_01.htm";
                }
                else if(position== 99){
                    data="http://www.imadislam.com/tafsir/100_01.htm";
                }
                else if(position== 100){
                    data="http://www.imadislam.com/tafsir/101_01.htm";
                }
                else if(position== 101){
                    data="http://www.imadislam.com/tafsir/102_01.htm";
                }
                else if(position== 102){
                    data="http://www.imadislam.com/tafsir/103_01.htm";
                }
                else if(position== 103){
                    data="http://www.imadislam.com/tafsir/104_01.htm";
                }
                else if(position== 104){
                    data="http://www.imadislam.com/tafsir/105_01.htm";
                }
                else if(position== 105){
                    data="http://www.imadislam.com/tafsir/106_01.htm";
                }
                else if(position== 106){
                    data="http://www.imadislam.com/tafsir/107_01.htm";
                }
                else if(position== 107){
                    data="http://www.imadislam.com/tafsir/108_01.htm";
                }
                else if(position== 108){
                    data="http://www.imadislam.com/tafsir/109_01.htm";
                }
                else if(position== 109){
                    data="http://www.imadislam.com/tafsir/110_01.htm";
                }
                else if(position== 110){
                    data="http://www.imadislam.com/tafsir/111_01.htm";
                }
                else if(position== 111){
                    data="http://www.imadislam.com/tafsir/112_01.htm";
                }
                else if(position== 112){
                    data="http://www.imadislam.com/tafsir/113_01.htm";
                }
                else if(position== 113){
                    data="http://www.imadislam.com/tafsir/114_01.htm";
                }


                Intent i=new Intent(context,explainviewweb.class);
                i.putExtra("data",data);
                context.startActivity(i);



            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView suratName;
        private LinearLayout linear;

        public ViewHolder(View itemView) {
            super(itemView);

            suratName=(TextView)itemView.findViewById(R.id.exp);
            linear=(LinearLayout) itemView.findViewById(R.id.linear);
        }
    }



}
