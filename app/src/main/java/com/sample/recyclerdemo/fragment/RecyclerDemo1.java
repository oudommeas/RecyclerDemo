package com.sample.recyclerdemo.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sample.recyclerdemo.R;
import com.sample.recyclerdemo.adapter.DemoRecyclerViewAdapter;

public class RecyclerDemo1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final Activity activity = getActivity();
        final View view = getView();
        if (view != null) {
            final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(new DemoRecyclerViewAdapter());
            recyclerView.setLayoutManager(new LinearLayoutManager(activity));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
        }
    }
}
