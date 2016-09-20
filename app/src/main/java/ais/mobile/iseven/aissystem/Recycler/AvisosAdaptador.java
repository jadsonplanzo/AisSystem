package ais.mobile.iseven.aissystem.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ais.mobile.iseven.aissystem.Model.AvisoModel;
import ais.mobile.iseven.aissystem.R;

/**
 * Created by Trujas on 05/08/2015.
 */
public class AvisosAdaptador extends RecyclerView.Adapter<AvisosAdaptador.productoViewHolder>{
    private ArrayList<AvisoModel> item;

    public AvisosAdaptador(ArrayList<AvisoModel> item) {
        this.item = item;
    }



    @Override
    public productoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.avisos_dados,viewGroup,false);
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
