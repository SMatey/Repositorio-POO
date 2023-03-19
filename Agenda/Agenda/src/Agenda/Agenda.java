package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos = new ArrayList<>();
    private List<Evento> eventos = new ArrayList<>();
    

      //=====Metodos contacto=====
    public void agregarContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }
    
    public void editarContacto(Contacto contacto) {
        
    }
    
    public void eliminarContacto(Contacto contacto) {
        this.contactos.remove(contacto);
    }
    
    public void mostrarContactos() {
        int cont = 1;
        for (Contacto contacto: contactos) {
            System.out.println(cont+") " + contacto);
            cont ++;
        }
    }
    
    //=====Metodos evento=====
    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }
    
    public void editarEvento(Evento evento) {
        
    }
    
    public void eliminarEvento(Evento evento) {
        this.eventos.remove(evento);
    }
    
    public void mostrarEventos() {
        int cont = 1;
        for (Evento evento: eventos) {
            System.out.println(cont +") " + evento);
            cont ++;
        }
    }
}
