package com.example.myapplication;

import java.util.List;

public class RestChampionResponse {
    private int count;
    private String competance;
    private List<Champion> results;

    public int getCount() {
        return count;
    }

    public String getCompetance() {
        return competance;
    }

    public List<Champion> getResults() {
        return results;
    }
}
