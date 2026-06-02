import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RegistroService {

    private static final LocalTime HoraLimiteIngreso = LocalTime.of(8, 30);
    private static final LocalTime HoraLimiteSalida = LocalTime.of(17, 0);

    private static final DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FormatoHora = DateTimeFormatter.ofPattern("HH:mm");

    public void RegistroEntrada() {


    }

    public void RegistroSalida() {



    }

    
}
