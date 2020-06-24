/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban Gómez
 */
public class UsuarioDAO implements CRUD {

    Usuario dto = new Usuario();
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public Usuario VALIDACION(String usuario, String clave)
  {
      Usuario usua = new Usuario();
      String sql="SELECT * FROM usuario WHERE numeroDocumento="+usuario+" and clave="+clave;
      
      try
      {
          
          con = cn.getConnection();
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          
          while (rs.next())
          {
              usua.setNumeroDocumento(rs.getString("numeroDocumento"));
              usua.setClave(rs.getString("clave"));
              usua.setTipoUsuario(rs.getString("tipoUsuario"));
              usua.setEstado(rs.getString("estado"));
          }    
      }
      catch(SQLException e)
      {
          
      }
      return usua;
  }        

    @Override
    public List listar() {
        ArrayList <Usuario> list = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario dtousu = new Usuario(); 
                dtousu.setIdUsuario(rs.getInt("idUsuario"));
                dtousu.setNombre(rs.getString("nombre"));
                dtousu.setApellido(rs.getString("apellido"));
                dtousu.setTelefono(rs.getString("telefono"));
                dtousu.setCorreo(rs.getString("correo"));
                dtousu.setTipo_doc_Id(rs.getString("tipo_doc_Id"));
                dtousu.setTipoUsuario(rs.getString("tipoUsuario"));
                dtousu.setNumeroDocumento(rs.getString("numeroDocumento"));
                dtousu.setClave(rs.getString("clave"));
                dtousu.setEstado(rs.getString("estado"));

                list.add(dtousu);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Usuario list(int idUsuario) {
        String sql = "select * from usuario where idUsuario=" + idUsuario;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                dto.setIdUsuario(rs.getInt("idUsuario"));
                dto.setNombre(rs.getString("nombre"));
                dto.setApellido(rs.getString("apellido"));
                dto.setTelefono(rs.getString("telefono"));
                dto.setCorreo(rs.getString("correo"));
                dto.setTipo_doc_Id(rs.getString("tipo_doc_Id"));
                dto.setTipoUsuario(rs.getString("tipoUsuario"));
                dto.setNumeroDocumento(rs.getString("numeroDocumento"));
                dto.setClave(rs.getString("clave"));
                dto.setEstado(rs.getString("estado"));
            }
        } catch (Exception e) {
        }
        return dto;
    }

    @Override
    public boolean add(Usuario usu) {
        String SENTENCIA = "INSERT INTO usuario(nombre, apellido, telefono, correo, tipo_doc_Id, tipoUsuario, numeroDocumento, clave)VALUES('"+usu.getNombre()+"', '"+usu.getApellido()+"', '"+usu.getTelefono()+"', '"+usu.getCorreo()+"', '"+usu.getTipo_doc_Id()+"', '"+usu.getTipoUsuario()+"', '"+usu.getNumeroDocumento()+"', '"+usu.getClave()+"')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(SENTENCIA);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Usuario usu) {
        String SENTENCIA = "UPDATE usuario SET nombre='"+usu.getNombre()+"', apellido='"+usu.getApellido()+"', telefono='"+usu.getTelefono()+"', correo='"+usu.getCorreo()+"',  tipoUsuario='"+usu.getTipoUsuario()+"', numeroDocumento='"+usu.getNumeroDocumento()+"', clave='"+usu.getClave()+"' WHERE idUsuario="+usu.getIdUsuario();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(SENTENCIA);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int idUsuario) {
        String SENTENCIA = "DELETE FROM usuario WHERE idUsuario="+idUsuario;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(SENTENCIA);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean Habilitar(Usuario usu) {
       String SENTENCIA = "UPDATE usuario SET estado='Habilitado' WHERE idUsuario="+usu.getIdUsuario();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(SENTENCIA);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean Deshabilitar(Usuario usu) {
       String SENTENCIA = "UPDATE usuario SET estado='Deshabilitado' WHERE idUsuario="+usu.getIdUsuario();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(SENTENCIA);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
