package com.stamasoftlab.playstoreclone_withtabnav.TopChart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stamasoftlab.playstoreclone_withtabnav.R;

import java.util.ArrayList;

public class TopChartsFragment extends Fragment {

    private ArrayList<String> title = new ArrayList<>();
    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<String> details = new ArrayList<>();
    private ArrayList<String> rating = new ArrayList<>();
    private ArrayList<String> appsize = new ArrayList<>();
    private ArrayList<String> download = new ArrayList<>();
    private ArrayList<Integer> image = new ArrayList<>();
    View root;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         root= inflater.inflate(R.layout.top_charts_fragment, container, false);


        initRecyclerView();

        return root;
    }


    private void initRecyclerView(){



        //List Vertical
        RecyclerView recyclerView = root.findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        TopChartsAdapter adapter = new TopChartsAdapter(getActivity(), title, categories, details,rating,appsize,download,image);
        recyclerView.setAdapter(adapter);




        title.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        details.add("Play now for free");
        rating.add("3.9★");
        appsize.add("91MB");
        download.add("100M+");
        image.add(R.drawable.block_blast);


        title.add("Water Sort Puzzle");
        categories.add("IEC GLobal Pty Ltd, Puzzle");
        details.add("Play now for free");
        rating.add("4.2★");
        appsize.add("96MB");
        download.add("100M+");
        image.add(R.drawable.water);


        title.add("Sudoku- Classic Sudoku Puzzle");
        categories.add("IEC GLobal Pty Ltd, Puzzle ");
        details.add("Play now for free");
        rating.add("4.5★");
        appsize.add("56MB");
        download.add("50M+");
        image.add(R.drawable.sudoku);

        title.add("Royal Match");
        categories.add("Dreams Game, Ltd, Puzzle ");
        details.add("Play now for free");
        rating.add("4.5★");
        appsize.add("148MB");
        download.add("100M+");
        image.add(R.drawable.royal);


        title.add("Candy Crush saga");
        categories.add("King, Puzzle, Match 3  ");
        details.add("Play now for free");
        rating.add("4.4★");
        appsize.add("95MB");
        download.add("1B+");
        image.add(R.drawable.crush);



        title.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        details.add("Play now for free");
        rating.add("3.9★");
        appsize.add("91MB");
        download.add("100M+");
        image.add(R.drawable.block_blast);


        title.add("Water Sort Puzzle");
        categories.add("IEC GLobal Pty Ltd, Puzzle");
        details.add("Play now for free");
        rating.add("4.2★");
        appsize.add("96MB");
        download.add("100M+");
        image.add(R.drawable.water);


        title.add("Sudoku- Classic Sudoku Puzzle");
        categories.add("IEC GLobal Pty Ltd, Puzzle ");
        details.add("Play now for free");
        rating.add("4.5★");
        appsize.add("56MB");
        download.add("50M+");
        image.add(R.drawable.sudoku);

        title.add("Royal Match");
        categories.add("Dreams Game, Ltd, Puzzle ");
        details.add("Play now for free");
        rating.add("4.5★");
        appsize.add("148MB");
        download.add("100M+");
        image.add(R.drawable.royal);


        title.add("Candy Crush saga");
        categories.add("King, Puzzle, Match 3  ");
        details.add("Play now for free");
        rating.add("4.4★");
        appsize.add("95MB");
        download.add("1B+");
        image.add(R.drawable.crush);



        title.add("Block Blast");
        categories.add("Hungry Studio, Puzzle");
        details.add("Play now for free");
        rating.add("3.9★");
        appsize.add("91MB");
        download.add("100M+");
        image.add(R.drawable.block_blast);


        title.add("Water Sort Puzzle");
        categories.add("IEC GLobal Pty Ltd, Puzzle");
        details.add("Play now for free");
        rating.add("4.2★");
        appsize.add("96MB");
        download.add("100M+");
        image.add(R.drawable.water);


        title.add("Sudoku- Classic Sudoku Puzzle");
        categories.add("IEC GLobal Pty Ltd, Puzzle ");
        details.add("Play now for free");
        rating.add("4.5★");
        appsize.add("56MB");
        download.add("50M+");
        image.add(R.drawable.sudoku);

        title.add("Royal Match");
        categories.add("Dreams Game, Ltd, Puzzle ");
        details.add("Play now for free");
        rating.add("4.5★");
        appsize.add("148MB");
        download.add("100M+");
        image.add(R.drawable.royal);


        title.add("Candy Crush saga");
        categories.add("King, Puzzle, Match 3  ");
        details.add("Play now for free");
        rating.add("4.4★");
        appsize.add("95MB");
        download.add("1B+");
        image.add(R.drawable.crush);




    }

}