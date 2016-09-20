package ais.mobile.iseven.aissystem.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ais.mobile.iseven.aissystem.Model.FrequenciaModel;
import ais.mobile.iseven.aissystem.R;

/**
 * Created by Rodrigo on 08/09/2016.
 */
public class FrequenciaAdaptador extends RecyclerView.Adapter<FrequenciaAdaptador.productoViewHolder>{
    private ArrayList<FrequenciaModel> item;

    public FrequenciaAdaptador(ArrayList<FrequenciaModel> item) {
        this.item = item;
    }



    @Override
    public productoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.frequencia_dados,viewGroup,false);
        productoViewHolder producto= new productoViewHolder(v);
        return producto;
    }

    @Override
    public void onBindViewHolder(productoViewHolder productoViewHolder, int i) {


        productoViewHolder.horaa.setText(item.get(i).getHora());
        productoViewHolder.imagen.setImageResource(item.get(i).getImagen());
        productoViewHolder.imagen2.setImageResource(item.get(i).getImagen2());
        productoViewHolder.imagen3.setImageResource(item.get(i).getImagen3());
        productoViewHolder.imagen4.setImageResource(item.get(i).getImagen4());
        productoViewHolder.imagen5.setImageResource(item.get(i).getImagen5());


    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class productoViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen, imagen2, imagen3, imagen4, imagen5;
        TextView horaa;

        public productoViewHolder(View itemView) {
            super(itemView);


            imagen=(ImageView)itemView.findViewById(R.id.img);
            imagen2=(ImageView)itemView.findViewById(R.id.image2);
            imagen3=(ImageView)itemView.findViewById(R.id.image3);
            imagen4=(ImageView)itemView.findViewById(R.id.image4);
            imagen5=(ImageView)itemView.findViewById(R.id.image5);
            horaa=(TextView)itemView.findViewById(R.id.hora);

        }
    }

}
