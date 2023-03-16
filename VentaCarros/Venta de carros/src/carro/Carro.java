package carro;

import java.util.List;

public class Carro {
    private String marca;
    private String modelo;
    private  int matricula;
    private int precioCompra;
    private int venta;
    private List<Reparacion> reparaciones;


    public Carro(String marca, String modelo, int matricula, int precioCompra, int venta, List<Reparacion> reparaciones) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precioCompra = precioCompra;
        this.venta = venta;
        this.reparaciones = reparaciones;
   
    }
    
    public void reparar(Reparacion reparacion) {
       reparaciones.add(reparacion);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }
    

    public List<Reparacion> getReparaciones() {
        return reparaciones;
    }

    public void setReparaciones(List<Reparacion> reparaciones) {
        this.reparaciones = reparaciones;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", precioCompra=" + precioCompra + ", venta=" + venta + ", reparaciones=" + reparaciones + '}';
    }
    
    
}
