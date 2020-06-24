
package Modelo;


public class Gestion_cursos {
    
    int idGestion;
    String nombre;
    String descripcion;
    String materia;
    String fecha;
    String periodo;
    String recurso;

    public Gestion_cursos() {
    }

    public Gestion_cursos(int idGestion, String nombre, String descripcion, String materia, String fecha, String periodo, String recurso) {
        this.idGestion = idGestion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.materia = materia;
        this.fecha = fecha;
        this.periodo = periodo;
        this.recurso = recurso;
    }

    public int getIdGestion() {
        return idGestion;
    }

    public void setIdGestion(int idGestion) {
        this.idGestion = idGestion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }
    
}
