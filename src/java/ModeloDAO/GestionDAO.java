package ModeloDAO;
import Modelo.Gestion;
import Config.Conexion;
import Interfaces.CRUDgestion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class GestionDAO implements CRUDgestion
{
  Conexion cn = new Conexion();
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  Gestion g= new Gestion();

@Override
    public List listar() {
        ArrayList<Gestion>list=new ArrayList<>();
        String sql="select * from gestion";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Gestion ges=new Gestion();
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
    public Gestion list(int idGestion) {
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
    public boolean add(Gestion ges) {
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
    public boolean edit(Gestion ges) {
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


