package nyc.c4q.unit04mid_unitassessment.Adapters;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import nyc.c4q.unit04mid_unitassessment.Models.Books;
import nyc.c4q.unit04mid_unitassessment.R;
import nyc.c4q.unit04mid_unitassessment.Views.BooksViewHolder;

/**
 * Created by c4q on 12/20/17.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksViewHolder> {

  private List<Books> booksList;
  private Context context;
  private FragmentActivity c;


  public BooksAdapter(List<Books> booksList, FragmentActivity c) {
    this.booksList = booksList;
    this.c = c;
  }

  @Override
  public BooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View childView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.books_itemview, parent, false);
    return new BooksViewHolder(childView , c);
  }

  @Override
  public void onBindViewHolder(BooksViewHolder holder, int position) {
    Books books = booksList.get(position);
    holder.Bind(books);
  }

  @Override
  public int getItemCount() {
    return booksList.size();
  }
}
