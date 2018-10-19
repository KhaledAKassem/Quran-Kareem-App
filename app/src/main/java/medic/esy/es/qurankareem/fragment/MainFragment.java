package medic.esy.es.qurankareem.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import medic.esy.es.qurankareem.R;
public class MainFragment extends Fragment {
    Fragment newFragment;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.main_fragment,container,false);
        return v;
    }
    public void btnQuranHear(View view) {
        newFragment =new ReadersFragment();
        openFragment(newFragment);
    }

    public void btnFav(View view) {
        newFragment =new FavFragment();
        openFragment(newFragment);
    }

    public void btnAzkar(View view) {
        newFragment =new OtherFragment();
        openFragment(newFragment);
    }

    public void btnQuranRead(View view) {
        newFragment =new WriteSuratsFragment();
        openFragment(newFragment);
    }
    public void explainationClick(View view) {
        Intent i=new Intent(getContext(),explain.class);
        startActivity(i);
    }
    public void openFragment(Fragment f){
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_home,f);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}