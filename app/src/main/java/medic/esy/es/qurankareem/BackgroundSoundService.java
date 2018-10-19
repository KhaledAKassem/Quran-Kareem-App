package medic.esy.es.qurankareem;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import java.io.IOException;

public class BackgroundSoundService extends Service {

    static MediaPlayer player;
    public IBinder onBind(Intent arg0) {

        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();

    }
    String url;
    public int onStartCommand(Intent intent, int flags, int startId) {

        player = new MediaPlayer();

        try{
            url = intent.getStringExtra("url");
        }catch (Exception e){}
        player.stop();
        player.reset();
        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            player.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"خطأ في التشغيل, من فضلك اعد المحاوله",Toast.LENGTH_LONG).show();
        }
        try {
            player.prepare();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            player.start();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Error please try again",Toast.LENGTH_LONG).show();
        }
        return START_STICKY;
    }
    public void onStart(Intent intent, int startId) {
        // TO DO
    }
    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }
    public static void onStop() {
        player.stop();
        player.release();

    }
    public static void onPause() {
        try{
            player.pause();

        }catch (Exception e){

        }

    }
    public static void onStart() {
        try {
          player.start();
        }catch (Exception e){}
    }
    @Override
    public void onDestroy() {
        try{
            player.stop();
            player.release();
        }catch (Exception e){}
    }
    @Override
    public void onLowMemory() {
    }
}