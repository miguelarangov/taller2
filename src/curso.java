import java.util.List;
import java.util.ArrayList;

public class curso {
    private String titulo;
    private String descripcion;
    public String categoria;
    public Nivel nivel;
    private List<leccion> lecciones;

    public curso(String titulo, String descripcion, String categoria, Nivel nivel){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.nivel = nivel ;
        this.lecciones = new ArrayList<>();
    }
    public void agregarLeccion(leccion leccion){
        lecciones.add(leccion);
    }
    public List<leccion> getLecciones8(){
        return lecciones;
    }
    public String getTitulo(){
        return titulo;
    }
}
