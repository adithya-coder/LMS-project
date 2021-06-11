//sql6396905


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class database {
    
     public static Connection connect()
    {
        Connection con = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","" );
                   
        }
        catch (Exception se)
        {
             JOptionPane.showMessageDialog(null,se);
            
        }
        
        return con;
    }
    
   /*/public static void main(String []args){
   
      connect();
   }*/
}
