package Controlador;

import Modelo.Agenda;
import GUI.ImprimirAgenda;

public class ImprimirAgendaController {
    private ImprimirAgenda vista;
    private Agenda agenda;

    public ImprimirAgendaController(ImprimirAgenda vista, Agenda agenda) {
        this.vista = vista;
        this.agenda = agenda;


    }
}