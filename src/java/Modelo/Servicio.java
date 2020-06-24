
package Modelo;

public class Servicio {
    int idServicioSocial;
    String nombre;
    String apellido;
    String numHoras;
    String firma;
    String NombreEntidad;

    public Servicio() {
    }

    public Servicio(int idServicioSocial, String nombre, String apellido, String numHoras, String firma, String NombreEntidad) {
        this.idServicioSocial = idServicioSocial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numHoras = numHoras;
        this.firma = firma;
        this.NombreEntidad = NombreEntidad;
    }

    public int getIdServicioSocial() {
        return idServicioSocial;
    }

    public void setIdServicioSocial(int idServicioSocial) {
        this.idServicioSocial = idServicioSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(String numHoras) {
        this.numHoras = numHoras;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getNombreEntidad() {
        return NombreEntidad;
    }

    public void setNombreEntidad(String NombreEntidad) {
        this.NombreEntidad = NombreEntidad;
    }
    

    

}