/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import carro.*;
import java.util.List;

public class Vendedor extends Persona{
    private List<Carro> ventas;

    public Vendedor(List<Carro> ventas, String nombre, int cedula, int telefono, String correo, String direccion) {
        super(nombre, cedula, telefono, correo, direccion);
        this.ventas = ventas;
    }

    public List<Carro> getVentas() {
        return ventas;
    }

    public void setVentas(List<Carro> ventas) {
        this.ventas = ventas;
    }    
    
    public void vender(Carro carro) {
          ventas.add(carro);
    }
    public void comprar(Carro carro){
        
    }
}
