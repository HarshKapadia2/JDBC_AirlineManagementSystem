/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.airlinemanagementjdbc;

import java.sql.*;

/**
 *
 * @author nakul
 */
public class AirlineTest {
    
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/airline_test";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "171019@Mysql";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 1: Register JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      //STEP 2: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 3: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM employee";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 4: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int emp_id  = rs.getInt("emp_id");
         String emp_name = rs.getString("emp_name");

         //Display values
         System.out.print("Emp ID: " + emp_id);
         System.out.println(", Name: " + emp_name);
      }
      //STEP 5: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
   } 
}
