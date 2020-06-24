
package Interfaces;

import Modelo.Soporte;
import java.util.List;


public interface SupportInterface {
  
    public List listar();
    public Soporte list(int Id);
    public boolean add (Soporte sop);
    public boolean edit (Soporte sop);
    public boolean eliminar (int Id);
           
}
