package Vista;

import Modelo.Agenda;
import AgendaGUI.Familiar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarContactoFamiliar extends JFrame {
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtParentezco;
    private JTextField txtCumpleaños;
    private JButton agregarButton;
    private JPanel V1;

    public AgregarContactoFamiliar(Agenda agenda) {
        setContentPane(this.V1);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String telefono = txtTelefono.getText();
                String parentezco = txtParentezco.getText();
                String cumpleaños = txtCumpleaños.getText();

                Agenda.getInstance().agregarObjeto(new Familiar(parentezco, nombre, telefono, cumpleaños));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                pack();
    }
}