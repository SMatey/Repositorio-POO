import Vista.AgendaMain;
import  AgendaGUI.*;
import Controlador.*;
import Modelo.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        AgendaMain agendaMain = new AgendaMain(agenda);
        AgendaMainController controller = new AgendaMainController(agendaMain, agenda);
        agendaMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agendaMain.setVisible(true);
    }
}