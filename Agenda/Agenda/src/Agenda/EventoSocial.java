package Agenda;


public class EventoSocial extends Evento {
    private String descripcion;

    public EventoSocial(String descripcion, String nombre, String lugar, String fecha) {
        super(nombre, lugar, fecha);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "EventoSocial{" + "nombre=" + this.nombre + ", lugar=" + this.lugar + ", fecha=" + this.fecha + "descripcion=" + this.descripcion +'}';
    }
}
