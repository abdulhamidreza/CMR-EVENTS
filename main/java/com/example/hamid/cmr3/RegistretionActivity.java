package com.example.hamid.cmr3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hamid.cmr3.MainActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegistretionActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView eventName;
    private String title;
    private EditText inputName, inputNumer, inputRegNo, inputCollage;
    private String inputGender;
    private Button btnSave;
    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;

    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registretion);


        // Displaying toolbar icon
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        //to get and set  event title
        Intent intent = getIntent();
        title = intent.getStringExtra(Main3Activity.EXTRA_MESSAGE_Event_name);
        TextView textView = (TextView) findViewById(R.id.event_title);
        textView.setText(title);

        eventName = (TextView) findViewById(R.id.event_title);
        inputName = (EditText) findViewById(R.id.name);
        inputNumer = (EditText) findViewById(R.id.number);
        inputRegNo = (EditText) findViewById(R.id.reg_number);
        inputCollage = (EditText) findViewById(R.id.collage);
        btnSave = (Button) findViewById(R.id.btn_save);

        mFirebaseInstance = FirebaseDatabase.getInstance();
        // get reference to 'users' node
        mFirebaseDatabase = mFirebaseInstance.getReference("users");



        // Save / update the user
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = inputName.getText().toString();
                String number = inputNumer.getText().toString();
                String regno = inputRegNo.getText().toString();
                String collage = inputCollage.getText().toString();
                String gender = inputGender;

                //Validate user details
                if (number.length() != 10) {
                    Toast.makeText(RegistretionActivity.this, "Enter Valid Number", Toast.LENGTH_LONG).show();
                }else {
                    // Check for already existed userId
                    if (TextUtils.isEmpty(userId)) {
                        createUser(title, name, number, regno, collage, gender);
                    } /**else {
                     updateUser(name, email);
                     }**/
                }    }
        });

        toggleButton();
    }

    // Changing button text
    private void toggleButton() {
        if (TextUtils.isEmpty(userId)) {
            btnSave.setText("Save");
        } else {
            btnSave.setText("Update");
        }
    }


    /**
     * Creating new user node under 'users'
     */
    private void createUser(String title, String name, String number, String regno, String collage, String gender) {
        // TODO
        // In real apps this userId should be fetched
        // by implementing firebase auth
        if (TextUtils.isEmpty(userId)) {
            userId = mFirebaseDatabase.push().getKey();
        }

        User user = new User(title, name, number, regno, collage, gender);

        mFirebaseDatabase.child(userId).setValue(user);

        addUserChangeListener();
    }

    /**
     * User data change listener
     */

    private void addUserChangeListener() {
        // User data change listener
        mFirebaseDatabase.child(userId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);

                // Check for null
                if (user == null) {
                    Log.e(TAG, "User data is null!");
                    return;
                }

                Log.e(TAG, "User data is changed!" + user.name + ", " + user.number);

                // Display newly updated name and email
                eventName.setText(user.name + ", " + user.number);

                // clear edit text
                inputNumer.setText("");
                inputName.setText("");

                toggleButton();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.e(TAG, "Failed to read user", error.toException());
            }
        });
    }

    private void updateUser(String name, String email) {
        // updating the user via child nodes
        if (!TextUtils.isEmpty(name)) mFirebaseDatabase.child(userId).child("name").setValue(name);

        if (!TextUtils.isEmpty(email))
            mFirebaseDatabase.child(userId).child("email").setValue(email);

    }

    public String onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_male:
                if (checked) inputGender = "male";
                break;
            case R.id.radio_female:
                if (checked) inputGender = "female";
                break;
        }
        return inputGender;
    }
}