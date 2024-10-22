// LeaderboardResponse.java
package com.example.chessleaderboardandsearch;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LeaderboardResponse {
    @SerializedName("daily")
    private List<Player> daily;

    // Getters
    public List<Player> getDaily() {
        return daily;
    }
}