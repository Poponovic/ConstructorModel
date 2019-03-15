package com.vogella.android.constructormodel.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.SecondActivity.SecondActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Button playbutton;

    String constructor[] = {"Audi", "Mercedes", "BMW", "Peugeot", "Renault", "Citroen", "Rolls-Royce", "Bentley", "Ferrari", "Lamborghini"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        playbutton = (Button) findViewById(R.id.button);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<String> list = new ArrayList<>();
        int i=0;
        for (String element : constructor) {
            list.add(constructor[i]);
            i++;
        }// define an adapter
        mAdapter = new MyAdapter(list);
        recyclerView.setAdapter(mAdapter);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(button);
            }
        });
    }
}
