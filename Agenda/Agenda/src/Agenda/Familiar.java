package Agenda;

public class Familiar extends Contacto {
    private String parentesco;

    public Familiar(String parentesco, String nombre, int numero) {
        super(nombre, numero);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return this.parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Familiar{" + "nombre=" + this.nombre + " numero= " + this.numero + " parentesco=" + this.parentesco + '}';
    }
   
}
