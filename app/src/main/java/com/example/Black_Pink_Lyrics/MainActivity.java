package com.example.Black_Pink_Lyrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intialize group objects

        //transparent status bar
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

            //link recyclerView with adapter
            RecyclerView recyclerView = findViewById(R.id.singer_group_list);
            List<SingingGroup> mList = new ArrayList<>();

                //Add List Items
                mList.add(new SingingGroup("Kill This Love", R.drawable.kill_this_love, R.drawable.pro, "Teddy Park, Yang Hyun-suk, R.Tee"));
                mList.add(new SingingGroup("Jennie - Solo", R.drawable.jennie_solo, R.drawable.pro, "Teddy Park, Park Hong-jun"));
                mList.add(new SingingGroup("Ddu-Du Ddu-Du", R.drawable.dududu, R.drawable.pro, "Teddy Park, Bekuh Boom, R.Tee"));
                mList.add(new SingingGroup("As If It's Your Last", R.drawable.as_if_its_your_last, R.drawable.pro, "Teddy, Brother Su, Choice37, Future Bounce, Lydia Paek"));
                mList.add(new SingingGroup("Stay", R.drawable.stay, R.drawable.pro, "Teddy Park, Seo Won Jin"));
                mList.add(new SingingGroup("Playing With Fire", R.drawable.playing_with_fire, R.drawable.pro, "Teddy Park and R.Tee"));
                mList.add(new SingingGroup("Boombayah", R.drawable.boombayah, R.drawable.pro, "Teddy, Future Bounce, Bekuh BOOM"));
                mList.add(new SingingGroup("Whistle", R.drawable.whistle, R.drawable.pro, "Teddy Park, Bekuh Boom, .B.I., Future Bounce"));

                    //Finish Setup
                    Adapter_SingingGroup adapter = new Adapter_SingingGroup(this, mList);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Other things here
    }
}
