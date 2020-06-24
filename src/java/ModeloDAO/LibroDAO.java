package ModeloDAO;

import Config.Conexion;
import Modelo.Libro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibroDAO {

    /*Metodo listar*/
    public ArrayList<Libro> Listar_libro() {
        ArrayList<Libro> list = new ArrayList<Libro>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM pdfLibro;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Libro vo = new Libro();
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setArchivopdf2(rs.getBytes(3));
                vo.setDescripcion(rs.getString(4));
                vo.setGenero(rs.getString(5));
                vo.setAutor(rs.getString(6));
                vo.setNumCapitulos(rs.getInt(7));
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
    public void Agregar_libro(Libro vo) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO pdfLibro (codigopdf, nombrepdf, archivopdf, descripcion, genero, autor, numCapitulos) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
            ps.setString(2, vo.getNombrepdf());
            ps.setBlob(3, vo.getArchivopdf());
            ps.setString(4, vo.getDescripcion());
            ps.setString(5, vo.getGenero());
            ps.setString(6, vo.getAutor());
            ps.setInt(7, vo.getNumCapitulos());
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
    public void Modificar_libro(Libro vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE pdfLibro SET nombrepdf = ?, archivopdf = ?, descripcion = ?, genero = ?, autor = ?, numCapitulos = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setBlob(2, vo.getArchivopdf());
            ps.setString(3, vo.getDescripcion());
            ps.setString(4, vo.getGenero());
            ps.setString(5, vo.getAutor());
            ps.setInt(6, vo.getNumCapitulos());
            ps.setInt(7, vo.getCodigopdf());
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
    public void Modificar_libro2(Libro vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE pdfLibro SET nombrepdf = ?, descripcion = ?, genero = ?, autor = ?, numCapitulos = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setString(2, vo.getDescripcion());
            ps.setString(3, vo.getGenero());
            ps.setString(4, vo.getAutor());
            ps.setInt(5, vo.getNumCapitulos());
            ps.setInt(6, vo.getCodigopdf());
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
    public void Eliminar_libro(int id) {
        Conexion conec = new Conexion();
        String sql = "DELETE FROM pdfLibro WHERE codigopdf = ?;";
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
    public Libro getLibroById(int studentId) {
        Libro vo = new Libro();
        Conexion db = new Conexion ();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT * FROM pdfLibro WHERE codigopdf = ?;";
        try {
            preparedStatement = db.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setArchivopdf2(rs.getBytes(3));
                vo.setDescripcion(rs.getString(4));
                vo.setGenero(rs.getString(5));
                vo.setAutor(rs.getString(6));
                vo.setNumCapitulos(rs.getInt(7));
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
