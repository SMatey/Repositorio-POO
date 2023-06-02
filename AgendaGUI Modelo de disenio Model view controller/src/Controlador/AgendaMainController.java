package Controlador;

import AgendaGUI.ObjAgenda;
import Modelo.Agenda;
import Vista.AgendaMain;
import Vista.AgregarContactoAmigo;
import Vista.AgregarContactoFamiliar;
import Vista.AgregarContactoTrabajo;
import Vista.AgregarEventoFamiliar;
import Vista.AgregarEventoReunion;
import Vista.ImprimirAgenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AgendaMainController {
    private AgendaMain vista;
    private Agenda agenda;

    public AgendaMainController(AgendaMain vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;

        vista.getAgregarContactoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaAgregarContacto();
            }
        });

        vista.getAgregarEventoButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaAgregarEvento();
            }
        });

        vista.getMostrarAgendaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarAgenda();
            }
        });
    }

    private void mostrarVentanaAgregarContacto() {
        int selectedIndex = vista.getComboBoxContacto().getSelectedIndex();

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

    private void mostrarVentanaAgregarEvento() {
        int selectedIndex = vista.getComboBoxEvento().getSelectedIndex();

        switch (selectedIndex) {
            case 0:
                new AgregarEventoReunion(agenda).setVisible(true);
                break;
            case 1:
                new AgregarEventoFamiliar(agenda).setVisible(true);
                break;
        }
    }

    private void mostrarAgenda() {
        new ImprimirAgenda((List<ObjAgenda>) agenda).setVisible(true);
    }
}
