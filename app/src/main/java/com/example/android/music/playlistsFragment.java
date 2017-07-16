package com.example.android.music;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class playlistsFragment extends Fragment {


    public playlistsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_playlists, container, false);
        ArrayList<Word> playlists = new ArrayList<Word>();
        playlists.add(new Word(getString(R.string.playlist_1)));
        playlists.add(new Word(getString(R.string.playlist_2)));
        playlists.add(new Word(getString(R.string.playlist_3)));
        playlists.add(new Word(getString(R.string.playlist_4)));
        playlists.add(new Word(getString(R.string.playlist_5)));
        playlists.add(new Word(getString(R.string.playlist_6)));
        playlistsAdapter itemsAdapter = new playlistsAdapter(getActivity(), R.layout.grid_playlists, playlists);
        GridView gridView = (GridView) view.findViewById(R.id.playlists);
        gridView.setAdapter(itemsAdapter);
        return view;
    }

}
