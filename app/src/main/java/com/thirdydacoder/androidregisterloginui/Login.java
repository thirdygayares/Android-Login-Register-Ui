package com.thirdydacoder.androidregisterloginui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {


    EditText inputEmail, inputPassword;
    TextView btnForgotPassword, btnRegister;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initiate login
        inputEmail = findViewById(R.id.input_email);
        inputPassword = findViewById(R.id.input_password);
        btnForgotPassword = findViewById(R.id.btn_forgot_password);
        btnRegister = findViewById(R.id.btn_register);
        btnLogin = findViewById(R.id.btn_login);


        //FUnction for direct page to forgot Password Page
        forgotPassword();

        //function for direct page to  register page
        register();

        //function for login
        login();

    }

    private void forgotPassword() {

    }

    private void register(){

    }


    private void login(){

        //create click lister on login button
        btnLogin.setOnClickListener(v -> {

            //fetch the text of email and password
            String email = inputEmail.getText().toString();
            String password = inputPassword.getText().toString();

            //create an error handling
            if (email.equals("")){
                inputEmail.setError("Email is Required");
                return;
            }

            if (password.equals("")){
                inputPassword.setError("Password is Required");
                return;
            }

            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();

            //TODO SET LOGIC FOR LOGIN

        });


    }
}
