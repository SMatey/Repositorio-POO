package Vista;

import Modelo.Agenda;
import AgendaGUI.Amigo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarContactoAmigo extends JFrame {
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtApodo;
    private JTextField txtDireccion;
    private JButton agregarButton;
    private JPanel V2;

    public AgregarContactoAmigo(Agenda agenda) {
        setContentPane(this.V2);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String telefono = txtTelefono.getText();
                String apodo = txtApodo.getText();
                String direccion = txtDireccion.getText();

                Agenda.getInstance().agregarObjeto(new Amigo(direccion, apodo, nombre, telefono));
                dispose();
            }

        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
