package ais.mobile.iseven.aissystem.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

import ais.mobile.iseven.aissystem.R;
import ais.mobile.iseven.aissystem.Recycler.BoletimAdptador;
import ais.mobile.iseven.aissystem.Model.BoletimModel;

public class Tela_Boletim extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;
    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela__boletim);







        ArrayList<BoletimModel> dados = new ArrayList<BoletimModel>();


            dados.add(new BoletimModel(R.drawable.port, "         7.0                  5.0               6.5                  7.0 ",  "     I° unidade |  II° unidade |  III° unidade  |  IV° unidade   "));
            dados.add(new BoletimModel(R.drawable.mat,  "         5.0        |         6.9       |       7.6         |        8.0 ",  "       "    ));
            dados.add(new BoletimModel(R.drawable.cie,  "         3.4        |         9.0       |       2.0         |        3.0 ",  "     "));
            dados.add(new BoletimModel(R.drawable.geo,  "         4.0        |         9.0       |       6.7         |        8.9 ",  "    "));
            dados.add(new BoletimModel(R.drawable.hist, "         8.0        |         6.0       |       8.0         |        7.0 ",  "      "));
            dados.add(new BoletimModel(R.drawable.ing,  "         4.0        |         6.7       |       7.8         |        7.9 ",  "       "));

        ;
        ;





        reciclador = (RecyclerView) findViewById(R.id.reciclador);
        lmanager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(lmanager);

        adaptador = new BoletimAdptador(dados);
        reciclador.setAdapter(adaptador);


    }



}


