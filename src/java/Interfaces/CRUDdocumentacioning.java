/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.DocumentacionIng;
import java.util.List;

public interface CRUDdocumentacioning {
     public List listar();
    public DocumentacionIng list(int idDocumentacion);
    public boolean add (DocumentacionIng doc);
    public boolean edit (DocumentacionIng doc);
    public boolean eliminar (int idDocumentacion);
}
