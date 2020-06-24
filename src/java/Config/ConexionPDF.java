package Config;

import java.sql.*;

public class ConexionPDF{
    Connection con;

    public ConexionPDF(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://node41230-sena-adsi.jelastic.saveincloud.net:3306/siaibd1","root","BKQbaa47854");            
           
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
