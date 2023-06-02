package AgendaGUI;

public class Trabajo extends Contacto {
    private String empresa;
    private String puesto;

    public Trabajo(String empresa, String puesto, String nombre, String numero) {
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
        return "Trabajo{" +
                "\nnombre=" +this.nombre +
                "\nTelefono=" + this.numero +
                "\nempresa=" + empresa +
                "\npuesto=" + puesto;
    }

    public void imprimir(){
        System.out.println(this.toString());
    }
}
