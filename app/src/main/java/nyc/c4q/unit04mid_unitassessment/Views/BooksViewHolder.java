package nyc.c4q.unit04mid_unitassessment.Views;

import static android.app.PendingIntent.getActivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import nyc.c4q.unit04mid_unitassessment.Fragments.TopFragment;
import nyc.c4q.unit04mid_unitassessment.Models.Books;
import nyc.c4q.unit04mid_unitassessment.R;

/**
 * Created by c4q on 12/20/17.
 */

public class BooksViewHolder extends RecyclerView.ViewHolder {

  TextView title;
  TextView author;
  TextView year;
  FragmentActivity c;

  public BooksViewHolder(View itemView , FragmentActivity c) {
    super(itemView);
    title = itemView.findViewById(R.id.textView);
    author=itemView.findViewById(R.id.textView2);
    year = itemView.findViewById(R.id.textView3);
    this.c = c;
  }

  public void Bind(Books books) {
    title.setText(books.getTitle());
    author.setText(books.getAuthor());
    year.setText(String.valueOf(books.getYear()));
    itemView.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {

        TopFragment topFragment = new TopFragment();
        Bundle b = new Bundle();
        b.putString("Title", title.getText().toString());
        b.putString("Author",author.getText().toString());
        b.putString("Year",year.getText().toString());
        topFragment.setArguments(b);

        Context context1 = itemView.getContext();

        FragmentManager fragmentManager = c.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame1, topFragment);
        fragmentTransaction.commit();

      }
    });

  }

}
