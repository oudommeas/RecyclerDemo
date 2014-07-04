package com.sample.recyclerdemo.intent;

import android.content.Context;
import android.content.Intent;

import com.sample.recyclerdemo.DemoActivity;

public class DemoIntent extends Intent {
    private static final String FRAGMENT = "fragment";
    public DemoIntent(Context context, Class fragment){
        super(context, DemoActivity.class);
        putExtra(FRAGMENT, fragment);
    }

    public DemoIntent(Intent intent){
        super(intent);
    }

    public Class getFragment(){
        return (Class) getSerializableExtra(FRAGMENT);
    }
}
