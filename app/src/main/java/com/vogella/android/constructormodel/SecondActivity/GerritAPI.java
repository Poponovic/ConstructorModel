package com.vogella.android.constructormodel.SecondActivity;

import com.vogella.android.constructormodel.SecondActivity.model.RestVehicleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GerritAPI {
    @GET("vehicles/GetModelsForMakeIdYear/makeId/582/modelyear/{year}")
    Call<RestVehicleResponse> getListVehicles(@Path("year") Integer modelyear, @Query("format") String format);
}
