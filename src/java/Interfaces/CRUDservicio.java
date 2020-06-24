
package Interfaces;

import Modelo.Servicio;
import java.util.List;


public interface CRUDservicio {
  
    public List listar();
    public Servicio list(int idServicioSocial);
    public boolean add (Servicio ser);
    public boolean edit (Servicio ser);
    public boolean eliminar (int idServicioSocial);
    
           
}