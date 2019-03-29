package com.vogella.android.constructormodel.Voiture.Controller;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vogella.android.constructormodel.Voiture.Model.Moto;
import com.vogella.android.constructormodel.Voiture.Model.RestMotoResponse;
import com.vogella.android.constructormodel.Voiture.Activity.MotoActivitySecond;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SecondController {
    private MotoActivitySecond view;
    public SecondController(MotoActivitySecond Activity){
        this.view = Activity;
    }

    public void onCreate(int id){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://vpic.nhtsa.dot.gov/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        GerritAPIMoto gerritAPI = retrofit.create(GerritAPIMoto.class);
        Call<RestMotoResponse> call = gerritAPI.getListMoto(id, "moto",  "json");
        call.enqueue(new Callback<RestMotoResponse>() {
            @Override
            public void onResponse(Call<RestMotoResponse> call, Response<RestMotoResponse> response) {
                RestMotoResponse restMotoResponse = response.body();
                List<Moto> listMoto = restMotoResponse.getResults();
                view.showList(listMoto);
            }

            @Override
            public void onFailure(Call<RestMotoResponse> call, Throwable t) {
                Log.d("Error", "API Error");
            }
        });
    }
}
