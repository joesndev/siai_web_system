package ModeloDAO;

import Config.Conexion;
import Modelo.RecursoDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RecursoDAO {

    /*Metodo listar*/
    public ArrayList<RecursoDTO> Listar_RECURSO() {
        ArrayList<RecursoDTO> list = new ArrayList<RecursoDTO>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM Recursopdf;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                RecursoDTO vo = new RecursoDTO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setArchivopdf2(rs.getBytes(2));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
               
            } catch (Exception ex) {
            }
        }
        return list;
    }


    /*Metodo agregar*/
    public void Agregar_RECURSO(RecursoDTO vo) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO Recursopdf (codigopdf, archivopdf) VALUES(?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
            ps.setBlob(2, vo.getArchivopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Modificar*/
    public void Modificar_RECURSO(RecursoDTO vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE Recursopdf SET archivopdf = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setBlob(1, vo.getArchivopdf());
            ps.setInt(2, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Eliminar*/
    public void Eliminar_RECURSO(int id) {
        Conexion conec = new Conexion();
        String sql = "DELETE FROM Recursopdf WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Consulta id*/
    public RecursoDTO getRecursoById(int studentId) {
        RecursoDTO vo = new RecursoDTO();
        Conexion db = new Conexion ();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT * FROM Recursopdf WHERE codigopdf = ?;";
        try {
            preparedStatement = db.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vo.setCodigopdf(rs.getInt(1));
                vo.setArchivopdf2(rs.getBytes(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                preparedStatement.close();
                
            } catch (Exception ex) {
            }
        }
        return vo;
    }

}
