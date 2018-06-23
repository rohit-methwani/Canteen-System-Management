package ServiceLayer;

import java.sql.*;

public class ConnectDb {
	/**************************************************************
	
	This class is used to establish Connection with the Database 
	under The username 'mysteryuser'

	***************************************************************/
    
    /*************************METHODS******************************/

	/**
	The below method is used to connect with Database.This is a static method.
	@param:Nothing
	@return:Connection object
	**/
    public static Connection establishConnection(){
    	try{
    		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen","mysteryuser","abcd1234");
    		return conn;
    	}
    	catch(SQLException e){
    		System.out.println("Connection not established:"+e);
    		return null;
    	}
    	catch(Exception e){
    		System.out.println("Some other issue:"+e);
    		return null;
    	}
    }
}
