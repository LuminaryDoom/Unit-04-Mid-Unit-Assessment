package nyc.c4q.unit04mid_unitassessment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import nyc.c4q.unit04mid_unitassessment.Adapters.BooksAdapter;
import nyc.c4q.unit04mid_unitassessment.JSONstring;
import nyc.c4q.unit04mid_unitassessment.Models.Books;
import nyc.c4q.unit04mid_unitassessment.Models.BooksList;
import nyc.c4q.unit04mid_unitassessment.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {

  private View rootview;

  private RecyclerView recyclerView;

  public BottomFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    rootview = inflater.inflate(R.layout.fragment_bottom, container, false);

    String json = JSONstring.JSONstring;

    bookJSONparser(json);


    return rootview;
  }

  public void bookJSONparser(String jsonString) {

    try {
      BooksList booksList = new BooksList();

      List<Books> resultList = new ArrayList<>();
      JSONObject jsonObject = new JSONObject(jsonString);
      JSONArray jsonArray = jsonObject.getJSONArray("books");

      for (int i = 0; i < jsonArray.length(); i++) {
        JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
        Books books = new Books();
        books.setAuthor(jsonObject1.getString("author"));
        books.setTitle(jsonObject1.getString("title"));
        books.setYear(jsonObject1.getInt("year"));
        resultList.add(books);
      }

    recyclerView = rootview.findViewById(R.id.books_recycler);
      recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
      BooksAdapter booksAdapter = new BooksAdapter(resultList, getActivity());
      recyclerView.setAdapter(booksAdapter);
    } catch (JSONException e) {
      e.printStackTrace();
    }

  }

}
