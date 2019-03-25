package com.vogella.android.constructormodel.Voiture.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.SecondActivity.SecondActivity;
import com.vogella.android.constructormodel.Voiture.SecondActivity.model.Marque;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Button playbutton;
    Integer id;

    List<Marque> listMarque;

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

        listMarque = new ArrayList<>();
        listMarque.add(new Marque("Audi", 582));
        listMarque.add(new Marque("Alfa Roméo", 493));
        listMarque.add(new Marque("Aston Martin", 440));
        listMarque.add(new Marque("Bentley", 583));
        listMarque.add(new Marque("BMW", 452));
        listMarque.add(new Marque("Bugatti", 454));
        listMarque.add(new Marque("Cadillac", 469));
        listMarque.add(new Marque("Chevrolet", 467));
        listMarque.add(new Marque("Chrysler", 477));
        listMarque.add(new Marque("Porsche", 584));
        listMarque.add(new Marque("Mercedes-Benz", 449));
        listMarque.add(new Marque("Honda", 474));
        listMarque.add(new Marque("Dodge", 476));
        listMarque.add(new Marque("Ferrari", 603));
        listMarque.add(new Marque("Fiat", 492));
        listMarque.add(new Marque("Hyundai", 498));
        listMarque.add(new Marque("Jaguar", 442));
        listMarque.add(new Marque("Maserati", 443));
        listMarque.add(new Marque("Mazda", 473));
        listMarque.add(new Marque("Mitsubishi", 481));
        listMarque.add(new Marque("Ford", 460));
        listMarque.add(new Marque("GMC", 472));
        listMarque.add(new Marque("Infiniti", 480));
        listMarque.add(new Marque("Jeep", 483));
        listMarque.add(new Marque("Kia", 499));
        listMarque.add(new Marque("Koenigsegg", 1896));
        listMarque.add(new Marque("Lamborghini", 502));
        listMarque.add(new Marque("Land Rover", 444));
        listMarque.add(new Marque("Lexus", 515));
        listMarque.add(new Marque("Lincoln", 464));
        listMarque.add(new Marque("Lotus", 466));
        listMarque.add(new Marque("Mclaren", 2236));
        listMarque.add(new Marque("MINI", 456));
        listMarque.add(new Marque("Nissan", 478));
        listMarque.add(new Marque("Opel", 471));
        listMarque.add(new Marque("Pagani", 4767));
        listMarque.add(new Marque("Pontiac", 536));
        listMarque.add(new Marque("Rolls Royce", 445));
        listMarque.add(new Marque("Subaru", 523));
        listMarque.add(new Marque("Tesla", 441));
        listMarque.add(new Marque("Toyota", 448));
        listMarque.add(new Marque("Volkswagen", 482));
        listMarque.add(new Marque("Volvo", 485));

        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(listMarque, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Marque item) {
                Intent button = new Intent(MainActivity.this, SecondActivity.class);
                button.putExtra("KEY", item.getId());
                startActivity(button);
            }
        });
        recyclerView.setAdapter(mAdapter);
    }
}
