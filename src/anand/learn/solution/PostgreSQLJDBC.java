package anand.learn.solution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class PostgreSQLJDBC {
   public static void main( String args[] ) {
      Connection c = null;
      PreparedStatement stmt = null;
      String query = "SELECT * FROM LOCALTIMESTAMP(0)";
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/hms",
            "anandpatel", "");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");

         stmt = c.prepareStatement(query);
         //stmt.setString(1,"demo");
         ResultSet rs = stmt.executeQuery();
         while ( rs.next() ) {
     
            String  name = rs.getString("aname");
            int age  = rs.getInt("kid");       
           
            System.out.println( "NAME = " + name );
            System.out.println( "AGE = " + age );          
            System.out.println();
         }
         rs.close();
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Operation done successfully");
   }
}
