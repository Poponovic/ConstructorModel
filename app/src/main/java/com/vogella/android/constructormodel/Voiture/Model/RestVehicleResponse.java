package com.vogella.android.constructormodel.Voiture.Model;

import java.util.List;

public class RestVehicleResponse {
    Integer Count;
    private List<Vehicle> Results;

    public Integer getCount() {
        return Count;
    }

    public List<Vehicle> getResults() {
        return Results;
    }

    public void setCount(Integer count) {
        this.Count = count;
    }

    public void setResults(List<Vehicle> results) {
        this.Results = results;
    }
}
