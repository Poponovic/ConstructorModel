package com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity;

import com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.Model.RestMotoResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GerritAPIMoto {
    @GET("vehicles/GetModelsForMakeIdYear/makeId/{id}/vehicleType/{type}")
    Call<RestMotoResponse> getListMoto(@Path("id") Integer id, @Path("type") String type, @Query("format") String format);
}
