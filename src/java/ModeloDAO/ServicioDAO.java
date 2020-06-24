
package ModeloDAO;
import Modelo.Servicio;
import Config.Conexion;
import Interfaces.CRUDservicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ServicioDAO implements CRUDservicio {
 Conexion cn = new Conexion();
 Connection con;
 PreparedStatement ps;
 ResultSet rs;
 Servicio s=new Servicio();

    
    @Override
    public List listar() {
       ArrayList<Servicio>list=new ArrayList<>();
        String sql="select * from serviciosocial";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Servicio ser1=new Servicio();
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
    public Servicio list(int idServicioSocial) {
         String sql="select * from serviciosocial where idServicioSocial="+idServicioSocial;
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
    public boolean add(Servicio ser) {
        String sql="insert into serviciosocial(nombre, apellido, numHoras, firma, NombreEntidad)values('"+ser.getNombre()+"','"+ser.getApellido()+"','"+ser.getNumHoras()+"','"+ser.getFirma()+"','"+ser.getNombreEntidad()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }


    @Override
    public boolean edit(Servicio ser) {
        String sql="update serviciosocial set nombre='"+ser.getNombre()+"',apellido='"+ser.getApellido()+"',numHoras='"+ser.getNumHoras()+"',firma='"+ser.getFirma()+"',NombreEntidad='"+ser.getNombreEntidad()+"' where idServicioSocial="+ser.getIdServicioSocial();
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
       String sql="delete from serviciosocial where idServicioSocial="+idServicioSocial;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
    
}
