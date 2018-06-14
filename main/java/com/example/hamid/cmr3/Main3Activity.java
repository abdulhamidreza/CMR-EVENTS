package com.example.hamid.cmr3;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button button;
    public static final String EXTRA_MESSAGE_Event_name = "pass some value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button) findViewById(R.id.button1);
        //Performing action on button click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number = "5555666";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));

                startActivity(callIntent);
            }

        });
        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regIntent = new Intent(Main3Activity.this, RegistretionActivity.class);
String message=getTitle().toString();
                regIntent.putExtra(EXTRA_MESSAGE_Event_name,message );
                Main3Activity.this.startActivity(regIntent);

            }
        });



    }

}





