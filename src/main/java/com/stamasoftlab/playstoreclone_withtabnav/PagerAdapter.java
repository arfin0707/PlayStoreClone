package com.stamasoftlab.playstoreclone_withtabnav;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.stamasoftlab.playstoreclone_withtabnav.Categories.CategoriesFragment;
import com.stamasoftlab.playstoreclone_withtabnav.Children.ChildrenFragment;
import com.stamasoftlab.playstoreclone_withtabnav.ForYou.ForYouFragment;
import com.stamasoftlab.playstoreclone_withtabnav.Premium.PremiumFragment;
import com.stamasoftlab.playstoreclone_withtabnav.TopChart.TopChartsFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }



    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ForYouFragment tab1 = new ForYouFragment();
                return tab1;
            case 1:
                TopChartsFragment tab2 = new TopChartsFragment();
                return tab2;
            case 2:
                ChildrenFragment tab3 = new ChildrenFragment();
                return tab3;
            case 3:
                PremiumFragment tab4 = new PremiumFragment();
                return tab4;
            case 4:
                CategoriesFragment tab5 = new CategoriesFragment();
                return tab5;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
