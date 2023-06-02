package Vista;

import Modelo.Agenda;
import AgendaGUI.EventoSocial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEventoFamiliar extends JFrame {
    private JTextField txtNombre;
    private JTextField txtFecha;
    private JTextField txtDescripcion;
    private JButton agregarButton;
    private JPanel V2;

    public AgregarEventoFamiliar(Agenda agenda) {
        setContentPane(this.V2);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String fecha = txtFecha.getText();
                String descripcion = txtDescripcion.getText();

                Agenda.getInstance().agregarObjeto(new EventoSocial(fecha, nombre, descripcion));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
