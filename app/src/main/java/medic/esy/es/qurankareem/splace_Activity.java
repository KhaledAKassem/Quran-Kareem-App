package medic.esy.es.qurankareem;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splace_Activity extends AppCompatActivity {

    private int sleep_timer=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
//        getSupportActionBar().hide();
        startlogolauncer logo=new startlogolauncer();
        logo.start();

    }
    private class startlogolauncer extends Thread{
        public void run(){
            try {
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent i=new Intent(splace_Activity.this,Home.class);
            startActivity(i);
            splace_Activity.this.finish();
        }
    }

}


