package AgendaGUI;

import java.util.Date;
public class Familiar extends Contacto {
    private String parentezco;
    private Date cumpleanios;

    public Familiar(String parentesco, String nombre, String numero, Date cumpleanios) {
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

    public Date getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(Date cumpleanios) {
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
