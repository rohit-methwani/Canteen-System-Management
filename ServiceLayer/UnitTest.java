package ServiceLayer;
import java.util.*;
public class UnitTest {
	/*********************************************************
	
				This class is used only for Unit Test	
	
	*********************************************************/
	public static void main(String[] args) {
		User u1 = new User();
	   	Food f1 = new Food();
	   	u1.createUser("user2@gmail.com","ppppaaaa");
	   	//u1.deleteUser("user1@gmail.com");
	   	// u1.deleteUser("user@gmail.com");
    	//f1.addFood("Kiwi",30,"Desert");
	   	Vector<String> data = new Vector();
	   	data=u1.retreiveUserEmail();
	   	if(data!=null){	
		   	for(int i=0;i<data.size();i++){
		   		System.out.println(data.elementAt(i));
		   	}
	   	}
	   	else{
	   		System.out.println("Null value recieved");
	   	}
	}
}
