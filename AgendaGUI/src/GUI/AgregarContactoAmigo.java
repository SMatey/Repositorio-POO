package GUI;




import AgendaGUI.Agenda;
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


    public AgregarContactoAmigo(Agenda laAgenda) {
        setContentPane(this.V2);
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = txtNombre.getText();
                String t = txtTelefono.getText();
                String a = txtApodo.getText();
                String d = txtDireccion.getText();
                laAgenda.agregarContacto(new Amigo(d, a, n, t));
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();

    }

    
}
