/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.SupportInterface;
import Modelo.Soporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johann Esneider
 */
public class SupportDAO implements SupportInterface{
    Conexion conn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Soporte support = new Soporte();
    @Override
    public List listar() {
        ArrayList<Soporte> list = new ArrayList<>();
        String ConsultaSQL = "SELECT * FROM Support";
        try {
            con = conn.getConnection();
            ps = con.prepareStatement(ConsultaSQL);
            rs = ps.executeQuery();
            while(rs.next()){
            Soporte sop = new Soporte();
            sop.setId(rs.getInt("Id"));
            sop.setDocumento(rs.getString("documento"));
            sop.setCurso(rs.getString("curso"));
            sop.setTipoSoporte(rs.getString("tipoSoporte"));
            sop.setDescripcion(rs.getString("descripcion"));
            sop.setRespuesta(rs.getString("respuesta"));
            list.add(sop);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Soporte list(int Id) {
        String SentenciaSQL = "SELECT * FROM Support WHERE Id="+Id;
        try {
            con = conn.getConnection();
            ps = con.prepareStatement(SentenciaSQL);
            rs = ps.executeQuery();
            while(rs.next()){
            support.setId(rs.getInt("Id"));
            support.setDocumento(rs.getString("documento"));
            support.setCurso(rs.getString("curso"));
            support.setTipoSoporte(rs.getString("tipoSoporte"));
            support.setDescripcion(rs.getString("descripcion"));
            support.setRespuesta(rs.getString("respuesta"));
            }
        } catch (Exception e) {
        }
        return support;
    }

    @Override
    public boolean add(Soporte sop) {
        String SentenciaSQL = "INSERT INTO Support(documento, tipoSoporte, descripcion)VALUES( ?, ?, ?)";
        try {
            con = conn.getConnection();
            ps = con.prepareStatement(SentenciaSQL);
            ps.setString(1, sop.getDocumento());
            ps.setString(2, sop.getTipoSoporte());
            ps.setString(3, sop.getDescripcion());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int Id) {
        String SentenciaSQL = "DELETE FROM Support WHERE Id="+Id;
        try {
            con = conn.getConnection();
            ps = con.prepareStatement(SentenciaSQL);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Soporte sop) {
        String SentenciaSQL = "UPDATE Support SET respuesta=? WHERE Id=?";
        try {
            con = conn.getConnection();
            ps = con.prepareStatement(SentenciaSQL);
            ps.setString(1, sop.getRespuesta());
            ps.setInt(2, sop.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
