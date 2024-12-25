package com.stamasoftlab.playstoreclone_withtabnav;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.stamasoftlab.playstoreclone_withtabnav.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
/*    private int[] tabIcons = {
            R.drawable.sudoku,
            R.drawable.water,
            R.drawable.crush
    };*/
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //----------------------------------------------------------------------------------------------------------
        // Set custom layout for the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setCustomView(R.layout.activity_custom_action_bar);
        }

        // Access elements in the custom action bar
        View customView = getSupportActionBar().getCustomView();
        ImageView customActionButton2 = customView.findViewById(R.id.custom_action_button2);

        // Set an OnClickListener for the action button if needed
        customActionButton2.setOnClickListener(v -> {
            Toast.makeText(this, "Action button clicked!", Toast.LENGTH_SHORT).show();
        });

        //----------------------------------------------------------------------------------------------------------
/*
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .setAnchorView(R.id.fab).show();
            }
        });*/
        //DrawerLayout drawer = findViewById(R.id.drawer_layout);
       // NavigationView navigationView = findViewById(R.id.nav_view);
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_games, R.id.nav_apps, R.id.nav_search)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        //NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
    //    NavigationUI.setupWithNavController(navigationView, navController);

        // BottomNavigationView setup
        BottomNavigationView bottomNavView  = findViewById(R.id.nav_bottom_view);
        NavigationUI.setupWithNavController(bottomNavView, navController);


//------------------------------------------------------------------------------------------------------------------------
        View navHostFragment = findViewById(R.id.nav_host_fragment_content_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);


        tabLayout.addTab(tabLayout.newTab().setText("For you"));
        tabLayout.addTab(tabLayout.newTab().setText("Top charts"));
        tabLayout.addTab(tabLayout.newTab().setText("Children"));
        tabLayout.addTab(tabLayout.newTab().setText("Premium"));
        tabLayout.addTab(tabLayout.newTab().setText("Categories"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


       // final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

/*        //-extra
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);*/



        //-extra

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                showViewPager(viewPager, navHostFragment); // Show ViewPager when a tab is selected
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

     /*    // Handle navigation item selection
       navigationView.setNavigationItemSelectedListener(item -> {
            showNavHostFragment(viewPager, navHostFragment); // Show NavHostFragment on navigation click
            return NavigationUI.onNavDestinationSelected(item, navController);
        });*/

        // Handle bottom navigation item selection
        bottomNavView.setOnItemSelectedListener(item -> {
            showNavHostFragment(viewPager, navHostFragment); // Show NavHostFragment on navigation click
            return NavigationUI.onNavDestinationSelected(item, navController);
        });


//------------------------------------------------------------------------------------------------------------------------

    }

// show which one is clicked -start
    private void showViewPager(ViewPager viewPager, View navHostFragment) {
        navHostFragment.setVisibility(View.GONE); // Hide NavHostFragment
        viewPager.setVisibility(View.VISIBLE);   // Show ViewPager
    }

    private void showNavHostFragment(ViewPager viewPager, View navHostFragment) {
        viewPager.setVisibility(View.GONE);      // Hide ViewPager
        navHostFragment.setVisibility(View.VISIBLE); // Show NavHostFragment
    }
// show which one is clicked -end


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }



}