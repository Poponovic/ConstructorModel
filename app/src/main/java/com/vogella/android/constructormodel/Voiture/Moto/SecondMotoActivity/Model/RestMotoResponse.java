package com.vogella.android.constructormodel.Voiture.Moto.SecondMotoActivity.Model;

import java.util.List;

public class RestMotoResponse {
    Integer Count;
    private List<Moto> Results;

    public Integer getCount() {
        return Count;
    }

    public List<Moto> getResults() {
        return Results;
    }

    public void setCount(Integer count) {
        this.Count = count;
    }

    public void setResults(List<Moto> results) {
        this.Results = results;
    }
}
