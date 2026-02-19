public class leccion {
    private String titulo;
    private int duracion; // en mínutos 
    private String identificador;
    
    public leccion(String titulo, int duracion, String identificador){
        this.titulo = titulo;
        this.duracion = duracion;
        this.identificador = identificador;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getDuracion(){
        return duracion;
    }
    public String getIdentificador(){
        return identificador;
    }
}
