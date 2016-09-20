package ais.mobile.iseven.aissystem.Model;

/**
 * Created by Rodrigo on 08/09/2016.
 */
public class FrequenciaModel {
    private int imagen;
    private int imagen2;
    private int imagen3;

    public String getHora() {
        return hora;
    }

    private String hora;

    public int getImagen2() {
        return imagen2;
    }

    public int getImagen4() {
        return imagen4;
    }

    public int getImagen3() {
        return imagen3;
    }

    public int getImagen5() {
        return imagen5;
    }

    public int getImagen() {
        return imagen;
    }

    private int imagen4;
    private int imagen5;

    public FrequenciaModel(int imagen2, int imagen3, int imagen4, int imagen5, int imagen, String hora) {
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.imagen4 = imagen4;
        this.imagen5 = imagen5;
        this.imagen = imagen;
        this.hora = hora;
    }
}


