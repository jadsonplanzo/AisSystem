package ais.mobile.iseven.aissystem.Activity;

import android.icu.math.MathContext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import ais.mobile.iseven.aissystem.Activity.Tela_Boletim;
import ais.mobile.iseven.aissystem.R;

public class Grafico extends AppCompatActivity {
    LineGraphSeries <DataPoint> series;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico);

        double x,y;
        x= -5.0;


        GraphView graph = (GraphView) findViewById(R.id.graph);
        series = new LineGraphSeries<DataPoint>();
        for(int i = 0; i<500; i++){
            x = x + 0.1;
            y= Math.sin(x);
            series.appendData(new DataPoint(x,y), true, 500);
        }
        graph.addSeries(series);
    }

}
