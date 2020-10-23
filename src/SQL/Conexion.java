
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author sara.guevara
 */
public class Conexion {
   
    public static Connection getConexion() throws SQLException {
        
        Connection cone = null;
        String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String jdbcUrl = "";
        String user;
        String pass;
        try {
            Class.forName(jdbcDriver);
            //System.out.println("Driver cargado!");            
        }catch(ClassNotFoundException ex){
            System.out.println("Error Driver: "+ex.getMessage());
        }
        jdbcUrl = "jdbc:sqlserver://Sistemas2:1433; databasename = bd_epysa_peru;integratedSecurity=true;";                    
                    user = "admecsperu";
                    pass = "";//epysa2014 cuando me conecto a mi local no le pongo pass okaz////////
                    
                    
                    /*se guardo los datos ejemploxxxxxxxxxxxxxxxxxxxxxx*/
                    
                    
        try {
           cone = DriverManager.getConnection(jdbcUrl); 
           
           System.out.println("conecto ");
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }            
        return cone;   
    }
}
//aqui solo hacia prueba


  
