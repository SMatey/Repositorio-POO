package AgendaGUI;

import java.util.Date;
public abstract class Evento implements ObjAgenda {
    private Date fecha;
    private String nombre;

    public Evento(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public Date getFecha() {

        return fecha;
    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
