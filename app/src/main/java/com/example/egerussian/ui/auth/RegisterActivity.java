package com.example.egerussian.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.egerussian.R;
import com.google.android.material.appbar.MaterialToolbar;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialToolbar toolbarLogin = findViewById(R.id.toolbarLogin);

        toolbarLogin.setNavigationOnClickListener(v -> onBackPressed());

    }
}