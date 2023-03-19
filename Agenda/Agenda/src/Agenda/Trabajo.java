/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

/**
 *
 * @author PERSONAL
 */
public class Trabajo extends Contacto {
    private String empresa;
    private String puesto;

    public Trabajo(String empresa, String puesto, String nombre, int numero) {
        super(nombre, numero);
        this.empresa = empresa;
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "nombre=" +this.nombre + ", numero=" + this.numero + ", empresa=" + empresa + ", puesto=" + puesto + '}';
    }

}
