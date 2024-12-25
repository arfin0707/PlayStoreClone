
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

public class ForYouAdapter3  extends RecyclerView.Adapter<com.stamasoftlab.playstoreclone_withtabnav.ForYou.ForYouAdapter3.ViewHolder>{

    public ForYouAdapter3(Context mContext, ArrayList<String> title_topchart, ArrayList<String> categories_topchart, ArrayList<String> details_topchart, ArrayList<String> rating_topchart, ArrayList<String> appsize_topchart, ArrayList<String> download_topchart, ArrayList<Integer> image_topchart) {
        this.mContext = mContext;
        this.title_topchart = title_topchart;
        this.categories_topchart = categories_topchart;
        this.details_topchart = details_topchart;
        this.rating_topchart = rating_topchart;
        this.appsize_topchart = appsize_topchart;
        this.download_topchart = download_topchart;
        this.image_topchart = image_topchart;
    }

    private Context mContext;
    private ArrayList<String> title_topchart ;
    private ArrayList<String> categories_topchart;
    private ArrayList<String> details_topchart;
    private ArrayList<String> rating_topchart;
    private ArrayList<String> appsize_topchart;
    private ArrayList<String> download_topchart;
    private ArrayList<Integer> image_topchart;

/*
    private ArrayList<String> title_topchart_3_1 ;
    private ArrayList<String> categories_topchart_3_1;
    private ArrayList<String> details_topchart_3_1;
    private ArrayList<String> rating_topchart_3_1;
    private ArrayList<String> appsize_topchart_3_1;
    private ArrayList<String> download_topchart_3_1;
    private ArrayList<Integer> image_topchart_3_1;


    private ArrayList<String> title_topchart_3_2 ;
    private ArrayList<String> categories_topchart_3_2;
    private ArrayList<String> details_topchart_3_2;
    private ArrayList<String> rating_topchart_3_2;
    private ArrayList<String> appsize_topchart_3_2;
    private ArrayList<String> download_topchart_3_2;
    private ArrayList<Integer> image_topchart_3_2;*/


    @Override
    public com.stamasoftlab.playstoreclone_withtabnav.ForYou.ForYouAdapter3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foryou_customlayout3, parent, false);
        com.stamasoftlab.playstoreclone_withtabnav.ForYou.ForYouAdapter3.ViewHolder holder = new com.stamasoftlab.playstoreclone_withtabnav.ForYou.ForYouAdapter3.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull com.stamasoftlab.playstoreclone_withtabnav.ForYou.ForYouAdapter3.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.title_topchart.setText(title_topchart.get(position));
        holder.categories_topchart.setText(categories_topchart.get(position));
        holder.details_topchart.setText(details_topchart.get(position));
        holder.rating_topchart.setText(rating_topchart.get(position));
        holder.appsize_topchart.setText(appsize_topchart.get(position));
        holder.download_topchart.setText(download_topchart.get(position));
        holder.image_topchart.setImageResource(image_topchart.get(position));

/*
        Glide.with(mContext)
                .asBitmap()
                .load(mimage_topcharts_h.get(position))
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.image_topchart_h);
*/

//        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(mContext, DetailPage.class);
//
//                intent.putExtra("image_topchart_url_h", mimage_topcharts_h.get(position));
//                intent.putExtra("image_topchart_name_h", mimage_topchartNames_h.get(position));
//
//                mContext.startActivity(intent);
//
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return title_topchart.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title_topchart;
        TextView categories_topchart;
        TextView details_topchart;
        TextView rating_topchart;
        TextView appsize_topchart;
        TextView download_topchart;
        ImageView image_topchart;

        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            //list_Vertical
            title_topchart = itemView.findViewById(R.id.textViewTitle);
            categories_topchart = itemView.findViewById(R.id.categories);
            details_topchart = itemView.findViewById(R.id.details);
            rating_topchart = itemView.findViewById(R.id.textViewRating);
            appsize_topchart = itemView.findViewById(R.id.AppsSize);
            download_topchart = itemView.findViewById(R.id.downloaded);
            image_topchart = itemView.findViewById(R.id.imageView);

            parentLayout = itemView.findViewById(R.id.parent_layout);


        }

    }
}
