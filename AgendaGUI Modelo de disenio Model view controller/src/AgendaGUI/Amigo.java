package AgendaGUI;

public class Amigo extends Contacto {
    private String direccion;
    private String apodo;

    public Amigo(String direccion, String apodo, String nombre, String numero) {
        super(nombre, numero);
        this.direccion = direccion;
        this.apodo = apodo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Amigo{" + " " +
                "\nnombre= " + this.nombre +
                "\nTelefono= " + this.numero +
                "\ndireccion=" + direccion +
                "\napodo=" + apodo;
    }

    public void imprimir(){
        System.out.println(this.toString());
    }
}
