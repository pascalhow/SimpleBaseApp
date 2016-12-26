package com.pascalhow.baseapp.NewFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.pascalhow.baseapp.MainActivity;
import com.pascalhow.baseapp.R;

import butterknife.ButterKnife;

/**
 * Created by pascal on 25/12/2016.
 */

public class NewFragment extends Fragment {

    private MainActivity mainActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_new, container, false);

        ButterKnife.bind(this, rootView);

        mainActivity = (MainActivity) getActivity();
        mainActivity.setTitle(R.string.new_screen_fragment_title);
        mainActivity.hideFloatingActionButton();

        setHasOptionsMenu(true);

        return rootView;
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        MenuItem item = menu.findItem(R.id.action_settings);
        item.setVisible(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_settings:
                //  Save new trip
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
