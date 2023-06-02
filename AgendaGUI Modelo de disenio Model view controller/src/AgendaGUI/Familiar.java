package AgendaGUI;

import java.util.Date;
public class Familiar extends Contacto {
    private String parentezco;
    private String cumpleanios;

    public Familiar(String parentesco, String nombre, String numero, String cumpleanios) {
        super(nombre, numero);
        this.parentezco = parentesco;
        this.cumpleanios = cumpleanios;
    }

    public String getParentezco() {
        return this.parentezco;
    }

    public void setParentesco(String parentezco) {
        this.parentezco = parentezco;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    @Override
    public String toString() {
        return "Familiar{" +
                "\nnombre= " + this.nombre +
                "\nTelefono= " + this.numero +
                "\nparentezco='" + parentezco +
                "\ncumpleanios=" + cumpleanios;
    }

    public void imprimir(){
        System.out.println(this.toString());
    }
}
