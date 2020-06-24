
package Interfaces;

import Modelo.Usuario;
import java.util.List;


public interface CRUD {
  
    public List listar();
    public Usuario list(int idUsuario);
    public boolean add (Usuario usu);
    public boolean edit (Usuario usu);
    public boolean eliminar (int idUsuario);
    public boolean Habilitar (Usuario usu);
    public boolean Deshabilitar (Usuario usu);
    
           
}
