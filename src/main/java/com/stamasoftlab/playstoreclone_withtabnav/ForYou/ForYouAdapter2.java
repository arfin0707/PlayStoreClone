package com.stamasoftlab.playstoreclone_withtabnav.ForYou;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stamasoftlab.playstoreclone_withtabnav.R;

import java.util.ArrayList;


public class ForYouAdapter2 extends RecyclerView.Adapter<ForYouAdapter2.ViewHolder>{


    private Context mContext;
    private ArrayList<Integer> imageView_top;
    private ArrayList<Integer> imageView;
    private ArrayList<String> textViewTitle ;
    private ArrayList<String> categories;
    private ArrayList<String> textViewRating;
    private ArrayList<String> AppsSize;

    public ForYouAdapter2(Context mContext, ArrayList<Integer> imageView_top, ArrayList<Integer> imageView, ArrayList<String> textViewTitle, ArrayList<String> categories, ArrayList<String> textViewRating, ArrayList<String> appsSize) {
        this.mContext = mContext;
        this.imageView_top = imageView_top;
        this.imageView = imageView;
        this.textViewTitle = textViewTitle;
        this.categories = categories;
        this.textViewRating = textViewRating;
        AppsSize = appsSize;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foryou_customlayout2, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.imageView_top.setImageResource(imageView_top.get(position));
        holder.imageView.setImageResource(imageView.get(position));
        holder.textViewTitle.setText(textViewTitle.get(position));
        holder.categories.setText(categories.get(position));
        holder.textViewRating.setText(textViewRating.get(position));
        holder.AppsSize.setText(AppsSize.get(position));

/*
        Glide.with(mContext)
                .asBitmap()
                .load(mImages_h.get(position))
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.image_h);
*/

//        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(mContext, DetailPage.class);
//
//                intent.putExtra("image_url_h", mImages_h.get(position));
//                intent.putExtra("image_name_h", mImageNames_h.get(position));
//
//                mContext.startActivity(intent);
//
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return textViewTitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView_top;
        ImageView imageView;
        TextView textViewTitle;
        TextView categories;
        TextView textViewRating;
        TextView AppsSize;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //list_Vertical
            imageView_top = itemView.findViewById(R.id.imageView_top);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            categories = itemView.findViewById(R.id.categories);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            AppsSize = itemView.findViewById(R.id.AppsSize);


            parentLayout = itemView.findViewById(R.id.parent_layout);

        }

    }
}
