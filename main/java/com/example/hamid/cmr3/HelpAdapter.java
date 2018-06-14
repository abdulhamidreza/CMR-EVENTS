
package com.example.hamid.cmr3;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HelpAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public HelpAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    public static int f;
    @Override
    public Fragment getItem(int position) {
f=position;
        if (position == 0) {
            return new AllThreeFragment();
        } else if (position == 1) {
            return new AllThreeFragment();
        } else {
            return new AllThreeFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Tech";
        } else if (position == 1) {
            return "Coord";
        } else  {
            return "Facult";

        }
    }


}
