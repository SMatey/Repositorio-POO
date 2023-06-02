package Modelo;

import AgendaGUI.Contacto;
import AgendaGUI.Evento;
import AgendaGUI.ObjAgenda;

import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<ObjAgenda> listaObjetos;
    private static Agenda instance;

    public Agenda() {
        listaObjetos = new ArrayList<>();
    }

    public static Agenda getInstance() {
        if (instance == null) {
            instance = new Agenda();
        }
        return instance;
    }

    public void agregarObjeto(ObjAgenda objeto) {
        listaObjetos.add(objeto);
    }

    public List<ObjAgenda> getListaObjetos() {
        return listaObjetos;
    }
}
