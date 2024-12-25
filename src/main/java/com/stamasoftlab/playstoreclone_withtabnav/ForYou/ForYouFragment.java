package com.stamasoftlab.playstoreclone_withtabnav.ForYou;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stamasoftlab.playstoreclone_withtabnav.Children.ChildrenAdapter;
import com.stamasoftlab.playstoreclone_withtabnav.R;
import com.stamasoftlab.playstoreclone_withtabnav.TopChart.TopChartsAdapter;

import java.util.ArrayList;


public class ForYouFragment extends Fragment {


    private ArrayList<Integer> imageView_top= new ArrayList<>();
    private ArrayList<Integer> imageView= new ArrayList<>();
    private ArrayList<String> textViewTitle= new ArrayList<>() ;
    private ArrayList<String> categories= new ArrayList<>();
    private ArrayList<String> textViewRating= new ArrayList<>();
    private ArrayList<String> AppsSize= new ArrayList<>();


    private ArrayList<Integer> imageView_top2= new ArrayList<>();
    private ArrayList<Integer> imageView2= new ArrayList<>();
    private ArrayList<String> textViewTitle2= new ArrayList<>() ;
    private ArrayList<String> categories2= new ArrayList<>();
    private ArrayList<String> textViewRating2= new ArrayList<>();
    private ArrayList<String> AppsSize2= new ArrayList<>();



    private ArrayList<Integer> imageView_top3= new ArrayList<>();
    private ArrayList<Integer> imageView3= new ArrayList<>();
    private ArrayList<String> textViewTitle3= new ArrayList<>() ;
    private ArrayList<String> categories3= new ArrayList<>();
    private ArrayList<String> textViewRating3= new ArrayList<>();
    private ArrayList<String> AppsSize3= new ArrayList<>();



    private ArrayList<Integer> imageView_premium = new ArrayList<>();
    private ArrayList<String> title_premium = new ArrayList<>();
    private ArrayList<String> textViewRating_premium = new ArrayList<>();


    private ArrayList<String> title_topchart = new ArrayList<>();
    private ArrayList<String> categories_topchart = new ArrayList<>();
    private ArrayList<String> details_topchart = new ArrayList<>();
    private ArrayList<String> rating_topchart = new ArrayList<>();
    private ArrayList<String> appsize_topchart = new ArrayList<>();
    private ArrayList<String> download_topchart = new ArrayList<>();
    private ArrayList<Integer> image_topchart = new ArrayList<>();

    View root;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.for_you_fragment, container, false);

        initRecyclerView();
        initRecyclerView2();
        initRecyclerView3();
        initRecyclerViewprermium();
        initRecyclerViewtopChart();
        return root;
    }


    private void initRecyclerView(){



        //List Vertical
        RecyclerView recyclerView = root.findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ForYouAdapter adapter = new ForYouAdapter(getActivity(), imageView_top, imageView, textViewTitle,categories, textViewRating,AppsSize);
        recyclerView.setAdapter(adapter);



        imageView_top.add(R.drawable.top);
        imageView.add(R.drawable.top);
        textViewTitle.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        textViewRating.add("3.9★");
        AppsSize.add("91MB");




        imageView_top.add(R.drawable.top);
        imageView.add(R.drawable.top);
        textViewTitle.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        textViewRating.add("3.9★");
        AppsSize.add("91MB");




        imageView_top.add(R.drawable.top);
        imageView.add(R.drawable.top);
        textViewTitle.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        textViewRating.add("3.9★");
        AppsSize.add("91MB");




        imageView_top.add(R.drawable.top);
        imageView.add(R.drawable.top);
        textViewTitle.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        textViewRating.add("3.9★");
        AppsSize.add("91MB");




        imageView_top.add(R.drawable.top);
        imageView.add(R.drawable.top);
        textViewTitle.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        textViewRating.add("3.9★");
        AppsSize.add("91MB");




        imageView_top.add(R.drawable.top);
        imageView.add(R.drawable.top);
        textViewTitle.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        textViewRating.add("3.9★");
        AppsSize.add("91MB");







    }


    private void initRecyclerView2(){



        //List Vertical
        RecyclerView recyclerView = root.findViewById(R.id.rv2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ForYouAdapter adapter = new ForYouAdapter(getActivity(), imageView_top2, imageView2, textViewTitle2,categories2, textViewRating2,AppsSize2);
        recyclerView.setAdapter(adapter);



        imageView_top2.add(R.drawable.top);
        imageView2.add(R.drawable.top);
        textViewTitle2.add("Block Blast");
        categories2.add("Hungry Studio, Puzzle");
        textViewRating2.add("3.9★");
        AppsSize2.add("91MB");




        imageView_top2.add(R.drawable.top);
        imageView2.add(R.drawable.top);
        textViewTitle2.add("Block Blast");
        categories2.add("Hungry Studio, Puzzle");
        textViewRating2.add("3.9★");
        AppsSize2.add("91MB");




        imageView_top2.add(R.drawable.top);
        imageView2.add(R.drawable.top);
        textViewTitle2.add("Block Blast");
        categories2.add("Hungry Studio, Puzzle");
        textViewRating2.add("3.9★");
        AppsSize2.add("91MB");




        imageView_top2.add(R.drawable.top);
        imageView2.add(R.drawable.top);
        textViewTitle2.add("Block Blast");
        categories2.add("Hungry Studio, Puzzle");
        textViewRating2.add("3.9★");
        AppsSize2.add("91MB");




        imageView_top2.add(R.drawable.top);
        imageView2.add(R.drawable.top);
        textViewTitle2.add("Block Blast");
        categories2.add("Hungry Studio, Puzzle");
        textViewRating2.add("3.9★");
        AppsSize2.add("91MB");




        imageView_top2.add(R.drawable.top);
        imageView2.add(R.drawable.top);
        textViewTitle2.add("Block Blast");
        categories2.add("Hungry Studio, Puzzle");
        textViewRating2.add("3.9★");
        AppsSize2.add("91MB");







    }


    private void initRecyclerView3(){



        //List Vertical
        RecyclerView recyclerView = root.findViewById(R.id.rv3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ForYouAdapter2 adapter = new ForYouAdapter2(getActivity(), imageView_top3, imageView3, textViewTitle3,categories3, textViewRating3,AppsSize3);
        recyclerView.setAdapter(adapter);



        imageView_top3.add(R.drawable.top);
        imageView3.add(R.drawable.top);
        textViewTitle3.add("Block Blast");
        categories3.add("Hungry Studio, Puzzle");
        textViewRating3.add("3.9★");
        AppsSize3.add("91MB");




        imageView_top3.add(R.drawable.top);
        imageView3.add(R.drawable.top);
        textViewTitle3.add("Block Blast");
        categories3.add("Hungry Studio, Puzzle");
        textViewRating3.add("3.9★");
        AppsSize3.add("91MB");




        imageView_top3.add(R.drawable.top);
        imageView3.add(R.drawable.top);
        textViewTitle3.add("Block Blast");
        categories3.add("Hungry Studio, Puzzle");
        textViewRating3.add("3.9★");
        AppsSize3.add("91MB");




        imageView_top3.add(R.drawable.top);
        imageView3.add(R.drawable.top);
        textViewTitle3.add("Block Blast");
        categories3.add("Hungry Studio, Puzzle");
        textViewRating3.add("3.9★");
        AppsSize3.add("91MB");




        imageView_top3.add(R.drawable.top);
        imageView3.add(R.drawable.top);
        textViewTitle3.add("Block Blast");
        categories3.add("Hungry Studio, Puzzle");
        textViewRating3.add("3.9★");
        AppsSize3.add("91MB");




        imageView_top3.add(R.drawable.top);
        imageView3.add(R.drawable.top);
        textViewTitle3.add("Block Blast");
        categories3.add("Hungry Studio, Puzzle");
        textViewRating3.add("3.9★");
        AppsSize3.add("91MB");







    }



    private void initRecyclerViewprermium(){

        //List Vertical
        RecyclerView recyclerView3 = root.findViewById(R.id.rv_prermium);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(layoutManager);

        ChildrenAdapter adapter3 = new ChildrenAdapter(getActivity(), imageView_premium, title_premium, textViewRating_premium);
        recyclerView3.setAdapter(adapter3);


        imageView_premium.add(R.drawable.block_blast);
        title_premium.add("Block Blast");
        textViewRating_premium.add("3.9★");

        imageView_premium.add(R.drawable.royal);
        title_premium.add("Royal Match");
        textViewRating_premium.add("4.5★");

        imageView_premium.add(R.drawable.crush);
        title_premium.add("Candy Crush saga");
        textViewRating_premium.add("4.4★");



        imageView_premium.add(R.drawable.water);
        title_premium.add("Water Sort Puzzle");
        textViewRating_premium.add("4.2★");

        imageView_premium.add(R.drawable.sudoku);
        title_premium.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating_premium.add("4.5★");




        imageView_premium.add(R.drawable.block_blast);
        title_premium.add("Block Blast");
        textViewRating_premium.add("3.9★");

        imageView_premium.add(R.drawable.water);
        title_premium.add("Water Sort Puzzle");
        textViewRating_premium.add("4.2★");

        imageView_premium.add(R.drawable.sudoku);
        title_premium.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating_premium.add("4.5★");

        imageView_premium.add(R.drawable.royal);
        title_premium.add("Royal Match");
        textViewRating_premium.add("4.5★");

        imageView_premium.add(R.drawable.crush);
        title_premium.add("Candy Crush saga");
        textViewRating_premium.add("4.4★");

        imageView_premium.add(R.drawable.block_blast);
        title_premium.add("Block Blast");
        textViewRating_premium.add("3.9★");

        imageView_premium.add(R.drawable.water);
        title_premium.add("Water Sort Puzzle");
        textViewRating_premium.add("4.2★");

        imageView_premium.add(R.drawable.sudoku);
        title_premium.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating_premium.add("4.5★");

        imageView_premium.add(R.drawable.royal);
        title_premium.add("Royal Match");
        textViewRating_premium.add("4.5★");

        imageView_premium.add(R.drawable.crush);
        title_premium.add("Candy Crush saga");
        textViewRating_premium.add("4.4★");








    }


    private void initRecyclerViewtopChart(){



// Populate the top chart data (title_topchart and related lists)
        title_topchart.add("Block Blast");
        categories_topchart.add("Hungry Studio, Puzzle");
        details_topchart.add("Play now for free");
        rating_topchart.add("3.9★");
        appsize_topchart.add("91MB");
        download_topchart.add("100M+");
        image_topchart.add(R.drawable.block_blast);

        title_topchart.add("Water Sort Puzzle");
        categories_topchart.add("IEC GLobal Pty Ltd, Puzzle");
        details_topchart.add("Play now for free");
        rating_topchart.add("4.2★");
        appsize_topchart.add("96MB");
        download_topchart.add("100M+");
        image_topchart.add(R.drawable.water);

        title_topchart.add("Sudoku- Classic Sudoku Puzzle");
        categories_topchart.add("IEC GLobal Pty Ltd, Puzzle");
        details_topchart.add("Play now for free");
        rating_topchart.add("4.5★");
        appsize_topchart.add("56MB");
        download_topchart.add("50M+");
        image_topchart.add(R.drawable.sudoku);

        title_topchart.add("Royal Match");
        categories_topchart.add("Dreams Game, Ltd, Puzzle");
        details_topchart.add("Play now for free");
        rating_topchart.add("4.5★");
        appsize_topchart.add("148MB");
        download_topchart.add("100M+");
        image_topchart.add(R.drawable.royal);

        title_topchart.add("Candy Crush Saga");
        categories_topchart.add("King, Puzzle, Match 3");
        details_topchart.add("Play now for free");
        rating_topchart.add("4.4★");
        appsize_topchart.add("95MB");
        download_topchart.add("1B+");
        image_topchart.add(R.drawable.crush);

        //List Vertical
        RecyclerView recyclerView = root.findViewById(R.id.rv_topchart);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ForYouAdapter3 adapter = new ForYouAdapter3(getActivity(), title_topchart, categories_topchart, details_topchart,rating_topchart,appsize_topchart,download_topchart,image_topchart);
        recyclerView.setAdapter(adapter);


    }

}