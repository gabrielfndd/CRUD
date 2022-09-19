import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
public class conexaobd {
    public Connection Connection(){ 
        Connection con = null;
        try {
            String url = "jdbc:mysql//localhost:3306//crudmk?user=root&password=";
            con = DriverManager.getConnection(url);
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Connection"+ erro.getMessage());
        }
        return con;
    }
            
    
}
