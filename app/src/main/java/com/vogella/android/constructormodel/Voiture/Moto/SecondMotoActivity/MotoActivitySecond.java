package com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.Model.Moto;
import com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.SecondController.SecondController;

import java.util.List;

public class MotoActivitySecond<recyclerView> extends Activity {
    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    private RecyclerView recyclerView_motosecond;
    private RecyclerView.Adapter mAdapter_motosecond;
    private RecyclerView.LayoutManager layoutManager_motosecond;

    private SecondController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto_second);
        recyclerView_motosecond = (RecyclerView) findViewById(R.id.my_recycler_view);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView

        int id = getIntent().getIntExtra("KEY", 0);
        controller = new SecondController(this);
        controller.onCreate(id);
    }

    public void showList(List<Moto> listMoto){
        recyclerView_motosecond.setHasFixedSize(true);
        layoutManager_motosecond = new LinearLayoutManager(this);
        recyclerView_motosecond.setLayoutManager(layoutManager_motosecond);
        mAdapter_motosecond = new MyAdapterMoto_second(listMoto);
        recyclerView_motosecond.setAdapter(mAdapter_motosecond);
    }
}
