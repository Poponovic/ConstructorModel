package com.vogella.android.constructormodel.Voiture.Controller;

import com.vogella.android.constructormodel.Voiture.Model.RestVehicleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GerritAPI {
    @GET("vehicles/GetModelsForMakeIdYear/makeId/{id}/vehicleType/{type}")
    Call<RestVehicleResponse> getListVehicles(@Path("id") Integer id, @Path("type") String type, @Query("format") String format);
}
