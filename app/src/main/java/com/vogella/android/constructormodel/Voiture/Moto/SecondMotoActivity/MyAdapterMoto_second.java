package com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.Model.Moto;

import java.util.List;

public class MyAdapterMoto_second extends RecyclerView.Adapter<MyAdapterMoto_second.ViewHolder> {
    private List<Moto> values_second;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader_second;
        public TextView txtFooter_second;
        public View layout_second;

        public ViewHolder(View v) {
            super(v);
            layout_second = v;
            txtHeader_second = (TextView) v.findViewById(R.id.firstLine);
            txtFooter_second = (TextView) v.findViewById(R.id.secondLine);
        }
    }

    public void add(int position, Moto item) {
        values_second.add(position, item);
        notifyItemInserted(position);
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapterMoto_second(List<Moto> myDataset) {

        values_second = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapterMoto_second.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.row_layout_moto_second, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyAdapterMoto_second.ViewHolder vh = new MyAdapterMoto_second.ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyAdapterMoto_second.ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Moto moto = values_second.get(position);
        final String name = moto.getMake_Name();
        final String model = moto.getModel_Name();
        final Integer ID = moto.getModel_ID();
        holder.txtHeader_second.setText(name +" "+ model);
        holder.txtFooter_second.setText("ID : " + ID);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values_second.size();
    }

}

