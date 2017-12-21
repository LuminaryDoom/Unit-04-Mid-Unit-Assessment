package nyc.c4q.unit04mid_unitassessment.Views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import nyc.c4q.unit04mid_unitassessment.Models.Books;
import nyc.c4q.unit04mid_unitassessment.R;

/**
 * Created by c4q on 12/20/17.
 */

public class BooksViewHolder extends RecyclerView.ViewHolder {

  TextView title;
  TextView author;
  TextView year;

  public BooksViewHolder(View itemView) {
    super(itemView);
    title = itemView.findViewById(R.id.textView);
    author=itemView.findViewById(R.id.textView2);
    year = itemView.findViewById(R.id.textView3);
  }

  public void Bind(Books books) {
    title.setText(books.getTitle());
    author.setText(books.getAuthor());
    year.setText(String.valueOf(books.getYear()));
  }
}
