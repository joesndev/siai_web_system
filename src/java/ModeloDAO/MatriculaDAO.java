package ModeloDAO;

import Config.Conexion;
import Modelo.Matricula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MatriculaDAO {

    /*Metodo listar*/
    public ArrayList<Matricula> Listar_matricula() {
        ArrayList<Matricula> list = new ArrayList<Matricula>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM Matricula;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Matricula vo = new Matricula();
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
    public void Agregar_matricula(Matricula vo) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO Matricula (codigopdf, archivopdf) VALUES(?, ?);";
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
    public void Modificar_matricula(Matricula vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE Matricula SET archivopdf = ? WHERE codigopdf = ?;";
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
    public void Eliminar_matricula(int id) {
        Conexion conec = new Conexion();
        String sql = "DELETE FROM Matricula WHERE codigopdf = ?;";
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
    public Matricula getMatriculaById(int studentId) {
        Matricula vo = new Matricula();
        Conexion db = new Conexion ();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT * FROM Matricula WHERE codigopdf = ?;";
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
