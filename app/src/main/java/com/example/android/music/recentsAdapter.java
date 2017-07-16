package com.example.android.music;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class recentsAdapter extends ArrayAdapter<Word> {
    private Context context = getContext();

    public recentsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView track = (TextView) listItemView.findViewById(R.id.text1);
        track.setText(currentWord.getMtrack());
        TextView artist = (TextView) listItemView.findViewById(R.id.text2);
        artist.setText(currentWord.getMartist());
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Playing", Toast.LENGTH_SHORT).show();
            }
        });


        return listItemView;
    }
}
