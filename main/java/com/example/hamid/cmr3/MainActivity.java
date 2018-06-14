package com.example.hamid.cmr3;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this, MainChat.class);
                MainActivity.this.startActivity(m);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //start diffrent activty on image click
        imageClick2();
        imageClick3();
        imageClick4();
        imageClick5();
        //Strech the image to fill screen
         imageFit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //method to strech the image
    private void imageFit() {
        ImageView imageview;
        imageview = (ImageView) findViewById(R.id.image_1);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.image_2);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.image_3);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.image_4);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
        imageview = (ImageView) findViewById(R.id.image_5);
        imageview.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    ImageView img;

    private void imageClick2() {
        img = (ImageView) findViewById(R.id.image_2);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, ScrollingActivity_1.class);
                MainActivity.this.startActivity(myIntent);

            }
        });
    }

    private void imageClick3() {
        img = (ImageView) findViewById(R.id.image_3);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Main3Activity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }

    private void imageClick4() {
        img = (ImageView) findViewById(R.id.image_4);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }

    private void imageClick5() {
        img = (ImageView) findViewById(R.id.image_5);

        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MainHelpActivity.class);
                MainActivity.this.startActivity(myIntent);
            }

        });
    }
}
