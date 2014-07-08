package com.sample.recyclerdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sample.recyclerdemo.R;
import com.squareup.picasso.Picasso;

public class DemoRecyclerViewAdapter extends RecyclerView.Adapter<DemoRecyclerViewAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.mText.setText(String.format("Image #%s", position));
        Picasso.with(viewHolder.mText.getContext()).load("http://lorempixel.com/400/200/sports/?" + position).fit().into(viewHolder.mImage);
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mText;
        private ImageView mImage;

        public ViewHolder(View itemView) {
            super(itemView);
            mText = (TextView) itemView.findViewById(R.id.text);
            mImage = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
