package com.tetfudev.sports268.ui.premierleague.players;

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

public class PlayersFragment extends Fragment {

    private PlayersViewModel playersViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        playersViewModel =
                ViewModelProviders.of(this).get(PlayersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_table, container, false);
        final TextView textView = root.findViewById(R.id.text_table);
        playersViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}