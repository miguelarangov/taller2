import java.util.ArrayList;
import java.util.List;

public class incripcion {
    public String Fecha;
    private estado estado;
    private double progreso;
    private List<Leccion> leccionesCompletadas;

    public incripcion (String fecha) {
        this.Fecha = fecha;
        this.estado = estado.ACTIVA;
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
