package videoswing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;


public class connection {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme","root","12345678");
			if(conn!=null) {
				System.out.println("basarili");
			}
		}
		catch(Exception e){
			System.out.println("basarili degil");
		}
		
	}

}
