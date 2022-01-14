
package bd.edu.diu19216447.helpers;
import java.sql.*;

public class DBConnection {
    Connection cn;

    public Connection connection() {

        try {
            
            Class.forName("org.mariadb.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }

       try{
            cn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/friendsHouse?user=root&password=");
            System.out.println("Database connect..");
       }catch(SQLException e){
           System.out.println("Database connection fail "+ e);
       }
       
       return cn;

    }
}
