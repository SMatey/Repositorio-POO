package Agenda;

public abstract class Evento {
    protected String nombre;
    protected String lugar;
    protected String fecha;

    public Evento(String nombre, String lugar, String fecha) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombre=" + nombre + ", lugar=" + lugar + ", fecha=" + fecha + '}';
    }
    
}
