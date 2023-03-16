/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import carro.Carro;
import carro.Venta;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class VendedorComision extends Vendedor {
    private int carrosVendidos;

    public VendedorComision(int carrosVendidos, List<Carro> ventas, String nombre, int cedula, int telefono, String correo, String direccion) {
        super(ventas, nombre, cedula, telefono, correo, direccion);
        this.carrosVendidos = carrosVendidos;
    }

    

    public int getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setCarrosVendidos(int carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }
    
    
    
}
