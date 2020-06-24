package Interfaces;


import Modelo.Gestion;
import java.util.List;


public interface CRUDgestion {
      
    public List listar();
    public Gestion list(int idgestion);
    public boolean add (Gestion ges);
    public boolean edit (Gestion ges);
    public boolean eliminar (int idgestion);
    
}
