package com.vogella.android.constructormodel.Voiture.Activity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.Model.Vehicle;

import java.util.List;

public class MyAdapter_second extends RecyclerView.Adapter<MyAdapter_second.ViewHolder> {
    private List<Vehicle> values_second;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader_second;
        public View layout_second;

        public ViewHolder(View v) {
            super(v);
            layout_second = v;
            txtHeader_second = (TextView) v.findViewById(R.id.firstLine);
        }
    }

    public void add(int position, Vehicle item) {
        values_second.add(position, item);
        notifyItemInserted(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter_second(List<Vehicle> myDataset) {

        values_second = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter_second.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.row_layout_second, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Vehicle vehicle = values_second.get(position);
        final String model = vehicle.getModel_Name();
        holder.txtHeader_second.setText(model);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values_second.size();
    }

}
