/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Documentacion;
import java.util.List;
        
public interface CRUDdocumentacion {
    public List listar();
    public Documentacion list(int idDocumentacion);
    public boolean add (Documentacion doc);
    public boolean edit (Documentacion doc);
    public boolean eliminar (int idDocumentacion);
}
