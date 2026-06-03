public class Main {
    public static void main(String[] args) {

        RegistroServicio servicio = new RegistroServicio();

        Funcionario funcionario = new Funcionario("Jose","11.111.111-1");
        Funcionario funcionario2 = new Funcionario("Josefa","22.222.222-2");

        System.out.println("");

        System.out.println("Ingreso y Salida: " +funcionario);

        servicio.RegistroEntrada("Jose",);
        servicio.RegistroSalida("Jose",);

        System.out.println("");

        System.out.println("Ingreso y Salida: " +funcionario2);

        servicio.RegistroEntrada("Josefa",);
        servicio.RegistroSalida("Josefa",);

    }
}