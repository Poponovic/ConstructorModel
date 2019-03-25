package com.vogella.android.constructormodel.Voiture.SecondActivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.SecondActivity.Controller.MainController;
import com.vogella.android.constructormodel.Voiture.SecondActivity.model.Vehicle;

import java.util.List;

public class SecondActivity<recyclerView> extends Activity {
    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    private RecyclerView recyclerView_second;
    private RecyclerView.Adapter mAdapter_second;
    private RecyclerView.LayoutManager layoutManager_second;

    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView_second = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView

        int id = getIntent().getIntExtra("KEY", 0);
        controller = new MainController(this);
        controller.onCreate(id);
    }

    public void showList(List<Vehicle> listVehicle){
        recyclerView_second.setHasFixedSize(true);
        layoutManager_second = new LinearLayoutManager(this);
        recyclerView_second.setLayoutManager(layoutManager_second);
        mAdapter_second = new MyAdapter_second(listVehicle);
        recyclerView_second.setAdapter(mAdapter_second);
    }
}
