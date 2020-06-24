/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Servicio_cursos;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface CRUDservicio_cursos {
    
      public List listar();
    public Servicio_cursos list(int idServicioSocial);
    public boolean add (Servicio_cursos ser);
    public boolean edit (Servicio_cursos ser);
    public boolean eliminar (int idServicioSocial);
    
    
}
