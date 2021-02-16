
package rentcars;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 * 
 */
public class Connexion {
    public Connection CreateConnection (){
            Connection connection= null ;
      MysqlDataSource mds=new MysqlDataSource();
      mds.setServerName("localhost");
      mds.setPortNumber(3306);
      mds.setUser("root");
      mds.setPassword("");
      mds.setDatabaseName("rentcars");
        try {
            connection= mds.getConnection();
            
            /*try {Class.forName("com.mysql.jdbc.Driver");
            }catch(ClassNotFoundException e){
            System.err.println(e);
            }
            try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/RentCars","root","");
            } catch(SQLException e ){System.err.println(e);}
            }
            Connection obtenirconnexion(){return conn;}
        */  } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
return connection;
    }
}