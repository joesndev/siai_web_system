package Modelo;

import java.io.InputStream;

public class Libro {

    /*Todo los atributos*/
    int codigopdf;
    String nombrepdf;
    InputStream archivopdf;
    private byte[] archivopdf2;
    String descripcion;
    String genero;
    String autor;
    int numCapitulos;
    public Libro() {
    }

    public Libro(int codigopdf, String nombrepdf, InputStream archivopdf, byte[] archivopdf2, String descripcion, String genero, String autor, int numCapitulos) {
        this.codigopdf = codigopdf;
        this.nombrepdf = nombrepdf;
        this.archivopdf = archivopdf;
        this.archivopdf2 = archivopdf2;
        this.descripcion = descripcion;
        this.genero = genero;
        this.autor = autor;
        this.numCapitulos = numCapitulos;
    }

    public int getCodigopdf() {
        return codigopdf;
    }

    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
    }

    public String getNombrepdf() {
        return nombrepdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public InputStream getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(InputStream archivopdf) {
        this.archivopdf = archivopdf;
    }

    public byte[] getArchivopdf2() {
        return archivopdf2;
    }

    public void setArchivopdf2(byte[] archivopdf2) {
        this.archivopdf2 = archivopdf2;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumCapitulos(){
        return numCapitulos;
    }
    public void setNumCapitulos(int numCapitulos){
        this.numCapitulos = numCapitulos;
    }
}
