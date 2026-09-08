
package cs;

import java.sql.*;

public class Conexion {
    
    private Connection con=null;
    
    public void conexion ()
    {
        conectar();
    }
    
    public void conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/escolar", "root", /*En las comillas vacias va tu contraseña de Mysql*/"");

            System.out.println("Conectado a la base de datos de mysql");
            System.out.println("Ya esta listo");
    }
    catch(ClassNotFoundException cnfe)
    {
        System.out.println(cnfe.getMessage());
    }
    catch(SQLException sqle)
    {
        System.out.println(sqle.getMessage());
    }
}
}
