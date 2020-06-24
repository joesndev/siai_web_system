

package ModeloDAO;

import Modelo.Servicio_cursos;
import Config.Conexion;
import Interfaces.CRUDservicio_cursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Servicio_cursosDAO implements CRUDservicio_cursos{
    
 Conexion cn = new Conexion();
 Connection con;
 PreparedStatement ps;
 ResultSet rs;
 Servicio_cursos s=new Servicio_cursos();
 

     @Override
    public List listar() {
       ArrayList<Servicio_cursos>list=new ArrayList<>();
        String sql="select * from cursos_servicio";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Servicio_cursos ser1=new Servicio_cursos();
            ser1.setIdServicioSocial(rs.getInt("idServicioSocial"));
            ser1.setNombre(rs.getString("nombre"));
            ser1.setApellido(rs.getString("apellido"));
            ser1.setNumHoras(rs.getString("numHoras"));
            ser1.setFirma(rs.getString("firma"));
            ser1.setNombreEntidad(rs.getString("NombreEntidad"));
            list.add(ser1);
            }
        } catch (Exception e) {
            
        }
        return list;
    }

     @Override
    public Servicio_cursos list(int idServicioSocial) {
         String sql="select * from cursos_servicio where idServicioSocial="+idServicioSocial;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            s.setIdServicioSocial(rs.getInt("idServicioSocial"));
            s.setNombre(rs.getString("nombre"));
            s.setApellido(rs.getString("apellido"));
            s.setNumHoras(rs.getString("numHoras"));
            s.setFirma(rs.getString("firma"));
            s.setNombreEntidad(rs.getString("NombreEntidad"));
            
            }
        } catch (Exception e) {
        }
        return s;
    }

    
    
    @Override
    public boolean add(Servicio_cursos ser) {
        String sql="insert into cursos_servicio (nombre, apellido, numHoras, firma, NombreEntidad)values('"+ser.getNombre()+"','"+ser.getApellido()+"','"+ser.getNumHoras()+"','"+ser.getFirma()+"','"+ser.getNombreEntidad()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    
    @Override
    public boolean edit(Servicio_cursos ser) {
        String sql="update cursos_servicio set nombre='"+ser.getNombre()+"',apellido='"+ser.getApellido()+"',numHoras='"+ser.getNumHoras()+"',firma='"+ser.getFirma()+"',NombreEntidad='"+ser.getNombreEntidad()+"' where idServicioSocial="+ser.getIdServicioSocial();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }


    
    @Override
    public boolean eliminar(int idServicioSocial) {
       String sql="delete from cursos_servicio where idServicioSocial="+idServicioSocial;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
    
}
