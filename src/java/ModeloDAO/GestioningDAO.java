/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.GestionIng;
import Config.Conexion;
import Interfaces.CRUDgestioning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public class GestioningDAO implements CRUDgestioning 

{

  Conexion cn = new Conexion();
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  GestionIng g= new GestionIng();
  
  
    @Override
    public List listar() {
        ArrayList<GestionIng>list=new ArrayList<>();
        String sql="select * from gestion";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            GestionIng ges=new GestionIng();
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
    public GestionIng list(int idGestion) {
       String sql="select * from gestion where idGestion ="+idGestion;
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
    public boolean add(GestionIng ges) {
       String sql="insert into gestion (nombre, descripcion, materia, fecha, periodo, recurso)values('"+ges.getNombre()+"','"+ges.getDescripcion()+"','"+ges.getMateria()+"','"+ges.getFecha()+"','"+ges.getPeriodo()+"','"+ges.getRecurso()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(GestionIng ges) {
       String sql="update gestion set nombre='"+ges.getNombre()+"',descripcion='"+ges.getDescripcion()+"',materia='"+ges.getMateria()+"',fecha='"+ges.getFecha()+"',periodo='"+ges.getPeriodo()+"',recurso='"+ges.getRecurso()+"' where idGestion="+ges.getIdGestion();
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
       String sql="delete from gestion where idGestion="+idGestion;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
