package Agenda;

public class Main {
    public static void main(String[] args) {
        //Creamos contactos
        Familiar contacto1 = new Familiar("Primo", "Mario", 61986577);
        Trabajo contacto2 = new Trabajo("Facebook", "Ceo", "Mark", 61995644);
        Amigo contacto3 = new Amigo("La Fortubna", "El taza", "Isaac", 20226534);

        //Creamos eventos 
        Concierto e1 = new Concierto("Bad Bunny", "Verano sin ti", "San Jose", "13/12/2023");
        EventoSocial e2 = new EventoSocial("Cena familiar", "Cena", "Rufinos", "23/4/2023");

        //Creamos una agenda y gregamos los contactos
        Agenda agenda = new Agenda();
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto2);
        
        //Agregamos Eventos
        agenda.agregarEvento(e1);
        agenda.agregarEvento(e2);
        
        //Imprimir contactos y eventos
        System.out.println("=====Mostrar contactos=====");
        agenda.mostrarContactos();
        System.out.println("=====Mostrar eventos=====");
        agenda.mostrarEventos();
        
        //Metodos para eliminar contacto o evento
        agenda.eliminarContacto(contacto3);
        agenda.eliminarEvento(e2);
        
        //Mostrar informacion sin los eventos eliminados
        System.out.println("=====Mostrar contactos=====");
        agenda.mostrarContactos();
        System.out.println("=====Mostrar eventos=====");
        agenda.mostrarEventos();
        
    }
   
    
    
}
