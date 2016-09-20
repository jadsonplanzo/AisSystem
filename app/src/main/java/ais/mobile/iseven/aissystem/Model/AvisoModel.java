package ais.mobile.iseven.aissystem.Model;

/**
 * Created by Trujas on 05/08/2015.
 */
public class AvisoModel {
    private int imagen;
    private String noticia;
    private String aviso;

    public AvisoModel(int imagen, String noticia, String aviso) {
        this.imagen = imagen;
        this.noticia = noticia;
        this.aviso = aviso;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNoticia() {
        return noticia;
    }

    public String getAviso() {
        return aviso;
    }
}
