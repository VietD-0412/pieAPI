package com.example.chessleaderboardandsearch;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.LargeValueFormatter;

import java.util.ArrayList;

public class pie extends Fragment {

    private PieChart pieChart;

    public pie() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pie_chart, container, false);

        pieChart = view.findViewById(R.id.pieChart);
        setupPieChart();
        loadPieChartData(300, 57, 65);

        return view; // Return the inflated view
    }

    private void setupPieChart() {
        pieChart.setDrawHoleEnabled(true);


        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.getDescription().setEnabled(false);






        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }


    private void loadPieChartData(int wins, int losses, int draws) {
        int totalMatches = wins + draws + losses;
        pieChart.setCenterText("" +totalMatches);
        pieChart.setCenterTextSize(24);


        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(wins, "Wins"));
        entries.add(new PieEntry(draws, "Draws"));
        entries.add(new PieEntry(losses, "Losses"));


        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        colors.add(Color.RED);


        PieDataSet dataSet = new PieDataSet(entries, "Total matches");
        dataSet.setColors(colors);


        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
        data.setValueFormatter(new LargeValueFormatter());
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);


        pieChart.setData(data);
        pieChart.invalidate();


        pieChart.animateY(1400, Easing.EaseInOutQuad);
    }
}