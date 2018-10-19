package medic.esy.es.qurankareem.Fdata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import medic.esy.es.qurankareem.R;

import java.io.IOException;
import java.io.InputStream;

public class one extends AppCompatActivity {
    TextView tx,tx2;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        tx=(TextView)findViewById(R.id.part1);


        try {
            InputStream is = getAssets().open("explaination/file1" +
                    ".txt");
            int size= is.available();
            byte[]buffer=new byte[size];
            is.read(buffer);
            is.close();
            text=new String(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }

        tx.setText(text);

    }


    }



