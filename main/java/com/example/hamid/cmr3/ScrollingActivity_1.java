package com.example.hamid.cmr3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ScrollingActivity_1 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "pass some value";
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //call image strecher
        imageFit();

        imageClick22();
        imageClick23();
        imageClick24();
        imageClick25();
        imageClick26();
        imageClick27();
        imageClick28();
        imageClick29();
//add after  8th image
    }

    //method to stretch the image
    private void imageFit() {
        ImageView imageview;
         //imageview = (ImageView) findViewById(R.id.event_view_image_1);
        //imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_2);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_3);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_4);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_5);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_6);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_7);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_8);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_9);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_10);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_11);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_12);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.event_view_image_13);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);

    }

    private void imageClick22() {
        img = (ImageView) findViewById(R.id.event_view_image_2);
        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event2");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }

    private void imageClick23() {
        img = (ImageView) findViewById(R.id.event_view_image_3);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event3");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }


    private void imageClick24() {
        img = (ImageView) findViewById(R.id.event_view_image_4);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event4");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }

    private void imageClick25() {
        img = (ImageView) findViewById(R.id.event_view_image_5);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event5");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }

    private void imageClick26() {
        img = (ImageView) findViewById(R.id.event_view_image_6);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event6");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }


    private void imageClick27() {
        img = (ImageView) findViewById(R.id.event_view_image_7);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event7");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }

    private void imageClick28() {
        img = (ImageView) findViewById(R.id.event_view_image_8);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event8");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }

    private void imageClick29() {
        img = (ImageView) findViewById(R.id.event_view_image_9);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity_1.this, ScrollingActivity_2.class);
                myIntent.putExtra(EXTRA_MESSAGE, "Event9");
                ScrollingActivity_1.this.startActivity(myIntent);

            }
        });
    }
}
