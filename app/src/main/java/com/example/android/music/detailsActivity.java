package com.example.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ArrayList<Word> recents = new ArrayList<Word>();
        recents.add(new Word(getString(R.string.track_1), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_2), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_3), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_4), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_5), getString(R.string.artist)));
        recentsAdapter itemsAdapter = new recentsAdapter(this, R.layout.list_item, recents);

        ListView listView = (ListView) findViewById(R.id.details);
        listView.setAdapter(itemsAdapter);
        try {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (Exception e) {
        }
    }
}