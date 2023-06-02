package Controlador;

import Modelo.Agenda;
import AgendaGUI.Concierto;
import Vista.AgregarEventoReunion;

public class AgregarEventoReunionController {
    private AgregarEventoReunion vista;
    private Agenda agenda;

    public AgregarEventoReunionController(AgregarEventoReunion vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;

        // Configurar los ActionListener u otros métodos necesarios para la interacción con la vista
        vista.getAgregarButton().addActionListener(e -> agregarEventoReunion());
    }

    private void agregarEventoReunion() {
        // Obtener los valores de la vista
        String nombre = vista.getTxtNombre().getText();
        String artista = vista.getTxtArtista().getText();

        // Crear un objeto Concierto con los valores obtenidos
        Concierto concierto = new Concierto(null, nombre, artista);

        // Agregar el concierto a la agenda
        agenda.agregarObjeto(concierto);

        // Cerrar la vista
        vista.dispose();
    }
}







