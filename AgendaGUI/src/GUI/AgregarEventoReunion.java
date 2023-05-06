package GUI;

import AgendaGUI.Agenda;
import AgendaGUI.Concierto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarEventoReunion extends JFrame{
    private JTextField txtNombre;
    private JTextField txtFecha;
    private JTextField txtArtista;
    private JButton agregarButton;
    private JPanel V1;

    public AgregarEventoReunion(Agenda laAgenda) {
        this.setContentPane(this.V1);//esto es para que no se ponga el layout por defecto.
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                String a = txtArtista.getText();

                laAgenda.agregarEvento(new Concierto(null, n, a));
                dispose();

            }
        });
    }
}
