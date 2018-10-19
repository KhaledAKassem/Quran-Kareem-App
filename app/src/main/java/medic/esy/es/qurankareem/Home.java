package medic.esy.es.qurankareem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;

import medic.esy.es.qurankareem.fragment.FavFragment;
import medic.esy.es.qurankareem.fragment.MainFragment;
import medic.esy.es.qurankareem.fragment.OtherFragment;
import medic.esy.es.qurankareem.fragment.ReadersFragment;
import medic.esy.es.qurankareem.fragment.explain;


public class Home extends AppCompatActivity implements MainInterface{

    Fragment newFragment;
    private AdView mAdView;
    private TextView suratTextName;
    MainInterface mainInterface;
    CardView cardone;
    Button exit;
    public void setMainInterface(MainInterface mainInterface) {
        this.mainInterface = mainInterface;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        newFragment = new MainFragment();
        openFragment(newFragment);
        suratTextName = (TextView) findViewById(R.id.suratTextName);
    }

    public void openFragment(Fragment f){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_home,f);
        transaction.addToBackStack(null).commit();
    }

    @Override
    public void onBackPressed() {

        if (getFragmentManager().getBackStackEntryCount() > 0 ){
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    public void btnQuranHear(View view) {
        newFragment =new ReadersFragment();
        openFragment(newFragment);
    }


    public void btnFav(View view) {
        newFragment =new FavFragment();
        openFragment(newFragment);
    }

    public void closeapp(View view){
        Intent intentStartervice = new Intent(Home.this, BackgroundSoundService.class);
        stopService(intentStartervice);
        System.exit(0);
        finishAffinity();
        finish();

    }
    public void btnAzkar(View view) {
        newFragment =new OtherFragment();
        openFragment(newFragment);
    }

    public void btnQuranRead(View view) {
        Fragment4 newFragment = new Fragment4();
        newFragment.setMainInterface(this);
        openFragment(newFragment);
    }

    public void juz(View view) {
        Fragment3 newFragment = new Fragment3();
        newFragment.setMainInterface(this);
        openFragment(newFragment);
    }

    public void marker(View view) {
        Fragment8 newFragment = new Fragment8();
        newFragment.setMainInterface(this);
        openFragment(newFragment);
    }
    public void explainationClick(View view) {
        Intent i =new Intent(getApplication(),explain.class);
        startActivity(i);
    }
    @Override
    public void launchQuran(int index) {
        QuranFragment fragment = new QuranFragment();
        openFragment(fragment);
        Bundle bundle = new Bundle();
        bundle.putInt("index", index);
        fragment.setArguments(bundle);
        fragment.setMainInterface(this);
    }

    @Override
    public void hideToolBar() {
    }

    @Override
    public void showToolBar() {
    }

    @Override
    public void toggle() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(Gravity.RIGHT);
    }
}