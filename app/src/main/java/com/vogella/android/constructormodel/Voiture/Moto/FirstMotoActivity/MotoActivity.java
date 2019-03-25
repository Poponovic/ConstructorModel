package com.vogella.android.constructormodel.Voiture.Moto.FirstMotoActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.Model.MarqueMoto;
import com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.MotoActivitySecond;

import java.util.ArrayList;
import java.util.List;

public class MotoActivity extends Activity {
    private RecyclerView recyclerView_moto;
    private RecyclerView.Adapter mAdapter_moto;
    private RecyclerView.LayoutManager layoutManager_moto;
    private Button playbutton_moto;
    Integer id;

    List<MarqueMoto> listMarqueMoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);
        recyclerView_moto = (RecyclerView) findViewById(R.id.my_recycler_view);

        playbutton_moto = (Button) findViewById(R.id.buttonmoto);
        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView

        listMarqueMoto = new ArrayList<>();
        listMarqueMoto.add(new MarqueMoto("Aprilia", 845));
        listMarqueMoto.add(new MarqueMoto("BMW", 452));
        listMarqueMoto.add(new MarqueMoto("Ducati", 568));
        listMarqueMoto.add(new MarqueMoto("Harley Davidson", 3888));
        listMarqueMoto.add(new MarqueMoto("Honda", 474));
        listMarqueMoto.add(new MarqueMoto("Indian", 1768));
        listMarqueMoto.add(new MarqueMoto("Kawasaki", 510));
        listMarqueMoto.add(new MarqueMoto("KTM", 596));
        listMarqueMoto.add(new MarqueMoto("Indian", 1768));
        listMarqueMoto.add(new MarqueMoto("Moto-Guzzi", 574));
        listMarqueMoto.add(new MarqueMoto("MV-Augusta", 2536));
        listMarqueMoto.add(new MarqueMoto("Suzuki", 509));
        listMarqueMoto.add(new MarqueMoto("Triumph", 565));
        listMarqueMoto.add(new MarqueMoto("Yamaha", 564));


        recyclerView_moto.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager_moto = new LinearLayoutManager(this);
        recyclerView_moto.setLayoutManager(layoutManager_moto);

        mAdapter_moto = new MyAdapterMoto(listMarqueMoto, new MyAdapterMoto.OnItemClickListener() {
            @Override
            public void onItemClick(MarqueMoto item) {
                Intent button = new Intent(MotoActivity.this, MotoActivitySecond.class);
                button.putExtra("KEY", item.getId());
                startActivity(button);
            }
        });
        recyclerView_moto.setAdapter(mAdapter_moto);
    }
}
