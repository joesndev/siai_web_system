

package Interfaces;

import Modelo.GestionIng;
import java.util.List;


public interface CRUDgestioning {
   
    public List listar();
    public GestionIng list(int idgestion);
    public boolean add (GestionIng ges);
    public boolean edit (GestionIng ges);
    public boolean eliminar (int idgestion);
    
}
