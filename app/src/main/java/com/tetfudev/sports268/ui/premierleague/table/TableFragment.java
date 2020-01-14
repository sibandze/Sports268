package com.tetfudev.sports268.ui.premierleague.table;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.tetfudev.sports268.R;
import com.tetfudev.sports268.model.PremierLeague.Team;
import com.tetfudev.sports268.viewmodel.premierleague.PremierLeagueViewModel;

import java.util.List;

public class TableFragment extends Fragment {

    private SwipeRefreshLayout swipeRefresh;
    private View root;
    private RecyclerView mRecyclerView;
    private PremierLeagueViewModel premierLeagueViewModel;
    private TableRecyclerViewAdapter mTableRecyclerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_table, container, false);
        initializationViews();
        premierLeagueViewModel =
                ViewModelProviders.of(this).get(PremierLeagueViewModel.class);
        Log.d("TableFragment", "About to populate");
        populateTable();
        swipeRefresh.setOnRefreshListener(() -> {
            populateTable();
        });
        return root;
    }

    private void initializationViews() {
        swipeRefresh = root.findViewById(R.id.table_swiperefresh);
        mRecyclerView = root.findViewById(R.id.table_recycler_view);
    }

    private void populateTable() {
        swipeRefresh.setRefreshing(true);
        premierLeagueViewModel.getLeagueTable().observe(this, new Observer<List<Team>>() {
            @Override
            public void onChanged(@Nullable List<Team> blogList) {
                swipeRefresh.setRefreshing(false);
                prepareRecyclerView(blogList);
            }
        });

    }
    private void prepareRecyclerView(List<Team> blogList) {
        mTableRecyclerAdapter = new TableRecyclerViewAdapter(blogList, getContext());
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        } else {
            mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        }
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mTableRecyclerAdapter);
        Log.d("prepareRecyclerView","adapter attatched");
        mTableRecyclerAdapter.notifyDataSetChanged();
    }
}