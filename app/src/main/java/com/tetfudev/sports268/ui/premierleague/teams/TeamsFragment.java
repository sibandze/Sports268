package com.tetfudev.sports268.ui.premierleague.teams;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tetfudev.sports268.R;

public class TeamsFragment extends Fragment {

    private TeamsViewModel teamsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        teamsViewModel =
                ViewModelProviders.of(this).get(TeamsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_table, container, false);
        final TextView textView = root.findViewById(R.id.text_table);
        teamsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}