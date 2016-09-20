package ais.mobile.iseven.aissystem.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import ais.mobile.iseven.aissystem.R;
import ais.mobile.iseven.aissystem.Model.AvisoModel;
import ais.mobile.iseven.aissystem.Recycler.AvisosAdaptador;

/**
 * Created by Rodrigo on 07/09/2016.
 */
public class Tela_Avisos extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_avisos);




    ArrayList<AvisoModel> datos = new ArrayList<AvisoModel>();


    datos.add(new AvisoModel(R.drawable.feri, "Feriado 7 de Setembro", "Nesta quarta - feira 07/09, não haverá aula, devido o feriado nacional de 7 de setembro, Bom Feriado! "));
        datos.add(new AvisoModel(R.drawable.eco, "Projeto EcoTour 2016", "Nesta quinta - feira 08/09 acontecerá o passeio EcoTour, A saida está prevista para as 8:00 Horas."));
        datos.add(new AvisoModel(R.drawable.prova, "Semana de Prova", "No Próximo dia 20/09 começa a semana de prova , preparem -se!"));
        datos.add(new AvisoModel(R.drawable.enem, "Aulão Enem", "No dia 20/10 acontecerá um aulão para abordar assuntos do enem."));
        datos.add(new AvisoModel(R.drawable.feri, "Feriado", "Nesta quinta - feira 09/10 não haverá aula, devido o feriado nacional."));
        datos.add(new AvisoModel(R.drawable.eco, "Projeto EcoTour 2016", "Nesta quinta - feira 08/09 acontecerá o passeio EcoTour, A saida está prevista para as 8:00 Horas."));
        datos.add(new AvisoModel(R.drawable.prova, "Semana de Prova", "No Próximo dia 20/09 começa a semana de prova , preparem -se!"));
        datos.add(new AvisoModel(R.drawable.enem, "Aulão Enem", "No dia 20/10 acontecerá um aulão para abordar assuntos do enem."));
        datos.add(new AvisoModel(R.drawable.feri, "Feriado", "Nesta quinta - feira 09/10 não haverá aula, devido o feriado nacional."));

        ;
    ;





    reciclador = (RecyclerView) findViewById(R.id.reciclador);
    lmanager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
    reciclador.setLayoutManager(lmanager);

    adaptador = new AvisosAdaptador(datos);
    reciclador.setAdapter(adaptador);

}



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }
}


