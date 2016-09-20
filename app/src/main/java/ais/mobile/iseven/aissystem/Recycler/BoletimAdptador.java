package ais.mobile.iseven.aissystem.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ais.mobile.iseven.aissystem.Model.BoletimModel;
import ais.mobile.iseven.aissystem.R;

/**
 * Created by Rodrigo on 08/09/2016.
 */
public class BoletimAdptador extends RecyclerView.Adapter<BoletimAdptador.productoViewHolder>{
    private ArrayList<BoletimModel> item;

    public BoletimAdptador(ArrayList<BoletimModel> item) {
        this.item = item;
    }



    @Override
    public productoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.boletim_dados,viewGroup,false);
        productoViewHolder producto= new productoViewHolder(v);
        return producto;
    }

    @Override
    public void onBindViewHolder(productoViewHolder productoViewHolder, int i) {
        productoViewHolder.noticia.setText(item.get(i).getNoticia());
        productoViewHolder.aviso.setText(item.get(i).getAviso());
        productoViewHolder.imagen.setImageResource(item.get(i).getImagen());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class productoViewHolder extends RecyclerView.ViewHolder{
        TextView noticia,aviso;
        ImageView imagen;

        public productoViewHolder(View itemView) {
            super(itemView);

            noticia=(TextView)itemView.findViewById(R.id.noticia);
            aviso=(TextView)itemView.findViewById(R.id.aviso);
            imagen=(ImageView)itemView.findViewById(R.id.img);

        }
    }

}
