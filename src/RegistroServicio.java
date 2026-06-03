import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RegistroServicio {

    private static final LocalTime HoraLimiteIngreso = LocalTime.of(8, 30);
    private static final LocalTime HoraLimiteSalida = LocalTime.of(17, 0);

    private static final DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FormatoHora = DateTimeFormatter.ofPattern("HH:mm");

    public void RegistroEntrada(Funcionario funcionario, LocalTime horaLimiteIngreso) throws IOException {

        LocalDate hoy = LocalDate.now();
        String nombreArchivo = "Fecha_Ingreso_Empleados" + hoy.format(FormatoFecha) + ".txt";

        String horaFormateada = horaLimiteIngreso.format(FormatoHora);

        if (horaLimiteIngreso.isAfter(LocalTime.parse(horaFormateada))) {




        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {

            bw.write(funcionario.getRut() + funcionario.getNombre() + horaFormateada);

        }

        guardarEnArchivo(nombreArchivo);
    }

    public void RegistroSalida(Funcionario funcionario, LocalTime horaLimiteSalida) throws IOException {

        LocalDate hoy = LocalDate.now();
        String nombreArchivo = "Fecha_Salida_Empleados" + hoy.format(FormatoFecha) + ".txt";

        String horaFormateada = horaLimiteSalida.format(FormatoHora);

        if (horaLimiteSalida.isBefore(LocalTime.parse(horaFormateada))) {


        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {

            bw.write(funcionario.getRut() + funcionario.getNombre() + horaFormateada);
        }

        guardarEnArchivo(nombreArchivo);
    }

    public void guardarEnArchivo(String nombreArchivo) {
        try {

        } catch (Exception e) {

        }
    }


}
