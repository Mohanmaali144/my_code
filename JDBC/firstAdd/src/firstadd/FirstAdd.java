package firstadd;

import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class FirstAdd {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "root", "root");
        Scanner sc = new Scanner(System.in);
      int roll = 0;
      String name =null;
      int mark = 0;
      PreparedStatement ps = null;
      for(int i=1;i<=3;i++)
      {
          System.out.println("ENter roll number: ");
          roll = sc.nextInt();
           System.out.println("ENter yoour name : ");
           name = sc.next();
           System.out.println("ENter mark :");
          mark = sc.nextInt();
           
        ps = con.prepareStatement("insert into mytable values(?,?,?)");
      
        ps.setInt(1,roll);
        ps.setString(2,name);
        ps.setInt(3,mark);
        con.close();
      }
        int a = ps.executeUpdate();

        if (a > 0) {
            System.out.println("savedata");
            System.out.println("Succesfull");
        } else {
            System.out.println("faild");
        }

    }
}
