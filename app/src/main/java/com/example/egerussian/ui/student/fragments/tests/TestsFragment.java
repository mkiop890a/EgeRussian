package com.example.egerussian.ui.student.fragments.tests;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.egerussian.R;

public class TestsFragment extends Fragment {
    private NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tests, container,false);

        navController = NavHostFragment.findNavController(this);

        Button accent = view.findViewById(R.id.btnTestAccent);
        Button btnTestN = view.findViewById(R.id.btnTestN);
        Button btnPrefix = view.findViewById(R.id.btnTestPrefix);
        Button btnUnstressedVerifiable = view.findViewById(R.id.btnTestUnstressedVerifiable);
        Button btnTestDictionaryWords = view.findViewById(R.id.btnTestDictionaryWords);
        Button btnTestRoots = view.findViewById(R.id.btnTestRoots);
        Button btnTestParonym = view.findViewById(R.id.btnTestParonym);
        Button btnTestNotAndNeither = view.findViewById(R.id.btnTestNotAndNeither);
        Button btnTestSpeechStyle = view.findViewById(R.id.btnTestSpeechStyle);
        Button btnMeansOfExpressionTestFragment = view.findViewById(R.id.btnTestMeansOfExpression);


        return view;
    }
}