// ChessApiService.java
package com.example.chessleaderboardandsearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ChessApiService {
    @GET("leaderboards")
    Call<LeaderboardResponse> getLeaderboards();

    @GET("player/{username}")
    Call<Player> getPlayerProfile(@Path("username") String username);
}