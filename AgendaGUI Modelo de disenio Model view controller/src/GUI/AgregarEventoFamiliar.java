package GUI;

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

    public AgregarEventoFamiliar(Agenda laAgenda) {
        this.setContentPane(this.V2);//esto es para que no se ponga el layout por defecto.
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                String d = txtDescripcion.getText();

                laAgenda.agregarObjeto(new EventoSocial(null, n, d));
                dispose();

            }
        });
    }
}
