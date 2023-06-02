package Vista;

import  Modelo.Agenda;
import AgendaGUI.Trabajo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarContactoTrabajo extends JFrame {
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtPuesto;
    private JTextField txtEmpresa;
    private JButton agregarButton;
    private JPanel V3;

    public AgregarContactoTrabajo(Agenda agenda) {
        setContentPane(this.V3);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String telefono = txtTelefono.getText();
                String puesto = txtPuesto.getText();
                String empresa = txtEmpresa.getText();

                Agenda.getInstance().agregarObjeto(new Trabajo(empresa, puesto, nombre, telefono));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}