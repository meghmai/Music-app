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
public class genreFragment extends Fragment {


    public genreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_genre, container, false);
        ArrayList<Word> genre = new ArrayList<Word>();
        genre.add(new Word(R.drawable.love_img, R.drawable.love, getString(R.string.love)));
        genre.add(new Word(R.drawable.travel_img, R.drawable.travel, getString(R.string.travel)));
        genre.add(new Word(R.drawable.cheerful_img, R.drawable.cheerful, getString(R.string.cheerful)));
        genre.add(new Word(R.drawable.dance_img, R.drawable.dance, getString(R.string.dance)));
        genre.add(new Word(R.drawable.party_img, R.drawable.party, getString(R.string.party)));
        genre.add(new Word(R.drawable.wedding_img, R.drawable.wedding, getString(R.string.wedding)));
        genreAdapter itemsAdapter = new genreAdapter(getActivity(), R.layout.grid_genre, genre);
        GridView gridView = (GridView) view.findViewById(R.id.genre);
        gridView.setAdapter(itemsAdapter);
        return view;
    }

}
