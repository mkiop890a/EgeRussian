package com.example.egerussian.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.egerussian.R;
import com.example.egerussian.ui.student.StudentActivity;
import com.example.egerussian.utils.TextValidator;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout textEmail;
    TextInputLayout textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnRegister = findViewById(R.id.btnRegister);
        textEmail = findViewById(R.id.loginEditText);
        textPassword = findViewById(R.id.textInputLayoutPassword);

        btnLogin.setOnClickListener(v -> {
            String email = textEmail.getEditText().getText().toString();
            String password = textPassword.getEditText().getText().toString();
            // & - и
            // || - или
            // ! - не
            // != - не равно

            if(!validateFields(email, password)){
                return;
            }

            Intent nameIntent = new Intent(this, StudentActivity.class);
            startActivity(nameIntent);

        });

        btnRegister.setOnClickListener(v -> startActivity(new Intent(this, RegisterActivity.class)));

    }

    private boolean validateFields(String email, String password){
        TextValidator textValidator = new TextValidator();

        return textValidator.validateText(email, textEmail) & textValidator.validateText(password, textPassword);
    }
}