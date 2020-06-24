
package Interfaces;

import Modelo.Gestion_cursos;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface CRUDgestion_cursos {
    
    public List listar();
    public Gestion_cursos list(int idgestion);
    public boolean add (Gestion_cursos ges);
    public boolean edit (Gestion_cursos ges);
    public boolean eliminar (int idgestion);
    
}
