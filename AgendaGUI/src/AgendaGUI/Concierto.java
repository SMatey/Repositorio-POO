package AgendaGUI;

import java.util.Date;

public class Concierto extends Evento {
    private String artista;

    public Concierto(Date fecha, String nombre, String artista) {
        super(fecha, nombre);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "\n Nombre = " + getNombre() +
                "\nFecha = " + getFecha() +
                "artista='" + artista;
    }

    public void imprimir(){
        System.out.println(this.toString());
    }
}
