package com.example.egerussian.ui.teacher.theory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.egerussian.R;
import com.google.android.material.textfield.TextInputLayout;

public class TheoryTeacher {

    public static class TeacherTheory extends Fragment {
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_teacher_theory, container, false);
            return view;
        }
    }
}
