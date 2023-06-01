package GUI;

import Code.Operaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField op;
    private JButton calcularButton;
    private JPanel panel;

    public Calculadora() {
        setContentPane(this.panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //pack();
        setSize(500,500);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String operacion = op.getText();

                    double resultado = Operaciones.evaluarExpresion(operacion);
                    mostrarResultado(resultado);
                }catch (Exception ex){
                    mostrarError("Error: " + ex.getMessage());
                }
            }
        });
    }

    private void mostrarResultado(double resultado) {
        JOptionPane.showMessageDialog(this, "Resultado: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
