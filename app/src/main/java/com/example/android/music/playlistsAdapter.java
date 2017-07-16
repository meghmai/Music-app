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
import android.widget.TextView;

import java.util.List;


public class playlistsAdapter extends ArrayAdapter<Word> {
    private Context context = getContext();

    public playlistsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_playlists, parent, false);
        }
        Word currentWord = getItem(position);
        TextView playlist = (TextView) listItemView.findViewById(R.id.playlist_text);
        playlist.setText(currentWord.getMtitle());
        final Intent itemIntent = new Intent(context, detailsActivity.class);
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        return listItemView;
    }
}
