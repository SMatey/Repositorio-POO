package Vista;

import AgendaGUI.ObjAgenda;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ImprimirAgenda extends JFrame {
    private JTextArea txtImpresion;
    private JPanel panel1;

    public ImprimirAgenda(List<ObjAgenda> listaObjetos) {
        setContentPane(this.panel1);

        txtImpresion.setFont(new Font("Monospaced", Font.PLAIN, 12));

        for (ObjAgenda objAgenda : listaObjetos) {
            txtImpresion.append(objAgenda.toString() + "\n");
        }

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}
