/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.InputStream;

/**
 *
 * @author Johann Esneider
 */
public class RecursoDTO {
   private int codigopdf;
   private InputStream archivopdf;
   private byte[] archivopdf2;

    public RecursoDTO() {
    }

    public RecursoDTO(int codigopdf, InputStream archivopdf, byte[] archivopdf2) {
        this.codigopdf = codigopdf;
        this.archivopdf = archivopdf;
        this.archivopdf2 = archivopdf2;
    }

    public int getCodigopdf() {
        return codigopdf;
    }

    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
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
   
   
   
}
