package Controlador;

import Modelo.Agenda;
import AgendaGUI.Amigo;
import GUI.AgregarContactoAmigo;

public class AgregarContactoAmigoController {
    private AgregarContactoAmigo vista;
    private Agenda agenda;

    public AgregarContactoAmigoController(AgregarContactoAmigo vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;

        // Configurar los ActionListener u otros métodos necesarios para la interacción con la vista
        vista.getAgregarButton().addActionListener(e -> agregarContactoAmigo());
    }

    private void agregarContactoAmigo() {
        // Obtener los valores de la vista
        String nombre = vista.getTxtNombre().getText();
        String telefono = vista.getTxtTelefono().getText();
        String apodo = vista.getTxtApodo().getText();
        String direccion = vista.getTxtDireccion().getText();

        // Crear un objeto Amigo con los valores obtenidos
        Amigo amigo = new Amigo(direccion, apodo, nombre, telefono);

        // Agregar el amigo a la agenda
        agenda.agregarObjeto(amigo);

        // Cerrar la vista
        vista.dispose();
    }
}
