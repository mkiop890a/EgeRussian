package com.example.egerussian.ui.student.fragments.theory;

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

public class TheoryFragment extends Fragment {

    private NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_theory, container, false);

        navController = NavHostFragment.findNavController(this);

        Button accent = view.findViewById(R.id.btnTheoryAccent);
        Button btnTheoryN = view.findViewById(R.id.btnTheoryN);
        Button btnPrefix = view.findViewById(R.id.btnTheoryPrefix);
        Button btnUnstressedVerifiable = view.findViewById(R.id.btnTheoryUnstressedVerifiable);
        Button btnTheoryDictionaryWords = view.findViewById(R.id.btnTheoryDictionaryWords);
        Button btnTheoryRoots = view.findViewById(R.id.btnTheoryRoots);
        Button btnTheoryParonym = view.findViewById(R.id.btnTheoryParonym);
        Button btnTheoryNotAndNeither = view.findViewById(R.id.btnTheoryNotAndNeither);
        Button btnTheorySpeechStyle = view.findViewById(R.id.btnTheorySpeechStyle);
        Button btnTheoryMeansOfExpression = view.findViewById(R.id.btnTheoryMeansOfExpression);

        accent.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_accentFragment));
        btnTheoryN.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_spellingFragment));
        btnPrefix.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_prefixFragment));
        btnUnstressedVerifiable.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_unstressedVerifiableFragment));
        btnTheoryDictionaryWords.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_dictionaryWordsFragment));
        btnTheoryRoots.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_paronymFragment));
        btnTheoryParonym.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_paronymFragment));
        btnTheoryNotAndNeither.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_notAndNeitherFragment));
        btnTheorySpeechStyle.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_speechStyleFragment));
        btnTheoryMeansOfExpression.setOnClickListener(v -> navController.navigate(R.id.action_navigation_theory_to_meansOfExpressionFragment));

        return view;
    }
}