/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;


public class DbConnector {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1111";
    private static final String DATABASE_NAME = "eLogisticManagmentSYSTEMDB";
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";
    

    public DbConnector() {
  
    }
    
    public Connection ConnectionBilder(){
        Connection connection =null;
               try{
           connection=DriverManager.getConnection(CONNECTION_STRING+DATABASE_NAME, USERNAME,PASSWORD);
           if(connection != null){
               System.out.println("Connected");
           }
        }   catch(SQLException e) {
            System.out.println(e.toString());
        }      
               return connection;
    }
    
    
    
    
}
