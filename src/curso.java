import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String titulo;
    private String descripcion;
    public String categoria;
    public Nivel nivel;
    private List<Leccion> lecciones;

    public Curso(String titulo, String descripcion, String categoria, Nivel nivel){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.nivel = nivel ;
        this.lecciones = new ArrayList<>();
    }
    public void agregarLeccion(Leccion leccion){
        lecciones.add(leccion);
    }
    public List<Leccion> getLecciones8(){
        return lecciones;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
