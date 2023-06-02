package Vista;

import Modelo.Agenda;
import AgendaGUI.Concierto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEventoReunion extends JFrame {
    private JTextField txtNombre;
    private JTextField txtFecha;
    private JTextField txtArtista;
    private JButton agregarButton;
    private JPanel V1;

    public AgregarEventoReunion(Agenda agenda) {
        setContentPane(this.V1);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String fecha = txtFecha.getText();
                String artista = txtArtista.getText();

                Agenda.getInstance().agregarObjeto(new Concierto(fecha, nombre, artista));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
