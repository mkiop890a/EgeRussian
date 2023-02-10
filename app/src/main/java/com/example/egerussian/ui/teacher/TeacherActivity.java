package com.example.egerussian.ui.teacher;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.egerussian.R;
import com.example.egerussian.databinding.ActivityTeacherBinding;

public class TeacherActivity extends AppCompatActivity {

    private ActivityTeacherBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTeacherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_teacher);
        NavigationUI.setupWithNavController(binding.navViewTeacher, navController);

    }


}
