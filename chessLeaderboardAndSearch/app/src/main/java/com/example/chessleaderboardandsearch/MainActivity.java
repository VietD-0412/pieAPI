// MainActivity.java
package com.example.chessleaderboardandsearch;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// code này để test leaderboard, bỏ comment phần này và comment phần search
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragment_container, new DailyLeaderboardFragment())
//                    .commit();
        // code này để test search, tương tự như trên
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragment_container, new SearchFragment())
//                    .commit();
//
//        }
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new pie()) // Replace with your fragment class
                    .commit();
        }
    }
}