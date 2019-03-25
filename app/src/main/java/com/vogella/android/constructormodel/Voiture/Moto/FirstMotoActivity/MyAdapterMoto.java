package com.vogella.android.constructormodel.Voiture.Moto.FirstMotoActivity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.Model.MarqueMoto;

import java.util.List;

public class MyAdapterMoto extends RecyclerView.Adapter<MyAdapterMoto.ViewHolder> {
    private List<MarqueMoto> values;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(MarqueMoto item);
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public Button txtHeader;
        public View layout;
        public Button playbutton;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (Button) v.findViewById(R.id.buttonmoto);
            playbutton = (Button) v.findViewById(R.id.buttonmoto);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapterMoto(List<MarqueMoto> myDataset, OnItemClickListener listener) {
        values = myDataset;
        this.listener = listener;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapterMoto.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.row_layout_moto_first, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final MarqueMoto marquemoto = values.get(position);
        holder.txtHeader.setText(marquemoto.getName());
        holder.playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                listener.onItemClick(marquemoto);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}