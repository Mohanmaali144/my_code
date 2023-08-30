
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

public class Retrieve {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "root", "root");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM MYTABLE");
        ResultSet rs = ps.executeQuery();
        
        
        while(rs.next())
        {
            int roll = rs.getInt(1);
            String name = rs.getString(2);
            int mark = rs.getInt(3);
            
            System.out.println(roll +"  "+ name+"  "+ mark);
            
        }
        
       con. close();
    }
}
