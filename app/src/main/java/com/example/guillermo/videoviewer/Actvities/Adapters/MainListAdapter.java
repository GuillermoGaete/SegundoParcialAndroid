package com.example.guillermo.videoviewer.Actvities.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.guillermo.videoviewer.R;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.MyViewHolder> {

    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTitulo;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.txtTitulo = itemView.findViewById(R.id.textView2);
        }

        public void bindTitular(String t) {
            txtTitulo.setText(t);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MainListAdapter(String[] myDataset) {
        this.mDataset = myDataset;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, viewGroup, false);

        MyViewHolder vh = new MyViewHolder(itemView);

        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int pos) {
        String item = mDataset[pos];

        viewHolder.bindTitular(item);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

}
