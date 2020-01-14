package com.tetfudev.sports268.ui.premierleague.table;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;
import com.tetfudev.sports268.R;
import com.tetfudev.sports268.model.PremierLeague.Team;

import java.util.List;

public class TableRecyclerViewAdapter extends RecyclerView.Adapter<TableRecyclerViewAdapter.TableItemViewHolder> {

    private static final String TAG = "TableAdapter";
    private List<Team> mTeamList;
    private Context context;

    public TableRecyclerViewAdapter(List<Team> mTeamList, Context context) {
        this.mTeamList = mTeamList;
        this.context = context;
    }

    @NonNull
    @Override
    public TableItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tableRow = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_each_league_table, parent, false);
        return new TableItemViewHolder(tableRow);    }

    @Override
    public void onBindViewHolder(@NonNull TableItemViewHolder holder, int position) {
        //TODO put into account position in table for stying
        if(mTeamList==null){
            return;
        }
        Team currentTeam = mTeamList.get(position);
        holder.table_pos.setText(Integer.toString(position+1));
        holder.table_team_name.setText(currentTeam.getTeamName());
        holder.table_P.setText(Integer.toString(currentTeam.getP()));
        holder.table_D.setText(Integer.toString(currentTeam.getD()));
        holder.table_L.setText(Integer.toString(currentTeam.getL()));
        holder.table_GF.setText(Integer.toString(currentTeam.getGF()));
        holder.table_GA.setText(Integer.toString(currentTeam.getGA()));
        holder.table_GD.setText(Integer.toString(currentTeam.getGD()));
        holder.table_PTS.setText(Integer.toString(currentTeam.getPTS()));
        Glide.with(context)
                .load(currentTeam.getTeamLogoUrl())
                .into(holder.table_team_logo);
    }

    @Override
    public int getItemCount() {
        return mTeamList.size();
    }

    public class TableItemViewHolder extends RecyclerView.ViewHolder {
        MaterialButton table_pos;
        TextView table_team_name, table_P, table_D, table_L, table_GF, table_GA, table_GD, table_PTS;
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
