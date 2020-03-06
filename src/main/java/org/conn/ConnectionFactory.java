package org.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String db = System.getProperty("user.dir")+"\\db\\Produto.db";
	private String url = "jdbc:sqlite:"+db;    
    private String driverName = "org.sqlite.JDBC";   
    private Connection conn;
	
    public Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
            	conn = DriverManager.getConnection(url);
            	System.out.println("==BD Conectado==");
            	
            } catch (SQLException e) {
            	System.out.println(db);
            	System.out.println("A criação de uma conexão com o BD falhou!"); 
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encotrado!"); 
        }
        return conn;
    }
//    
//    public static void main(String[] args) {
//    	String db = System.getProperty("user.dir")+"\\db\\Produto.db";
//    	File file = new File(db);
//    	if (file.exists()) {
//    		System.out.println("Existe");
//		}
//	}
}
