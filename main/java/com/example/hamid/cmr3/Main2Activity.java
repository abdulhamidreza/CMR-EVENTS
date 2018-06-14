package com.example.hamid.cmr3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //call image strecher
        imageFit();
    }
        //method to strech the image
        private void imageFit() {
            ImageView imageview;
            imageview = (ImageView) findViewById(R.id.event_view_image_1);
            imageview.setScaleType(ImageView.ScaleType.FIT_XY);
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
}
