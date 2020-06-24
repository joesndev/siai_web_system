/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUDgestion_cursos;
import Modelo.Gestion_cursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Gestion_cursosDAO implements CRUDgestion_cursos{

  Conexion cn = new Conexion();
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  Gestion_cursos g= new Gestion_cursos();
    
    
    
    @Override
    public List listar() {
        ArrayList<Gestion_cursos>list=new ArrayList<>();
        String sql="select * from gestioncursos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Gestion_cursos ges=new Gestion_cursos();
            ges.setIdGestion(rs.getInt("idGestion"));
            ges.setNombre(rs.getString("nombre"));
            ges.setDescripcion(rs.getString("descripcion"));
            ges.setMateria(rs.getString("materia"));
            ges.setFecha(rs.getString("fecha"));
            ges.setPeriodo(rs.getString("periodo"));
            ges.setRecurso(rs.getString("recurso"));
            list.add(ges);
            }
        } catch (Exception e) {
            
        }
        return list;
    }
    
    
    @Override
    public Gestion_cursos list(int idGestion) {
        String sql="select * from gestioncursos where idGestion ="+idGestion;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            g.setIdGestion(rs.getInt("idGestion"));
            g.setNombre(rs.getString("nombre"));
            g.setDescripcion(rs.getString("descripcion"));
            g.setMateria(rs.getString("materia"));
            g.setFecha(rs.getString("fecha"));
            g.setPeriodo(rs.getString("periodo"));
            g.setRecurso(rs.getString("recurso"));
            
            }
        } catch (Exception e) {
        }
        return g;
    }

    
    
     @Override
    public boolean add(Gestion_cursos ges) {
    String sql="insert into gestioncursos (nombre, descripcion, materia, fecha, periodo, recurso)values('"+ges.getNombre()+"','"+ges.getDescripcion()+"','"+ges.getMateria()+"','"+ges.getFecha()+"','"+ges.getPeriodo()+"','"+ges.getRecurso()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    
 @Override
    public boolean edit(Gestion_cursos ges) {
        String sql="update gestioncursos set nombre='"+ges.getNombre()+"',descripcion='"+ges.getDescripcion()+"',materia='"+ges.getMateria()+"',fecha='"+ges.getFecha()+"',periodo='"+ges.getPeriodo()+"',recurso='"+ges.getRecurso()+"' where idGestion="+ges.getIdGestion();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    

    @Override
    public boolean eliminar(int idGestion) {
     String sql="delete from gestioncursos where idGestion="+idGestion;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}