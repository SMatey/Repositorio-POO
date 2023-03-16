/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import carro.Carro;
import carro.Venta;
import java.util.List;


public class VendedorAsalariado extends Vendedor {
    private int salario;

    public VendedorAsalariado(int salario, List<Carro> ventas, String nombre, int cedula, int telefono, String correo, String direccion) {
        super(ventas, nombre, cedula, telefono, correo, direccion);
        this.salario = salario;
    }

    

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
