package com.example.android.music;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class homeFragment extends Fragment {


    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.app_bar_main, container, false);
        ImageView trending1 = (ImageView) view.findViewById(R.id.trending_1);
        ImageView trending2 = (ImageView) view.findViewById(R.id.trending_2);
        ImageView trending3 = (ImageView) view.findViewById(R.id.trending_3);
        ImageView trending4 = (ImageView) view.findViewById(R.id.trending_4);
        ImageView trending5 = (ImageView) view.findViewById(R.id.trending_5);
        ImageView trending6 = (ImageView) view.findViewById(R.id.trending_6);
        ImageView top1 = (ImageView) view.findViewById(R.id.top_1);
        ImageView top2 = (ImageView) view.findViewById(R.id.top_2);
        ImageView top3 = (ImageView) view.findViewById(R.id.top_3);
        ImageView top4 = (ImageView) view.findViewById(R.id.top_4);
        ImageView top5 = (ImageView) view.findViewById(R.id.top_5);
        ImageView top6 = (ImageView) view.findViewById(R.id.top_6);
        ImageView new1 = (ImageView) view.findViewById(R.id.new_1);
        ImageView new2 = (ImageView) view.findViewById(R.id.new_2);
        ImageView new3 = (ImageView) view.findViewById(R.id.new_3);
        ImageView new4 = (ImageView) view.findViewById(R.id.new_4);
        ImageView new5 = (ImageView) view.findViewById(R.id.new_5);
        ImageView new6 = (ImageView) view.findViewById(R.id.new_6);
        ImageView classics1 = (ImageView) view.findViewById(R.id.classics_1);
        ImageView classics2 = (ImageView) view.findViewById(R.id.classics_2);
        ImageView classics3 = (ImageView) view.findViewById(R.id.classics_3);
        ImageView classics4 = (ImageView) view.findViewById(R.id.classics_4);
        ImageView classics5 = (ImageView) view.findViewById(R.id.classics_5);
        ImageView classics6 = (ImageView) view.findViewById(R.id.classics_6);
        final Context context = getActivity();
        final Intent itemIntent = new Intent(context, detailsActivity.class);
        trending1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        trending2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        trending3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        trending4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        trending5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        trending6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        top1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        top2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        top3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        top4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        top5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        top6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        new1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        new2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        new3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        new4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        new5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        new6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        classics1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        classics2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        classics3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        classics4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        classics5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        classics6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        return view;

    }

}
