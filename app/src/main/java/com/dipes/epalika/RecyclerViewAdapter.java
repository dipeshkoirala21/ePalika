package com.dipes.epalika;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;




public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.FeatureViewHolder> {

    private Context mContext;
    private List<CardName> mFeatureList;

    RecyclerViewAdapter(Context mContext, List<CardName> mFeatureList) {
        this.mContext = mContext;
        this.mFeatureList = mFeatureList;
    }

    @NonNull
    @Override
    public FeatureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new FeatureViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final FeatureViewHolder holder, int position) {
        holder.mImage.setImageResource(mFeatureList.get(position).getFeatureImage());
        holder.mTitle.setText(mFeatureList.get(position).getFeatureName());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = holder.getAdapterPosition();
                if (id == 0) {
                    Intent mIntent = new Intent(mContext, NewsActivity.class);
                    mIntent.putExtra("Title", mFeatureList.get(holder.getAdapterPosition()).getFeatureName());
                    mIntent.putExtra("Image", mFeatureList.get(holder.getAdapterPosition()).getFeatureImage());
                    mContext.startActivity(mIntent);
                } else if (id == 1) {
                    Intent mIntent = new Intent(mContext, NewsActivity.class);
                    mIntent.putExtra("Title", mFeatureList.get(holder.getAdapterPosition()).getFeatureName());
                    mIntent.putExtra("Image", mFeatureList.get(holder.getAdapterPosition()).getFeatureImage());
                    mContext.startActivity(mIntent);
                } else if (id == 2) {
                    Intent mIntent = new Intent(mContext, NewsActivity.class);
                    mIntent.putExtra("Title", mFeatureList.get(holder.getAdapterPosition()).getFeatureName());
                    mIntent.putExtra("Image", mFeatureList.get(holder.getAdapterPosition()).getFeatureImage());
                    mContext.startActivity(mIntent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mFeatureList.size();
    }

    static class FeatureViewHolder extends RecyclerView.ViewHolder {

        ImageView mImage;
        TextView mTitle;
        CardView mCardView;

        FeatureViewHolder(View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.feature_icon);
            mTitle = itemView.findViewById(R.id.feature_name);
            mCardView = itemView.findViewById(R.id.cardview);
        }
    }
}

