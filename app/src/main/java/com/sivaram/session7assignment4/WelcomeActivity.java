package com.sivaram.session7assignment4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 10/09/2017.
 */

public class WelcomeActivity extends Activity {

    // Declare TextView Object
    TextView lblWelcomeUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Reference Welcome TextView Object Reference to Update Text Property
        lblWelcomeUser = (TextView)findViewById(R.id.lblWelcomeUser);

        // Retrieve Intent passed from MainActivity
        Intent getLoginDetailsIntent = getIntent();

        try {
            // Retrieve User Name from Intent.
            String readUserName = getLoginDetailsIntent.getStringExtra("UserName").toString();

            // Update UserName to Welcome TextView
            lblWelcomeUser.setText("Welcome, " + readUserName);
        }
        catch(Exception ex) {
            Toast.makeText(this, "An error occurred while reading data from intent.", Toast.LENGTH_SHORT).show();
        }
    }
}
