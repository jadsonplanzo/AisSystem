package ais.mobile.iseven.aissystem.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

import ais.mobile.iseven.aissystem.R;
import ais.mobile.iseven.aissystem.Recycler.FrequenciaAdaptador;
import ais.mobile.iseven.aissystem.Model.FrequenciaModel;

public class Tela_Frequencia extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;
    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_frequencia);


        ArrayList<FrequenciaModel> dados = new ArrayList<FrequenciaModel>();


        dados.add(new FrequenciaModel(R.drawable.port, R.drawable.cie,R.drawable.mat,R.drawable.hist,R.drawable.geo, "1°Horário"));

        dados.add(new FrequenciaModel(R.drawable.port, R.drawable.cieaus,R.drawable.cieaus,R.drawable.hist,R.drawable.matpre, "2°Horário"));
        dados.add(new FrequenciaModel(R.drawable.port, R.drawable.cie,R.drawable.mat,R.drawable.hist,R.drawable.geo, "3°Horário"));
        dados.add(new FrequenciaModel(R.drawable.port, R.drawable.cie,R.drawable.mat,R.drawable.hist,R.drawable.geo, "4°Horário"));
        dados.add(new FrequenciaModel(R.drawable.matpre, R.drawable.cie,R.drawable.mat,R.drawable.hist,R.drawable.matpre, "5°Horário"));
        ;
        ;


        reciclador = (RecyclerView) findViewById(R.id.reciclador);
        lmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(lmanager);

        adaptador = new FrequenciaAdaptador(dados);
        reciclador.setAdapter(adaptador);

    }

    }




