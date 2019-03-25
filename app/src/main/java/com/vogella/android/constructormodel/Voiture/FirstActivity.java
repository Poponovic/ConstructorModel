package com.vogella.android.constructormodel.Voiture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vogella.android.constructormodel.R;
import com.vogella.android.constructormodel.Voiture.MainActivity.MainActivity;
import com.vogella.android.constructormodel.Voiture.Moto.FirstMotoActivity.MotoActivity;

public class FirstActivity extends Activity {

    private Button voiture;
    private Button moto;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        voiture = (Button) findViewById(R.id.voiture);
        moto = (Button) findViewById(R.id.moto);

        voiture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent carButton = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(carButton);
            }
        });

        moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent motoButton = new Intent(FirstActivity.this, MotoActivity.class);
                startActivity(motoButton);
            }
        });
    }
}
