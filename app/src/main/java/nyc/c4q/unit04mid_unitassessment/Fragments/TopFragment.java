package nyc.c4q.unit04mid_unitassessment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
  private TextView textView1;
  private TextView textView2;
  private TextView textView3;


  public TopFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    rootview = inflater.inflate(R.layout.fragment_top, container, false);
    textView1 = rootview.findViewById(R.id.textView);
    textView2 = rootview.findViewById(R.id.textView2);
    textView3 = rootview.findViewById(R.id.textView3);
    Bundle bundle = getArguments();
    if(bundle != null && bundle.containsKey("Author")){
      String author = (String) bundle.getString("Author");
      textView2.setText(author);
    }
    if(bundle != null && bundle.containsKey("Title")){
      String title = (String) bundle.getString("Title");
      textView1.setText(title);
    }
    if(bundle != null && bundle.containsKey("Year")){
      String year = (String) bundle.getString("Year");
      textView3.setText(year);
    }

    return rootview;
  }

}
