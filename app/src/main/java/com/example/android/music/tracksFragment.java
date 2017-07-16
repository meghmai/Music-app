package com.example.android.music;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class tracksFragment extends Fragment {


    public tracksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_tracks, container, false);
        final ArrayList<Word> tracks = new ArrayList<Word>();
        tracks.add(new Word(getString(R.string.track_1), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_2), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_3), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_4), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_5), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_6), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_7), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_8), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_9), getString(R.string.artist)));
        tracks.add(new Word(getString(R.string.track_10), getString(R.string.artist)));
        recentsAdapter itemsAdapter = new recentsAdapter(getActivity(), R.layout.list_item, tracks);

        final ListView listView = (ListView) view.findViewById(R.id.tracks);
        listView.setAdapter(itemsAdapter);
        return view;
    }


}
