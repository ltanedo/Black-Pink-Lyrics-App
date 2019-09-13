package com.example.Black_Pink_Lyrics;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ScrollView;

import android.graphics.Color;

public class ActivityVideoPlayer extends YouTubeBaseActivity {

    private static final String TAG = "ActivityVideoPlayer";

    YouTubePlayerView mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);

        Intent intent = getIntent();
        String songName = intent.getExtras().getString("songName");
        String urlResource = intent.getExtras().getString("urlResource");

        Log.d("screen", songName);

        Log.d(TAG, "onCreate: Starting");
        Log.d("test", songName);

        final int urlID = getResources().getIdentifier(urlResource, "string", getPackageName());

        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: done initializing");

                youTubePlayer.loadVideo(getString(urlID));
                //youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.CHROMELESS);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: failed initializing");
            }
        };

        ScrollView subView = findViewById(R.id.subView);
        final TextView textViewSubtitle = (TextView) findViewById(R.id.textViewSubtitles);
        final TextView textViewRomanji = (TextView) findViewById(R.id.songTitle);
        final TextView textViewEnglish = (TextView) findViewById(R.id.textViewGroupName);

        //initial values
        textViewRomanji.setTextColor(Color.GRAY);
        textViewEnglish.setTextColor(Color.WHITE);
        textViewSubtitle.setTextColor(Color.WHITE);
        textViewRomanji.setBackgroundColor(Color.WHITE);
        textViewEnglish.setBackgroundColor(Color.BLACK);
        textViewSubtitle.setBackgroundColor(Color.BLACK);
        textViewRomanji.setText("Romanji");
        textViewEnglish.setText("English");

        //get recource IDs
        String subtitleName = songName.replaceAll(" ", "");
        subtitleName = subtitleName.replaceAll("'", "");
        subtitleName = subtitleName.replaceAll("-", "");

        String romanjiResource = subtitleName + "_Romanji";
        String englishResource = subtitleName + "_English";
        Log.d("test", subtitleName);

        int romID = getResources().getIdentifier(romanjiResource, "string", getPackageName());
        int engID = getResources().getIdentifier(englishResource, "string", getPackageName());


        final String romSubtitles = "\n" + getString(romID);
        final String engSubtitles = "\n" + getString(engID);

        textViewSubtitle.setText(romSubtitles);

        textViewRomanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewRomanji.setTextColor(Color.GRAY);
                textViewEnglish.setTextColor(Color.WHITE);

                textViewRomanji.setBackgroundColor(Color.WHITE);
                textViewEnglish.setBackgroundColor(Color.BLACK);

                textViewSubtitle.setText(romSubtitles);
            }
        });
        textViewEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewRomanji.setTextColor(Color.WHITE);
                textViewEnglish.setTextColor(Color.GRAY);

                textViewRomanji.setBackgroundColor(Color.BLACK);
                textViewEnglish.setBackgroundColor(Color.WHITE);

                textViewSubtitle.setText(engSubtitles);
            }
        });

        Log.d(TAG, "onClick: initializing youtube player");
        mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);
    }
}
















//package com.example.kplayer;
//
//        import android.content.Intent;
//        import android.os.Bundle;
//        import android.widget.Toast;
//
//        import com.google.android.youtube.player.YouTubeBaseActivity;
//        import com.google.android.youtube.player.YouTubeInitializationResult;
//        import com.google.android.youtube.player.YouTubePlayer;
//        import com.google.android.youtube.player.YouTubePlayer.Provider;
//        import com.google.android.youtube.player.YouTubePlayerView;
//
//public class ActivityVideoPlayer extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
//
//    private static final int RECOVERY_REQUEST = 1;
//    private YouTubePlayerView youTubeView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        youTubeView = findViewById(R.id.youtube_view);
//        youTubeView.initialize(YouTubeConfig.getApiKey(), this);
//    }
//
//    @Override
//    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
//        if (!wasRestored) {
//            player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
//        }
//    }
//
//    @Override
//    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
//        if (errorReason.isUserRecoverableError()) {
//            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
//        } else {
//            String error = String.format(getString(R.string.player_error), errorReason.toString());
//            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
//        }
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == RECOVERY_REQUEST) {
//            // Retry initialization if user performed a recovery action
//            getYouTubePlayerProvider().initialize(YouTubeConfig.getApiKey(), this);
//        }
//    }
//
//    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
//        return youTubeView;
//    }
//}
