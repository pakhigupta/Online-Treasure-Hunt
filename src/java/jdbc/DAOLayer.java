package jdbc;

import java.sql.*;
public class DAOLayer 
{
    private static Connection con;
    static{
       try{
          Class.forName("com.mysql.jdbc.Driver");
          String url = "jdbc:mysql://localhost:3306/treasure_hunt";
          String user = "root";
          String pass = "asdf";
          con = DriverManager.getConnection(url,user,pass);
       }catch(Exception e){
           System.out.println("CONNECTION ERROR : "+e.getMessage());
       }
    }
    public static Connection getCon(){
     return con;
    }
    
    public static int updateData(String dml)
    {
     try{
         Statement s = con.createStatement();
         int ur = s.executeUpdate(dml);
         return ur;
     }catch(Exception e){
         System.out.println("UPDATE ERROR : "+e.getMessage());
         return -1;
     }
    }
    public static ResultSet selectData(String proj){
     try{
         Statement s = con.createStatement();
         ResultSet rs = s.executeQuery(proj);
         return rs;
     }catch(Exception e){
         System.out.println("SELECT ERROR : "+e.getMessage());
         return null;
     }
    }
    
    public static PreparedStatement getPrepareStatement(String upQuery){
     try{
         return con.prepareStatement(upQuery);
     }catch(Exception e){
         System.out.println("PS ERROR : "+e.getMessage());
         return null;
     }
    }
    
}
