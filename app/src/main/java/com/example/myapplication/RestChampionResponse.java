package com.example.myapplication;

import java.util.List;

public class RestChampionResponse {
    private int count;
    private String next;
    private List<Champion> results;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public List<Champion> getResults() {
        return results;
    }
}
