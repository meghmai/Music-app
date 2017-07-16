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
public class recentsFragment extends Fragment {


    public recentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recents, container, false);
        ArrayList<Word> recents = new ArrayList<Word>();
        recents.add(new Word(getString(R.string.track_1), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_2), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_3), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_4), getString(R.string.artist)));
        recents.add(new Word(getString(R.string.track_5), getString(R.string.artist)));
        recentsAdapter itemsAdapter = new recentsAdapter(getActivity(), R.layout.list_item, recents);

        ListView listView = (ListView) view.findViewById(R.id.recents);
        listView.setAdapter(itemsAdapter);
        return view;
    }
}
