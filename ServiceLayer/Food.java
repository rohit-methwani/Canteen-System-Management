package ServiceLayer;

import java.sql.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Food {
	/*********************************************************
	
	This Class is used to perform CRUD operations on the Menu of the Canteen	
	
	*********************************************************/
	
	//Data Memebers
	Connection conn=ConnectDb.establishConnection();
	PreparedStatement statement=null;
	ResultSet rs=null;
	String sql;

	/**************************METHODS******************************/

	/**
		The below method adds the particular food item into menu
		@param:Name,Price,Category
		@return:void
	**/
	public void addFood(String name,int price,String cat){
		sql="INSERT INTO canteendb(foodname,price,foodcategory) VALUES (?,?,?)";
		try{
			statement=conn.prepareStatement(sql);
			statement.setString(1,name);
			statement.setInt(2,price);
			statement.setString(3,cat);
			statement.execute();
		}
		catch(SQLException e){
			System.out.println("Exception:"+e);
		}
	}

	/**
		The below method deletes the particular food item from menu
		@param:Name
		@return:void
	**/
	public void deleteFood(String name){
		sql="DELETE FROM canteendb WHERE foodname=?";
		try{
			statement=conn.prepareStatement(sql);
			statement.setString(1,name);
			statement.execute();
			JOptionPane.showMessageDialog(null,"Deleted Successfully!");
		}
		catch(SQLException e){
			System.out.println("Exception:"+e);
		}
	}

	/**
		The below method updates the particular food item into menu according to foodname
		@param:Name,Price,Category,Old Name
		@return:void
	**/
	public void updateFood(String newName,int price,String cat,String oldName){
		sql="UPDATE canteendb SET foodname=?,price=?,foodcategory=? WHERE foodname=? ";
		try{
			statement=conn.prepareStatement(sql);
			statement.setString(1,newName);
			statement.setInt(2,price);
			statement.setString(3,cat);
			statement.setString(4,oldName);
			statement.execute();
		}
		catch(SQLException e){
			System.out.println("Exception:"+e);
		}			
	}

	/**
		The below method retreives the menu
		@param:Nothing
		@return:Vector of Strings represented as Vector<String>
	**/
	public Vector<String> retrieveFoodname(){
		Vector<String> data=new Vector();
		int i=0;
		sql="SELECT * FROM canteendb";
		try{
			statement=conn.prepareStatement(sql);
			rs = statement.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("foodname"));
				data.addElement(rs.getString("foodname"));
				i++;
			}
			return data;
		}
		catch(SQLException e){
			System.out.println("Exception:"+e);
			return null;
		}
		catch(Exception e){
			System.out.println("Exception:"+e);
			return null;
		}
	}
}
