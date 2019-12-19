package com.example.progmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Chiens> values;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView imageView;
        public TextView txtHeader;
        public TextView txtSecond;
        public TextView txtThird;

        public ViewHolder(View v) {
            super(v);
            txtHeader = (TextView) v.findViewById(R.id.item_titre);
            txtSecond = (TextView) v.findViewById(R.id.item_age);
            txtThird = (TextView) v.findViewById(R.id.item_race);
            imageView = (ImageView) v.findViewById(R.id.item_image);
        }
    }

    public void add(int position, Chiens item) {
        values.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        values.remove(position);
        notifyItemRemoved(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    MyAdapter(List<Chiens> myDataset) {
        this.values = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        context = parent.getContext();
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Chiens chien = values.get(position);
        Picasso.get().load("https://img.ohmymag.com/article/480/berger-australien/le-berger-australien-un-chien-a-la-mode_2795b1089670bbc13f5b4dd3f3423e18e0e0a7dd.jpg).into(holder.imageView").into(holder.imageView);
        //Picasso.with(context).load(chien.getPic()).into(holder.imageView);
        holder.txtHeader.setText(chien.getName());
        holder.txtSecond.setText(chien.getAge());
        holder.txtThird.setText(chien.getRace());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}