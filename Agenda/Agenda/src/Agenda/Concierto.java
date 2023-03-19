package Agenda;

public class Concierto extends Evento {
    private String artista;

    public Concierto(String artista, String nombre, String lugar, String fecha) {
        super(nombre, lugar, fecha);
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
        return "Concierto{" + "nombre= " + this.nombre + ", lugar=" + this.lugar + ", fecha=" + this.fecha + ", artista=" + this.artista + '}';
    }

    
    
}
