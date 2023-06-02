package Controlador;

import Modelo.Agenda;
import AgendaGUI.EventoSocial;
import GUI.AgregarEventoFamiliar;

public class AgregarEventoFamiliarController {
    private AgregarEventoFamiliar vista;
    private Agenda agenda;

    public AgregarEventoFamiliarController(AgregarEventoFamiliar vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;

        // Configurar los ActionListener u otros métodos necesarios para la interacción con la vista
        vista.getAgregarButton().addActionListener(e -> agregarEventoFamiliar());
    }

    private void agregarEventoFamiliar() {
        // Obtener los valores de la vista
        String nombre = vista.getTxtNombre().getText();
        String descripcion = vista.getTxtDescripcion().getText();

        // Crear un objeto EventoSocial con los valores obtenidos
        EventoSocial evento = new EventoSocial(null, nombre, descripcion);

        // Agregar el evento a la agenda
        agenda.agregarObjeto(evento);

        // Cerrar la vista
        vista.dispose();
    }
}
