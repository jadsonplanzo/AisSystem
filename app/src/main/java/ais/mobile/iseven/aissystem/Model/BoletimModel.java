package ais.mobile.iseven.aissystem.Model;

/**
 * Created by Rodrigo on 08/09/2016.
 */
public class BoletimModel {
    private int imagen;

        private String noticia;
        private String aviso;

        public BoletimModel(int imagen, String noticia, String aviso) {
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
