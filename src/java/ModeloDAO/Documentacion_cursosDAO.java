

package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUDdocumentacion_cursos;
import Modelo.Documentacion_cursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Documentacion_cursosDAO implements CRUDdocumentacion_cursos {
    
 Conexion cn = new Conexion();
 Connection con;
 PreparedStatement ps;
 ResultSet rs;
 Documentacion_cursos d=new Documentacion_cursos();

    @Override
    public List listar() {
         ArrayList<Documentacion_cursos>list=new ArrayList<>();
        String sql="select * from documentacion_cursos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Documentacion_cursos doc=new Documentacion_cursos();
            
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
    public Documentacion_cursos list(int idDocumentacion) {
         String sql="select * from documentacion_cursos where idDocumentacion="+idDocumentacion;
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
    public boolean add(Documentacion_cursos doc) {
        String sql="insert into documentacion_cursos(nombre, apellido, acudiente, matricula, salud, boletin)values('"+doc.getNombre()+"','"+doc.getApellido()+"','"+doc.getAcudiente()+"','"+doc.getMatricula()+"','"+doc.getSalud()+"','"+doc.getBoletin()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Documentacion_cursos doc) {
         String sql="update documentacion_cursos set nombre='"+doc.getNombre()+"',apellido='"+doc.getApellido()+"',acudiente='"+doc.getAcudiente()+"',matricula='"+doc.getMatricula()+"',salud='"+doc.getSalud()+"',boletin='"+doc.getBoletin()+"' where idDocumentacion="+doc.getIdDocumentacion();
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
