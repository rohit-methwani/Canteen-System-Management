package ServiceLayer;

import java.sql.*;
import java.util.*;

public class User {

    /******************************************************************
	
	This class is used to perform CRUD operations on User Data

    ******************************************************************/
    
    /*************************DATA MEMBERS****************************/
    ResultSet rs;
    Connection conn=ConnectDb.establishConnection();
    PreparedStatement statement;
    String sql;

    //*************************METHODS*********************************/

    /**
    The below method is used to add a new User.
    @param:User email,User password
    @return:Nothing
    **/
    public void createUser(String email,String password){
    	if(checkUser(email)){
    		sql="INSERT INTO users(email,password) VALUES (?,?)";
	    	try{
	    		statement=conn.prepareStatement(sql);
	    		statement.setString(1,email);
	    		statement.setString(2,password);
	    		statement.execute();
	    		System.out.println("Welcome "+email);
	    	}
	    	catch(SQLException e){
	    		System.out.println("Issue in creating user"+e);
	    	}
    	}
    	else{
                System.out.println("User already exists");
    	}
    }

    /**
    The below method is used to delete an existing User.
    @param:User email
    @return:Nothing
    **/
    public void deleteUser(String email){
    	sql="DELETE FROM users WHERE email=?";
    	try{
    		statement=conn.prepareStatement(sql);
    		statement.setString(1,email);
    		statement.execute();
    		System.out.println("Deleted successfully!");
    	}
    	catch(SQLException e){
    		System.out.println("Issue in deleting:"+e);
    	}
    }

    /**
    The below method is used to check whether the user exists or not.
    @param:User email
    @return:Boolean(true if not exists)
    */
    public boolean checkUser(String email){
    	boolean flag=true;
    	sql="SELECT email FROM users";
    	try{
    		statement=conn.prepareStatement(sql);
    		rs=statement.executeQuery();
    		while(rs.next()){
    			if(email.equals(rs.getString("email"))){
    				System.out.println(rs.getString("email"));
    				flag=false;
    			}
    			else{
    				System.out.println(rs.getString("email"));
    				flag=true;
    			}
    		}
    		rs.next();
    		return flag;
    	}
    	catch(SQLException e){
    		System.out.println("Issue in checkUser:"+e);
    		return false;
    	}
    }

    /**
    The below method is used to retreive user email.
    @param:Nothing
    @return:Vector of Strings represented as Vector<String>
    **/
    public Vector<String> retreiveUserEmail(){
    	Vector<String> users = new Vector();
    	sql="SELECT email FROM users";
    	try{
    		statement=conn.prepareStatement(sql);
    		rs=statement.executeQuery();
    		while(rs.next()){
    			users.addElement(rs.getString("email"));
    			rs.next();
    		}
    		return users;
    	}
    	catch(SQLException e){
    		System.out.println("Issue in retriveUserEmail:"+e);
    		return null;
    	}
    }
}
