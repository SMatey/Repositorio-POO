package AgendaGUI;

import java.util.Date;

public class EventoSocial extends  Evento implements ObjAgenda {
    private String descripcion;

    public EventoSocial(Date fecha, String nombre, String descripcion) {
        super(fecha, nombre);
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
        return "EventoSocial{" +
                "\n Nombre = " + getNombre() +
                "\n Fecha = " + getFecha() +
                "descripcion='" + descripcion;
    }

    public void imprimir(){
        System.out.println(this.toString());
    }
}
