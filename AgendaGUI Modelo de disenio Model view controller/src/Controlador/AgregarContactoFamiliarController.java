package Controlador;

import Modelo.Agenda;
import AgendaGUI.Familiar;
import GUI.AgregarContactoFamiliar;

public class AgregarContactoFamiliarController {
    private AgregarContactoFamiliar vista;
    private Agenda agenda;

    public AgregarContactoFamiliarController(AgregarContactoFamiliar vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;

        // Configurar los ActionListener u otros métodos necesarios para la interacción con la vista
        vista.getAgregarButton().addActionListener(e -> agregarContactoFamiliar());
    }

    private void agregarContactoFamiliar() {
        // Obtener los valores de la vista
        String nombre = vista.getTxtNombre().getText();
        String telefono = vista.getTxtTelefono().getText();
        String parentezco = vista.getTxtParentezco().getText();

        // Crear un objeto Familiar con los valores obtenidos
        Familiar familiar = new Familiar(parentezco, nombre, telefono, null);

        // Agregar el familiar a la agenda
        agenda.agregarObjeto(familiar);

        // Cerrar la vista
        vista.dispose();
    }
}
