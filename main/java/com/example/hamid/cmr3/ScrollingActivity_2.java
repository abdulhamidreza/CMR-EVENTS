package com.example.hamid.cmr3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScrollingActivity_2 extends AppCompatActivity {
    String title;
    int topImage;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        intent = getIntent();

        chose();
        eventSet_1();
    }

    //All event cases
    private void chose() {

        String message = intent.getStringExtra(ScrollingActivity_1.EXTRA_MESSAGE);
        switch (message) {
            case "Event1":
                title = "Event1";
                topImage = R.drawable.e_1;
                break;
            case "Event2":
                title = "Event2";
                topImage = R.drawable.e_2;
                break;

            case "Event3":
                title = "Event3";
                topImage = R.drawable.e_3;
                break;

            case "Event4":
                title = "Event4";
                topImage = R.drawable.e_4;
                break;

            case "Event5":
                title = "Event5";
                topImage = R.drawable.e_5;
                break;

            case "Event6":
                title = "Event6";
                topImage = R.drawable.e_6;
                break;

            case "Event7":
                title = "Event7";
                topImage = R.drawable.e_7;
                break;

            case "Event8":
                title = "Event8";
                topImage = R.drawable.e_8;
                break;

            case "Event9":
                title = "Event9";
                topImage = R.drawable.e_9;
                break;
            default:
                title = "CMR";
                topImage = R.drawable.e_1;

        }
    }

    //change velues
    private void eventSet_1() {
        android.widget.ImageView imageView1 = findViewById(R.id.event_1);
        imageView1.setImageResource(topImage);
        imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

                collapsingToolbarLayout.setTitle(title);
            }
        });

    }
}