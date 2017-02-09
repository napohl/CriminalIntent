package com.csci448.npohl.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Nate on 2/8/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
