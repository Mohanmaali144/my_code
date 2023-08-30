package firstadd;

import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class FirstAdd {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "root", "root");
        Scanner sc = new Scanner(System.in);
        int roll = 107;
        String name = "pooja";
        int mark = 86;
        PreparedStatement ps;
       
//            System.out.println("ENter roll number: ");
//            roll = sc.nextInt();
//            System.out.println("ENter yoour name : ");
//            name = sc.next();
//            System.out.println("ENter mark :");
//            mark = sc.nextInt();

           // ps = con.prepareStatement("update mytable set roll = ? where name = ?");
           // ps = con.prepareStatement("delete from mytable where roll = ?");
         
          //  ps = con.prepareStatement("Alter table  mytable add (fees int)");
          // ps = con.prepareStatement("Alter table  mytable modify column mobile varchar(10)");
          //  ps = con.prepareStatement(" Alter table mytable drop column mobile ");
           ps = con.prepareStatement(" Alter table mytable drop column fees ");
           //ps.setInt(1, roll);
           // ps.setString(2, name);
//            ps.setInt(3, mark);
   
        int a = ps.executeUpdate();
 
        if (a > 0) {
            System.out.println("savedata");
            System.out.println("Succesfull");
        } else {
            System.out.println("faild");
        }

    }
}
