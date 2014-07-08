package com.sample.recyclerdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.sample.recyclerdemo.fragment.RecyclerDemo1;
import com.sample.recyclerdemo.intent.DemoIntent;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.list);
        final Class[] items = new Class[]{
                RecyclerDemo1.class
        };
        final ArrayAdapter<Class> adapter = new ArrayAdapter<Class>(this, android.R.layout.simple_list_item_1, items) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                final View view = super.getView(position, convertView, parent);
                ((TextView) view).setText(getItem(position).getSimpleName());
                return view;
            }
        };
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new DemoIntent(MainActivity.this, items[position]));
            }
        });
    }
}
