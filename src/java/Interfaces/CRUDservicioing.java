/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.ServicioIng;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public interface CRUDservicioing {
    
    public List listar();
    public ServicioIng list(int idServicioSocial);
    public boolean add (ServicioIng ser);
    public boolean edit (ServicioIng ser);
    public boolean eliminar (int idServicioSocial);
    
}
