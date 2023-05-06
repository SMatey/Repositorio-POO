package AgendaGUI;

import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<ObjAgenda> ListaObjetos = new ArrayList<>();


    //=====Metodos contacto=====
    public void agregarContacto(Contacto contacto) {
        this.ListaObjetos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        this.ListaObjetos.remove(contacto);
    }

    //=====Metodos evento=====
    public void agregarEvento(Evento evento) {
        this.ListaObjetos.add(evento);
    }

    public void eliminarEvento(Evento evento) {
        this.ListaObjetos.remove(evento);
    }


    public List<ObjAgenda> getListaObjetos() {
        return ListaObjetos;
    }

    public void setListaObjetos(List<ObjAgenda> listaObjetos) {
        ListaObjetos = listaObjetos;
    }
}
