package com.geektech.homework6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExchangeAdapter extends RecyclerView.Adapter<ExchangeAdapter.MainViewHolder> {


    ArrayList<Label> labelList;

    public ExchangeAdapter() {
        ArrayList<Label> list = new ArrayList<>();
        this.labelList = list;
    }

    public void addText(ArrayList<Label> label) {
        labelList = label;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ExchangeAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(labelList.get(position));

    }

    @Override
    public int getItemCount() {
        return labelList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView label;


        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            label = itemView.findViewById(R.id.tv_1);
        }

        public void onBind(Label label) {
            label.setText(label.label);


        }
    }

}