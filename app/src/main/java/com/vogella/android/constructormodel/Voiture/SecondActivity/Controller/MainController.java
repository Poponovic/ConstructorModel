package com.vogella.android.constructormodel.Voiture.SecondActivity.Controller;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vogella.android.constructormodel.Voiture.SecondActivity.GerritAPI;
import com.vogella.android.constructormodel.Voiture.SecondActivity.SecondActivity;
import com.vogella.android.constructormodel.Voiture.SecondActivity.model.RestVehicleResponse;
import com.vogella.android.constructormodel.Voiture.SecondActivity.model.Vehicle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {
    private SecondActivity view;
    public MainController(SecondActivity Activity){
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

        GerritAPI gerritAPI = retrofit.create(GerritAPI.class);
        Call<RestVehicleResponse> call = gerritAPI.getListVehicles(id, "car", "json");
        call.enqueue(new Callback<RestVehicleResponse>() {
            @Override
            public void onResponse(Call<RestVehicleResponse> call, Response<RestVehicleResponse> response) {
                RestVehicleResponse restVehicleResponse = response.body();
                List<Vehicle> listVehicle = restVehicleResponse.getResults();
                view.showList(listVehicle);
            }

            @Override
            public void onFailure(Call<RestVehicleResponse> call, Throwable t) {
                Log.d("Error", "API Error");
            }
        });
    }
}
