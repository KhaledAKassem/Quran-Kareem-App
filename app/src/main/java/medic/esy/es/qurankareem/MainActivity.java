package medic.esy.es.qurankareem;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;






public class MainActivity extends AppCompatActivity implements MainInterface {
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (getIntent() != null) {
            if (getIntent().getIntExtra("azkar", -1) == 1) {
                getSupportActionBar().setTitle("ازكار الصباح");
                replaceFragment(new Fragment6());
            } else if (getIntent().getIntExtra("azkar", -1) == 2) {
                getSupportActionBar().setTitle("ازكار المساء");
                replaceFragment(new Fragment7());
            } else if (getIntent().getIntExtra("index", -1) != -1)
                launchQuran(getIntent().getIntExtra("index", -1));
            else {
                Fragment4 fragment4 = new Fragment4();
                fragment4.setMainInterface(this);
                replaceFragment(fragment4);
            }
        }


    }


    @Override
    protected void onStart() {
        super.onStart();

    }

    private boolean isMyServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            if (doubleBackToExitPressedOnce) {
                super.onBackPressed();
                return;
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "اضغط مره اخري للخروج", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }



    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment, "").commit();
    }

    private void closeDrawer() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    public void launchFragment3(View view) {
        Fragment3 fragment = new Fragment3();
        getSupportActionBar().setTitle("الاجزاء");
        fragment.setMainInterface(this);
        replaceFragment(fragment);
        closeDrawer();
    }

    public void launchFragment4(View view) {
        Fragment4 fragment = new Fragment4();
        getSupportActionBar().setTitle("الفهرس");
        fragment.setMainInterface(this);
        replaceFragment(fragment);
        closeDrawer();
    }

    public void launchFragment5(View view) {
        Fragment5 fragment = new Fragment5();
        fragment.setMainInterface(this);
        getSupportActionBar().setTitle("الصفحات");
        replaceFragment(fragment);
        closeDrawer();
    }

    public void launchFragment6(View view) {
        Fragment6 fragment = new Fragment6();
        fragment.setMainInterface(this);
        getSupportActionBar().setTitle("ازكار الصباح");
        replaceFragment(fragment);
        closeDrawer();
    }

    public void launchFragment7(View view) {
        getSupportActionBar().setTitle("ازكار المساء");
        Fragment7 fragment7 = new Fragment7();
        fragment7.setMainInterface(this);
        replaceFragment(fragment7);
        closeDrawer();
    }

    public void launchFragment8(View view) {
        getSupportActionBar().setTitle("علامات");
        Fragment8 fragment8 = new Fragment8();
        fragment8.setMainInterface(this);
        replaceFragment(fragment8);
        closeDrawer();
    }

    public void launchFragment9(View view) {
        getSupportActionBar().setTitle("ادعية قرانيه");
        Fragment9 fragment9 = new Fragment9();
        fragment9.setMainInterface(this);
        replaceFragment(fragment9);
        closeDrawer();
    }

    public void launchFragment10(View view) {
        Fragment10 fragment = new Fragment10();
        fragment.setMainInterface(this);
        getSupportActionBar().setTitle("دعاء ختم القران");
        replaceFragment(fragment);
        closeDrawer();
    }

    @Override
    public void launchQuran(int index) {
        QuranFragment fragment = new QuranFragment();
        replaceFragment(fragment);
        Bundle bundle = new Bundle();
        bundle.putInt("index", index);
        fragment.setArguments(bundle);
        fragment.setMainInterface(this);
        closeDrawer();
    }


    @Override
    public void hideToolBar() {
        getSupportActionBar().hide();
    }

    @Override
    public void showToolBar() {
        getSupportActionBar().show();
    }

    @Override
    public void toggle() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(Gravity.RIGHT);
    }

    public void launchFragment0(View view) {
        launchQuran(-1);
    }
}
