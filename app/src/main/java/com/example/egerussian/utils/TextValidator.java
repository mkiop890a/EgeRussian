package com.example.egerussian.utils;

import com.google.android.material.textfield.TextInputLayout;

public class TextValidator {

    public boolean validateText(String text, TextInputLayout textInputLayout){
        if(text.isEmpty()) {
            textInputLayout.setError("Это поле не может быть пустым");
            return false;
        } else {
            textInputLayout.setError(null);
            return true;
        }

    }
}
