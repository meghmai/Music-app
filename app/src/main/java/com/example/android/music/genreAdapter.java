package com.example.android.music;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class genreAdapter extends ArrayAdapter<Word> {
    private Context context = getContext();

    public genreAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_genre, parent, false);
            Word currentWord = getItem(position);
            ImageView background = (ImageView) listItemView.findViewById(R.id.genre_1);
            background.setImageResource(currentWord.getMimg1());
            ImageView mood = (ImageView) listItemView.findViewById(R.id.genre_2);
            mood.setImageResource(currentWord.getMimg2());
            TextView genre = (TextView) listItemView.findViewById(R.id.genre_text);
            genre.setText(currentWord.getMtitle());
            final Intent itemIntent = new Intent(context, detailsActivity.class);
            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(itemIntent);
                }
            });
        }
        return listItemView;
    }
}
