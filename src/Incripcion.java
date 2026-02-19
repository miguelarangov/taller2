import java.util.ArrayList;
import java.util.List;

public class Incripcion {
    public String Fecha;
    private Estado estado;
    private double progreso;
    private List<Leccion> leccionesCompletadas;

    public Incripcion (String fecha) {
        this.Fecha = fecha;
        this.estado = Estado.ACTIVA;
        this.progreso = 0.0;
        this.leccionesCompletadas = new ArrayList<>();
    }
        public void completarLeccion(Leccion leccion) {
            if(!leccionesCompletadas.contains(leccion)){
                leccionesCompletadas.add(leccion);
                actualizarProgreso();
            }
        }

}
