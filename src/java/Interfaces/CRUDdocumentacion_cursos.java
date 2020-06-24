
package Interfaces;

import Modelo.Documentacion_cursos;
import java.util.List;


    
public interface CRUDdocumentacion_cursos {
    public List listar();
    public Documentacion_cursos list(int idDocumentacion);
    public boolean add (Documentacion_cursos doc);
    public boolean edit (Documentacion_cursos doc);
    public boolean eliminar (int idDocumentacion);
}