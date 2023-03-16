/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class Industrial extends Carro {

    public Industrial(String marca, String modelo, int matricula, int precioCompra, int venta, List<Reparacion> reparaciones) {
        super(marca, modelo, matricula, precioCompra, venta,  reparaciones);
    }
    
}
