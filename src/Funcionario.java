public class Funcionario {

    private String rut;
    private String nombre;

    public Funcionario(String nombre, String rut){

        this.rut = rut;
        this.nombre = nombre;

    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
