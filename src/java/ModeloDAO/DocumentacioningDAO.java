/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import Modelo.DocumentacionIng;
import Config.Conexion;
import Interfaces.CRUDdocumentacioning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DocumentacioningDAO implements CRUDdocumentacioning 
{
    Conexion cn = new Conexion();
 Connection con;
 PreparedStatement ps;
 ResultSet rs;
 DocumentacionIng d=new DocumentacionIng();

    @Override
    public List listar() {
      ArrayList<DocumentacionIng>list=new ArrayList<>();
        String sql="select * from documentacion";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            DocumentacionIng doc=new DocumentacionIng();
            
            doc.setIdDocumentacion(rs.getInt("idDocumentacion"));
            doc.setNombre(rs.getString("nombre"));
            doc.setApellido(rs.getString("apellido"));
            doc.setAcudiente(rs.getString("acudiente"));
            doc.setMatricula(rs.getString("matricula"));
            doc.setSalud(rs.getString("salud"));
            doc.setBoletin(rs.getString("boletin"));
            
            
            list.add(doc);
            }
        } catch (Exception e) {
            
        }
        return list;
    }

    
    @Override
    public DocumentacionIng list(int idDocumentacion) {
        String sql="select * from documentacion where idDocumentacion="+idDocumentacion;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            d.setIdDocumentacion(rs.getInt("idDocumentacion"));
            d.setNombre(rs.getString("nombre"));
            d.setApellido(rs.getString("apellido"));
            d.setAcudiente(rs.getString("acudiente"));
            d.setMatricula(rs.getString("matricula"));
            d.setSalud(rs.getString("salud"));
            d.setBoletin(rs.getString("boletin"));
            }
        } catch (Exception e) {
        }
        return d;
    }

    @Override
    public boolean add(DocumentacionIng doc) {
        String sql="insert into documentacion(nombre, apellido, acudiente, matricula, salud, boletin)values('"+doc.getNombre()+"','"+doc.getApellido()+"','"+doc.getAcudiente()+"','"+doc.getMatricula()+"','"+doc.getSalud()+"','"+doc.getBoletin()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(DocumentacionIng doc) {
        String sql="update documentacion set nombre='"+doc.getNombre()+"',apellido='"+doc.getApellido()+"',acudiente='"+doc.getAcudiente()+"',matricula='"+doc.getMatricula()+"',salud='"+doc.getSalud()+"',boletin='"+doc.getBoletin()+"' where idDocumentacion="+doc.getIdDocumentacion();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int idDocumentacion) {
        String sql="delete from documentacion where idDocumentacion="+idDocumentacion;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }


 
 
}
