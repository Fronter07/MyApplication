package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<Champion> values;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader;
        public TextView txtFooter;
        public ImageView iconChampion;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            iconChampion = (ImageView) v.findViewById(R.id.icon);
        }
    }

    public void add(int position, Champion item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListAdapter(List<Champion> myDataset, Context activity) {
        values = myDataset;
        context = activity;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.row_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Champion currentChampion = values.get(position);
        holder.txtHeader.setText(currentChampion.getName());
        holder.txtFooter.setText(currentChampion.getPosition());
        Glide.with(holder.itemView.getContext()).load(currentChampion.getIcon()).into(holder.iconChampion);
        holder.txtHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openNewActivity();
                Intent intent = new Intent(context, SecondActivity.class);

                intent.putExtra("name", currentChampion.getName());
                intent.putExtra("position", currentChampion.getPosition());
                intent.putExtra("difficulty", currentChampion.getDifficulty());
                intent.putExtra("competance", currentChampion.getCompetance());
                intent.putExtra("passif", currentChampion.getPassif());
                intent.putExtra("spell_Q", currentChampion.getSpell_Q());
                intent.putExtra("spell_Z", currentChampion.getSpell_Z());
                intent.putExtra("spell_E", currentChampion.getSpell_E());
                intent.putExtra("spell_R", currentChampion.getSpell_R());

                context.startActivity(intent);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}
