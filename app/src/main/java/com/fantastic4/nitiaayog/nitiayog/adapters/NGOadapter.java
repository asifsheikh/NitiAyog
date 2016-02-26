package com.fantastic4.nitiaayog.nitiayog.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fantastic4.nitiaayog.nitiayog.NGODetails;
import com.fantastic4.nitiaayog.nitiayog.R;
import com.fantastic4.nitiaayog.nitiayog.model.NGO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin-17 on 26/2/16.
 */
public class NGOadapter extends RecyclerView.Adapter<NGOadapter.ViewHolder> {

    List<NGO> ngolist;
    NGO ngo;
    Context mContext;

    public NGOadapter(List<NGO> ngo_list,Context passedContext){

        this.mContext = passedContext;
        this.ngolist = ngo_list;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ngo_cardview,parent,false); //Inflating the layout

        ViewHolder vhItem = new ViewHolder(v,mContext); //Creating ViewHolder and passing the object of type view


        return vhItem; // Returning the created object

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(" " + ngolist.size(), "task list size");
        NGO current = ngolist.get(position);
        holder.tv_ngo_name.setText(current.getNameofNGO());
        holder.tv_ngo_state.setText(current.getState());
        holder.tv_ngo_chief.setText("" + current.getChief_person());
    }

    @Override
    public int getItemCount() {
        return ngolist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tv_ngo_name;
        public TextView tv_ngo_state;
        public TextView tv_ngo_chief;
        protected CardView card;
        private Context context;


        public ViewHolder(View itemView,Context cont) {
            super(itemView);
            tv_ngo_name = (TextView) itemView.findViewById(R.id.tv_ngo_name);
            tv_ngo_state = (TextView) itemView.findViewById(R.id.tv_state);
            tv_ngo_chief = (TextView) itemView.findViewById(R.id.tv_chief);
            card = (CardView) itemView;
            context = cont;

        }

        @Override
        public void onClick(View v) {
            Intent mainIntent = new Intent(context, NGODetails.class);
            mainIntent.putExtra(NGODetails.ARG_NGO_DETAILS,tv_ngo_name.getText());
            context.startActivity(mainIntent);

        }
    }
}
