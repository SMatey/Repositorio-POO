package Vista;

import javax.swing.*;
import Modelo.Agenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaMain extends JFrame {
    private JPanel panel1;
    private JButton agregarContactoButton;
    private JButton agregarEventoButton;
    private JButton mostrarAgendaButton;
    private JComboBox<String> comboBoxContacto;
    private JComboBox<String> comboBoxEvento;
    private Agenda laAgenda;

    public AgendaMain(Agenda agenda) {
        this.laAgenda = agenda;

        setContentPane(this.panel1);

        agregarContactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBoxContacto.getSelectedIndex();
                switch (selectedIndex) {
                    case 0:
                        new AgregarContactoFamiliar(agenda).setVisible(true);
                        break;
                    case 1:
                        new AgregarContactoAmigo(agenda).setVisible(true);
                        break;
                    case 2:
                        new AgregarContactoTrabajo(agenda).setVisible(true);
                        break;
                }
            }
        });

        mostrarAgendaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ImprimirAgenda(laAgenda.getListaObjetos()).setVisible(true);
            }
        });

        agregarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBoxEvento.getSelectedIndex();
                switch (selectedIndex) {
                    case 0:
                        new AgregarEventoReunion(agenda).setVisible(true);
                        break;
                    case 1:
                        new AgregarEventoFamiliar(agenda).setVisible(true);
                        break;
                }
            }
        });
    }
    public JComboBox<String> getComboBoxContacto() {
        return comboBoxContacto;
    }
    public JComboBox<String> getComboBoxEvento() {
        return comboBoxContacto;
    }
    public JButton getAgregarContactoButton() {
        return agregarContactoButton;
    }

    public JButton getAgregarEventoButton() {
        return agregarContactoButton;
    }
    public JButton getMostrarAgendaButton() {
        return agregarContactoButton;
    }

}
