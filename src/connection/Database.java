/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;




import java.sql.DriverManager;


public class Database {
	public static java.sql.Connection con = null;
	private static Database instance = new Database();
	

	public static Database getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	public void connect() {
		 String url = "jdbc:sqlserver://localhost:1433;databasename=QLBH";
		 String user = "sa";
		 String password = "sa";
		 
		 try {
			con = DriverManager.getConnection(url, user,password);
			 System.out.print("ok");
		 }catch(Exception e) {
			 System.out.print("fall");
		 }
		 
		            
	}
	
	public static java.sql.Connection getConnection() {
		return con;
	}

	
	
}
