package com.example.egerussian.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.example.egerussian.R;
import com.example.egerussian.ui.student.StudentActivity;
import com.example.egerussian.ui.teacher.TeacherActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

import java.util.SplittableRandom;

public class RegisterActivity extends AppCompatActivity {

    TextInputLayout textEmailTwo;
    TextInputLayout textPasswordTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        String[] arrayWhoAreYou = new String[] {
                "Ученик",
                "Учитель"
        };

        MaterialToolbar toolbarLogin = findViewById(R.id.toolbarLogin);
        TextInputLayout textInputLayoutWhoAreYou = findViewById(R.id.textInputLayoutWhoAreYou);
        MaterialAutoCompleteTextView autoTextViewWhoAreYou = findViewById(R.id.autoTextViewWhoAreYou);
        TextInputLayout textInputLayoutClass = findViewById(R.id.textInputLayoutClass);
        TextInputLayout textInputLayoutSchool = findViewById(R.id.textInputLayoutSchool);
        Button btnRegisterTwo = findViewById(R.id.btnRegisterTwo);


        toolbarLogin.setNavigationOnClickListener(v -> onBackPressed());


        ArrayAdapter<String> whoAreYouAdapter = new ArrayAdapter<>(
                this,
                R.layout.menu_dropdown,
                arrayWhoAreYou
        );

        autoTextViewWhoAreYou.setAdapter(whoAreYouAdapter);

       textInputLayoutWhoAreYou.getEditText().addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               return;
           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void afterTextChanged(Editable editable) {
               Log.d("Main", "Editable: "  + editable.toString());
               String typeUser = editable.toString();

               if(typeUser.equals("Ученик")){
                   textInputLayoutClass.setVisibility(View.VISIBLE);
                   textInputLayoutSchool.setVisibility(View.INVISIBLE);

               } else {
                   textInputLayoutClass.setVisibility(View.INVISIBLE);
                   textInputLayoutSchool.setVisibility(View.VISIBLE);

               }

           }
       });


       btnRegisterTwo.setOnClickListener(v -> {
           String typeUser = textInputLayoutWhoAreYou.getEditText().getText().toString();

           if(typeUser.equals("Ученик")) {
               Intent goToStudent = new Intent(RegisterActivity.this, StudentActivity.class);
               startActivity(goToStudent);
           }

           if(typeUser.equals("Учитель")) {
               Intent goToTeacher = new Intent(RegisterActivity.this, TeacherActivity.class);
               startActivity(goToTeacher);
           }


       });


    }




}