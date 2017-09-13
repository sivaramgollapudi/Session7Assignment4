package com.sivaram.session7assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare UserName, Password & Login Button View Objects
    Button btnLogin;
    EditText txtUserName, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Login Button Reference.
        btnLogin = (Button)findViewById(R.id.btnLogin);

        // Set User Name Edit Text Reference
        txtUserName = (EditText)findViewById(R.id.txtUserName);

        // Set Password Edit Text Reference.
        txtPassword = (EditText)findViewById(R.id.txtPassword);

        // Set On Click Listener to Login Button.
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate UserName and Password.
                // If User Name is correct navigate to Next Activity via Intent and Bundle.

                if (txtUserName.getText().toString().equalsIgnoreCase("sivaram.g") &&
                        txtPassword.getText().toString().equals("1234")){ // Validate UserName and Password

                    // Create an Intent and Attach next intent on Initialization.
                    Intent welcomePageIntent = new Intent(MainActivity.this,WelcomeActivity.class);

                    // Add Login UserName to Intent which will be available to retrieve in Next Activity.
                    // Which is Welcome Activity.
                    welcomePageIntent.putExtra("UserName",txtUserName.getText().toString());

                    startActivity(welcomePageIntent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid UserName/Password...", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
