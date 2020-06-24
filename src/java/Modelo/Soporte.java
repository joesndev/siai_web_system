/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author APRENDIZ
 */
public class Soporte {

    private int Id;
    private String documento;
    private String curso;
    private String tipoSoporte;
    private String descripcion;
    private String respuesta;

    public Soporte() {
    }

    public Soporte(int Id, String documento, String curso, String tipoSoporte, String descripcion, String respuesta) {
        this.Id = Id;
        this.documento = documento;
        this.curso = curso;
        this.tipoSoporte = tipoSoporte;
        this.descripcion = descripcion;
        this.respuesta = respuesta;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTipoSoporte() {
        return tipoSoporte;
    }

    public void setTipoSoporte(String tipoSoporte) {
        this.tipoSoporte = tipoSoporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
