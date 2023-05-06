package GUI;

import AgendaGUI.Agenda;
import AgendaGUI.Familiar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarContactoFamiliar extends JFrame {
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtParentezco;

    private JTextField txtCompleaños;
    private JButton agregarButton;
    private JPanel V1;


    public AgregarContactoFamiliar(Agenda laAgenda) {
        setContentPane(this.V1);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                String t = txtTelefono.getText();
                String p = txtParentezco.getText();
                laAgenda.agregarContacto(new Familiar(p, n, t, null));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
