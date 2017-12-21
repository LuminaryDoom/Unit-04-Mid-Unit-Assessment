package nyc.c4q.unit04mid_unitassessment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import nyc.c4q.unit04mid_unitassessment.JSONstring;
import nyc.c4q.unit04mid_unitassessment.Models.Books;
import nyc.c4q.unit04mid_unitassessment.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

  private View rootview;

  public TopFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    rootview = inflater.inflate(R.layout.fragment_top, container, false);



    return rootview;
  }

}
