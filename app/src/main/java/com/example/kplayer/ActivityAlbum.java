package com.example.kplayer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class ActivityAlbum extends AppCompatActivity {

    public static String myGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Intent intent = getIntent();
        String group_name = intent.getExtras().getString("group_name");
        Log.d("variable", group_name);

        //transparent status bar
        //Window w = getWindow();
        //w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //link recyclerView with adapter
        RecyclerView recyclerView = findViewById(R.id.album_list);
        List<SingingGroup> mList = new ArrayList<>();
//
//        myGroup = "BTS";
//    }
//        if (group_name.equals("BlackPink")) {
//        Log.d("variable", "BlackPink pressed");
//        ImageView img = (ImageView) findViewById(R.id.app_bar_image);
//        img.setImageResource(R.drawable.blackpink_banner);
//
//        mList.add(new SingingGroup("Bad Boy", R.drawable.red_velvet_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Really Bad Boy", R.drawable.bts, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Dumb", R.drawable.blackpink_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Power Up", R.drawable.twice_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Easy", R.drawable.exo_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("My girl", R.drawable.girls_generation_banner, R.drawable.pro, 5000));
//
//        myGroup = "BlackPink";
//    }
//        if (group_name.equals("Twice")) {
//        Log.d("variable", "Twice pressed");
//        ImageView img = (ImageView) findViewById(R.id.app_bar_image);
//        img.setImageResource(R.drawable.twice_banner);
//
//        mList.add(new SingingGroup("Bad Boy", R.drawable.red_velvet_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Really Bad Boy", R.drawable.bts, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Dumb", R.drawable.blackpink_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Power Up", R.drawable.twice_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Easy", R.drawable.exo_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("My girl", R.drawable.girls_generation_banner, R.drawable.pro, 5000));
//
//        myGroup = "Twice";
//    }
//        if (group_name.equals("EXO")) {
//        Log.d("variable", "EXO pressed");
//        ImageView img = (ImageView) findViewById(R.id.app_bar_image);
//        img.setImageResource(R.drawable.exo_banner);
//
//        mList.add(new SingingGroup("Bad Boy", R.drawable.red_velvet_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Really Bad Boy", R.drawable.bts, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Dumb", R.drawable.blackpink_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Power Up", R.drawable.twice_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Easy", R.drawable.exo_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("My girl", R.drawable.girls_generation_banner, R.drawable.pro, 5000));
//
//        myGroup = "EXO";
//    }
//        if (group_name.equals("Girls Generation")) {
//        Log.d("variable", "girls gen pressed");
//        ImageView img = (ImageView) findViewById(R.id.app_bar_image);
//        img.setImageResource(R.drawable.girls_generation_banner);
//
//        mList.add(new SingingGroup("Bad Boy", R.drawable.red_velvet_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Really Bad Boy", R.drawable.bts, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Dumb", R.drawable.blackpink_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Power Up", R.drawable.twice_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("Easy", R.drawable.exo_banner, R.drawable.pro, 5000));
//        mList.add(new SingingGroup("My girl", R.drawable.girls_generation_banner, R.drawable.pro, 5000));
//
//        myGroup = "Girls Generation";
//    }
//
//        if (group_name.equals("Red Velvet")) {
//            Log.d("variable", "red velvet pressed");
//            ImageView img = (ImageView) findViewById(R.id.app_bar_image);
//            img.setImageResource(R.drawable.red_velvet_banner);
//
//            mList.add(new SingingGroup("Bad Boy", R.drawable.red_velvet_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Really Bad Boy", R.drawable.bts, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Dumb", R.drawable.blackpink_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Power Up", R.drawable.twice_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Easy", R.drawable.exo_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("My girl", R.drawable.girls_generation_banner, R.drawable.pro, 5000));
//
//            myGroup = "Red Velvet";
//        }
//        if (group_name.equals("BTS")) {
//            Log.d("variable", "BTS pressed");
//            ImageView img = (ImageView) findViewById(R.id.app_bar_image);
//            img.setImageResource(R.drawable.bts);
//
//            mList.add(new SingingGroup("Bad Boy", R.drawable.red_velvet_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Really Bad Boy", R.drawable.bts, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Dumb", R.drawable.blackpink_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Power Up", R.drawable.twice_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("Easy", R.drawable.exo_banner, R.drawable.pro, 5000));
//            mList.add(new SingingGroup("My girl", R.drawable.girls_generation_banner, R.drawable.pro, 5000));


        //Finish Setup
        Adapter_Album adapter = new Adapter_Album(this, mList, myGroup);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Other things here
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);

    }

    String getMyGroup() {
        return myGroup;
    }
}
