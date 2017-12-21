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
import nyc.c4q.unit04mid_unitassessment.Fragments.DisplayFragment;
import nyc.c4q.unit04mid_unitassessment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

  private View rootview;

  public MainFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    rootview = inflater.inflate(R.layout.fragment_main, container, false);

    Button button = rootview.findViewById(R.id.display_fragment_button);

    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        DisplayFragment displayFragment = new DisplayFragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, displayFragment);
        fragmentTransaction.addToBackStack("next");
        fragmentTransaction.commit();
      }
    });
    // Inflate the layout for this fragment
    return rootview;
  }

}
