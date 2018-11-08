package com.example.equipo.grafico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    LineGraphSeries<DataPoint>series;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double x,y;
        x=0;
        y=0;
        GraphView grafico1=(GraphView) findViewById(R.id.grafico);

        series=new LineGraphSeries<DataPoint>();


            x=5;
            y=2;
            series.appendData(new DataPoint(x,y),true,10);
        x=10;
        y=20;
        series.appendData(new DataPoint(x,y),true,10);
        x=20;
        y=11;
        series.appendData(new DataPoint(x,y),true,10);

      grafico1.addSeries(series);
        }


};
