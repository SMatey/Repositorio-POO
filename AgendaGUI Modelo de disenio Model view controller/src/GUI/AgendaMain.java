package GUI;



import Modelo.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaMain extends JFrame{
    private JPanel panel1;
    private JButton agregarContactoButton;
    private JButton agregarEventoButton;
    private JButton mostrarAgendaButton;
    private JComboBox comboBoxContacto;
    private JComboBox comboBoxEvento;
    private Agenda laAgenda;
    public AgendaMain() {
        this.laAgenda = new Agenda();

        setContentPane(this.panel1);
        agregarContactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBoxContacto.getSelectedIndex() == 0)
                    (new AgregarContactoFamiliar(laAgenda)).setVisible(true);
                else if (comboBoxContacto.getSelectedIndex() == 1)
                    (new AgregarContactoAmigo(laAgenda)).setVisible(true);
                else if (comboBoxContacto.getSelectedIndex() == 2)
                    (new AgregarContactoTrabajo(laAgenda)).setVisible(true);




            }

        });

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //pack();
            setSize(500,500);
        mostrarAgendaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                (new ImprimirAgenda(laAgenda)).setVisible(true);
            }
        });
        agregarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBoxEvento.getSelectedIndex() == 0)
                    (new AgregarEventoReunion(laAgenda)).setVisible(true);
                else if (comboBoxEvento.getSelectedIndex() == 1)
                    (new AgregarEventoFamiliar(laAgenda)).setVisible(true);

            }
        });
    }
}
