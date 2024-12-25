package com.stamasoftlab.playstoreclone_withtabnav.Children;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stamasoftlab.playstoreclone_withtabnav.R;

import java.util.ArrayList;


public class ChildrenFragment extends Fragment {

    private ArrayList<Integer> imageView = new ArrayList<>();
    private ArrayList<String> title = new ArrayList<>();
    private ArrayList<String> textViewRating = new ArrayList<>();


    private ArrayList<Integer> imageView2 = new ArrayList<>();
    private ArrayList<String> title2 = new ArrayList<>();
    private ArrayList<String> textViewRating2= new ArrayList<>();

    private ArrayList<Integer> imageView3 = new ArrayList<>();
    private ArrayList<String> title3 = new ArrayList<>();
    private ArrayList<String> textViewRating3= new ArrayList<>();

    private ArrayList<Integer> imageView4 = new ArrayList<>();
    private ArrayList<String> title4 = new ArrayList<>();
    private ArrayList<String> textViewRating4= new ArrayList<>();

    private ArrayList<Integer> imageView5 = new ArrayList<>();
    private ArrayList<String> title5 = new ArrayList<>();
    private ArrayList<String> textViewRating5= new ArrayList<>();
    View root;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.children_fragment, container, false);

        initRecyclerView();
        initRecyclerView2();
        initRecyclerView3();
        initRecyclerView4();
        initRecyclerView5();

        return root;
    }




    private void initRecyclerView(){

        //List Vertical
        RecyclerView recyclerView = root.findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ChildrenAdapter adapter = new ChildrenAdapter(getActivity(), imageView, title, textViewRating);
        recyclerView.setAdapter(adapter);




        title.add("Block Blast");
        textViewRating.add("3.9★");
        imageView.add(R.drawable.block_blast);


        title.add("Water Sort Puzzle");
        textViewRating.add("4.2★");
        imageView.add(R.drawable.water);


        title.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating.add("4.5★");
        imageView.add(R.drawable.sudoku);

        title.add("Royal Match");
        textViewRating.add("4.5★");
        imageView.add(R.drawable.royal);


        title.add("Candy Crush saga");
        textViewRating.add("4.4★");
        imageView.add(R.drawable.crush);



        title.add("Block Blast");
        textViewRating.add("3.9★");
        imageView.add(R.drawable.block_blast);


        title.add("Water Sort Puzzle");
        textViewRating.add("4.2★");
        imageView.add(R.drawable.water);


        title.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating.add("4.5★");
        imageView.add(R.drawable.sudoku);

        title.add("Royal Match");
        textViewRating.add("4.5★");
        imageView.add(R.drawable.royal);


        title.add("Candy Crush saga");
        textViewRating.add("4.4★");
        imageView.add(R.drawable.crush);

        title.add("Block Blast");
        textViewRating.add("3.9★");
        imageView.add(R.drawable.block_blast);


        title.add("Water Sort Puzzle");
        textViewRating.add("4.2★");
        imageView.add(R.drawable.water);


        title.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating.add("4.5★");
        imageView.add(R.drawable.sudoku);

        title.add("Royal Match");
        textViewRating.add("4.5★");
        imageView.add(R.drawable.royal);


        title.add("Candy Crush saga");
        textViewRating.add("4.4★");
        imageView.add(R.drawable.crush);





    }




    private void initRecyclerView2(){

        //List Vertical
        RecyclerView recyclerView2 = root.findViewById(R.id.rv2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager);

        ChildrenAdapter adapter2 = new ChildrenAdapter(getActivity(), imageView2, title2, textViewRating2);
        recyclerView2.setAdapter(adapter2);


        title2.add("Royal Match");
        textViewRating2.add("4.5★");
        imageView2.add(R.drawable.royal);


        title2.add("Candy Crush saga");
        textViewRating2.add("4.4★");
        imageView2.add(R.drawable.crush);

        title2.add("Block Blast");
        textViewRating2.add("3.9★");
        imageView2.add(R.drawable.block_blast);


        title2.add("Water Sort Puzzle");
        textViewRating2.add("4.2★");
        imageView2.add(R.drawable.water);


        title2.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating2.add("4.5★");
        imageView2.add(R.drawable.sudoku);





        title2.add("Block Blast");
        textViewRating2.add("3.9★");
        imageView2.add(R.drawable.block_blast);


        title2.add("Water Sort Puzzle");
        textViewRating2.add("4.2★");
        imageView2.add(R.drawable.water);


        title2.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating2.add("4.5★");
        imageView2.add(R.drawable.sudoku);

        title2.add("Royal Match");
        textViewRating2.add("4.5★");
        imageView2.add(R.drawable.royal);


        title2.add("Candy Crush saga");
        textViewRating2.add("4.4★");
        imageView2.add(R.drawable.crush);

        title2.add("Block Blast");
        textViewRating2.add("3.9★");
        imageView2.add(R.drawable.block_blast);


        title2.add("Water Sort Puzzle");
        textViewRating2.add("4.2★");
        imageView2.add(R.drawable.water);


        title2.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating2.add("4.5★");
        imageView2.add(R.drawable.sudoku);

        title2.add("Royal Match");
        textViewRating2.add("4.5★");
        imageView2.add(R.drawable.royal);


        title2.add("Candy Crush saga");
        textViewRating2.add("4.4★");
        imageView2.add(R.drawable.crush);





    }


    private void initRecyclerView3(){

        //List Vertical
        RecyclerView recyclerView3 = root.findViewById(R.id.rv3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(layoutManager);

        ChildrenAdapter adapter3 = new ChildrenAdapter(getActivity(), imageView3, title3, textViewRating3);
        recyclerView3.setAdapter(adapter3);


        title3.add("Candy Crush saga");
        textViewRating3.add("4.4★");
        imageView3.add(R.drawable.crush);


        title3.add("Royal Match");
        textViewRating3.add("4.5★");
        imageView3.add(R.drawable.royal);



        title3.add("Block Blast");
        textViewRating3.add("3.9★");
        imageView3.add(R.drawable.block_blast);


        title3.add("Water Sort Puzzle");
        textViewRating3.add("4.2★");
        imageView3.add(R.drawable.water);


        title3.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating3.add("4.5★");
        imageView3.add(R.drawable.sudoku);





        title3.add("Block Blast");
        textViewRating3.add("3.9★");
        imageView3.add(R.drawable.block_blast);


        title3.add("Water Sort Puzzle");
        textViewRating3.add("4.2★");
        imageView3.add(R.drawable.water);


        title3.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating3.add("4.5★");
        imageView3.add(R.drawable.sudoku);

        title3.add("Royal Match");
        textViewRating3.add("4.5★");
        imageView3.add(R.drawable.royal);


        title3.add("Candy Crush saga");
        textViewRating3.add("4.4★");
        imageView3.add(R.drawable.crush);

        title3.add("Block Blast");
        textViewRating3.add("3.9★");
        imageView3.add(R.drawable.block_blast);


        title3.add("Water Sort Puzzle");
        textViewRating3.add("4.2★");
        imageView3.add(R.drawable.water);


        title3.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating3.add("4.5★");
        imageView3.add(R.drawable.sudoku);

        title3.add("Royal Match");
        textViewRating3.add("4.5★");
        imageView3.add(R.drawable.royal);


        title3.add("Candy Crush saga");
        textViewRating3.add("4.4★");
        imageView3.add(R.drawable.crush);








    }


    private void initRecyclerView4(){

        //List Vertical
        RecyclerView recyclerView3 = root.findViewById(R.id.rv4);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(layoutManager);

        ChildrenAdapter adapter3 = new ChildrenAdapter(getActivity(), imageView4, title4, textViewRating4);
        recyclerView3.setAdapter(adapter3);


        title4.add("Royal Match");
        textViewRating4.add("4.5★");
        imageView4.add(R.drawable.royal);


        title4.add("Candy Crush saga");
        textViewRating4.add("4.4★");
        imageView4.add(R.drawable.crush);

        title4.add("Block Blast");
        textViewRating4.add("3.9★");
        imageView4.add(R.drawable.block_blast);


        title4.add("Water Sort Puzzle");
        textViewRating4.add("4.2★");
        imageView4.add(R.drawable.water);


        title4.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating4.add("4.5★");
        imageView4.add(R.drawable.sudoku);





        title4.add("Block Blast");
        textViewRating4.add("3.9★");
        imageView4.add(R.drawable.block_blast);


        title4.add("Water Sort Puzzle");
        textViewRating4.add("4.2★");
        imageView4.add(R.drawable.water);


        title4.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating4.add("4.5★");
        imageView4.add(R.drawable.sudoku);

        title4.add("Royal Match");
        textViewRating4.add("4.5★");
        imageView4.add(R.drawable.royal);


        title4.add("Candy Crush saga");
        textViewRating4.add("4.4★");
        imageView4.add(R.drawable.crush);

        title4.add("Block Blast");
        textViewRating4.add("3.9★");
        imageView4.add(R.drawable.block_blast);


        title4.add("Water Sort Puzzle");
        textViewRating4.add("4.2★");
        imageView4.add(R.drawable.water);


        title4.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating4.add("4.5★");
        imageView4.add(R.drawable.sudoku);

        title4.add("Royal Match");
        textViewRating4.add("4.5★");
        imageView4.add(R.drawable.royal);


        title4.add("Candy Crush saga");
        textViewRating4.add("4.4★");
        imageView4.add(R.drawable.crush);







    }


    private void initRecyclerView5(){

        //List Vertical
        RecyclerView recyclerView3 = root.findViewById(R.id.rv5);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(layoutManager);

        ChildrenAdapter adapter3 = new ChildrenAdapter(getActivity(), imageView5, title5, textViewRating5);
        recyclerView3.setAdapter(adapter3);

        title5.add("Block Blast");
        textViewRating5.add("3.9★");
        imageView5.add(R.drawable.block_blast);

        title5.add("Royal Match");
        textViewRating5.add("4.5★");
        imageView5.add(R.drawable.royal);


        title5.add("Candy Crush saga");
        textViewRating5.add("4.4★");
        imageView5.add(R.drawable.crush);




        title5.add("Water Sort Puzzle");
        textViewRating5.add("4.2★");
        imageView5.add(R.drawable.water);


        title5.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating5.add("4.5★");
        imageView5.add(R.drawable.sudoku);





        title5.add("Block Blast");
        textViewRating5.add("3.9★");
        imageView5.add(R.drawable.block_blast);


        title5.add("Water Sort Puzzle");
        textViewRating5.add("4.2★");
        imageView5.add(R.drawable.water);


        title5.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating5.add("4.5★");
        imageView5.add(R.drawable.sudoku);

        title5.add("Royal Match");
        textViewRating5.add("4.5★");
        imageView5.add(R.drawable.royal);


        title5.add("Candy Crush saga");
        textViewRating5.add("4.4★");
        imageView5.add(R.drawable.crush);

        title5.add("Block Blast");
        textViewRating5.add("3.9★");
        imageView5.add(R.drawable.block_blast);


        title5.add("Water Sort Puzzle");
        textViewRating5.add("4.2★");
        imageView5.add(R.drawable.water);


        title5.add("Sudoku- Classic Sudoku Puzzle");
        textViewRating5.add("4.5★");
        imageView5.add(R.drawable.sudoku);

        title5.add("Royal Match");
        textViewRating5.add("4.5★");
        imageView5.add(R.drawable.royal);


        title5.add("Candy Crush saga");
        textViewRating5.add("4.4★");
        imageView5.add(R.drawable.crush);








    }



}