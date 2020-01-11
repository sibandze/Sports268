package com.tetfudev.sports268.ui.premierleague.table;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tetfudev.sports268.R;

public class TableRecyclerViewAdapter extends RecyclerView.Adapter<TableRecyclerViewAdapter.TableItemViewHolder> {

    @NonNull
    @Override
    public TableItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tableRow = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_each_league_table, parent, false);
        return new TableItemViewHolder(tableRow);    }

    @Override
    public void onBindViewHolder(@NonNull TableItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TableItemViewHolder extends RecyclerView.ViewHolder {
        TextView table_pos, table_team_name, table_P, table_D, table_L, table_GF, table_GA, table_GD, table_PTS;
        ImageView table_team_logo;

        public TableItemViewHolder(@NonNull View tableRow) {
            super(tableRow);
            table_pos = tableRow.findViewById(R.id.table_pos);
            table_team_name = tableRow.findViewById(R.id.table_team_name);
            table_P  = tableRow.findViewById(R.id.table_P);
            table_D  = tableRow.findViewById(R.id.table_D);
            table_L  = tableRow.findViewById(R.id.table_L);
            table_GF  = tableRow.findViewById(R.id.table_GF);
            table_GA = tableRow.findViewById(R.id.table_GA);
            table_GD = tableRow.findViewById(R.id.table_GD);
            table_PTS = tableRow.findViewById(R.id.table_PTS);
            table_team_logo = tableRow.findViewById(R.id.table_team_logo);

            //TODO: Add click listeners for teams
        }
    }
}
