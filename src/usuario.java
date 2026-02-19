import java.util.ArrayList;
import java.util.List;

public class usuario {
    private String nombre;
    private String email;
    private List<Inscripcion> misInscripciones;

    usuario(String nombre, String email){
        this.setNombre(nombre);
        this.setEmail(email);
        this.misInscripciones = new ArrayList<>();
    }
    public void agregarInscripcion(Inscripcion insc) {
        this.misInscripciones.add(insc);
    }
public class Usuario {
    

    public String getNombre(){return nombre;}
    public String getEmail(){return email;}

    public void setNombre(String nombre){this.nombre = nombre;
    }
    public void setEmail(String email){this.email = email;}
}
}
