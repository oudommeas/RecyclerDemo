package com.sample.recyclerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.sample.recyclerdemo.intent.DemoIntent;

public class DemoActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        final Class fragmentInfo = new DemoIntent(getIntent()).getFragment();

        setTitle(fragmentInfo.getSimpleName());

        final Fragment fragment = Fragment.instantiate(this, fragmentInfo.getName());
        final FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();
    }
}
