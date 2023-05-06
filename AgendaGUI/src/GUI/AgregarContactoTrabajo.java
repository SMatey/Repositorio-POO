package GUI;

import AgendaGUI.Agenda;
import AgendaGUI.Trabajo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AgregarContactoTrabajo extends JFrame {
    private JTextField txtNombre;
    private JTextField txtTelefono;

    private JButton agregarButton;

    private JPanel V3;
    private JTextField txtPuesto;
    private JTextField txtEmpresa;

    public AgregarContactoTrabajo(Agenda laAgenda) {
        setContentPane(this.V3);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                String t = txtTelefono.getText();
                String p = txtPuesto.getText();
                String em = txtEmpresa.getText();


                laAgenda.agregarContacto(new Trabajo(em, p, n, t));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();

    }
}
