package com.google.broadcast;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ASUS on 26/02/2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.mViewHolder> {
   ArrayList<HashMap<String,String>>list;
    public RecyclerAdapter(ArrayList<HashMap<String,String>> list){
        this.list=list;
    }
    public class mViewHolder extends RecyclerView.ViewHolder{
        public TextView prof,date,cont;

        public mViewHolder(View itemView) {
            super(itemView);
            prof= (TextView) itemView.findViewById(R.id.prof);
            date=(TextView)itemView.findViewById(R.id.date);
            cont=(TextView)itemView.findViewById(R.id.contenu);
        }
    }
    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {
        HashMap<String,String>map=new HashMap<>();
        map=list.get(position);
        holder.prof.setText(map.get("prof"));
        holder.date.setText(map.get("date"));
        holder.cont.setText(map.get("cont"));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
