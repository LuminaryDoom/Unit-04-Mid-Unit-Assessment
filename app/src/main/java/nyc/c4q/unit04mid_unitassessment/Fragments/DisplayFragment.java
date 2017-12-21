package nyc.c4q.unit04mid_unitassessment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import nyc.c4q.unit04mid_unitassessment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {

  private View rootview;

  public DisplayFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment

    rootview = inflater.inflate(R.layout.fragment_display, container, false);

    TopFragment topFragment = new TopFragment();
    BottomFragment bottomFragment = new BottomFragment();

    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.frame1, topFragment);
    fragmentTransaction.replace(R.id.frame2, bottomFragment);
    fragmentTransaction.commit();

    return rootview;
  }

}
