package Controlador;

import Modelo.Agenda;
import AgendaGUI.Trabajo;
import GUI.AgregarContactoTrabajo;

public class AgregarContactoTrabajoController {
    private AgregarContactoTrabajo vista;
    private Agenda agenda;

    public AgregarContactoTrabajoController(AgregarContactoTrabajo vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;

        // Configurar los ActionListener u otros métodos necesarios para la interacción con la vista
        vista.getAgregarButton().addActionListener(e -> agregarContactoTrabajo());
    }

    private void agregarContactoTrabajo() {
        // Obtener los valores de la vista
        String nombre = vista.getTxtNombre().getText();
        String telefono = vista.getTxtTelefono().getText();
        String puesto = vista.getTxtPuesto().getText();
        String empresa = vista.getTxtEmpresa().getText();

        // Crear un objeto Trabajo con los valores obtenidos
        Trabajo trabajo = new Trabajo(empresa, puesto, nombre, telefono);

        // Agregar el trabajo a la agenda
        agenda.agregarObjeto(trabajo);

        // Cerrar la vista
        vista.dispose();
    }
}
