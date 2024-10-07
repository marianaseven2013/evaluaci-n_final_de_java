package src.model;

public class Tarea {
    String Titulo;
    String Descripcion;
    String FechaLimite;
    boolean Estado;

    public Tarea (String titulo, String descripcion, String fechaLimite, boolean estado){
        this.Titulo = titulo;
        this.Descripcion = descripcion;
        this.FechaLimite = fechaLimite;
        this.Estado = estado;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        FechaLimite = fechaLimite;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = Boolean.parseBoolean(estado);
    }
}
