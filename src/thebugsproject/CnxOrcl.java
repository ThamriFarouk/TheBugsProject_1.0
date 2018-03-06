/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebugsproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CnxOrcl {
	
	public static Connection connexion;
	public static Statement inst;
	
	private String URL = "jdbc:oracle:thin:@localhost:1521/XE";
    private String Username = "system";
    private String Password = "merit300";
	
	CnxOrcl() throws SQLException, ClassNotFoundException{
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		connexion=DriverManager.getConnection(URL,Username,Password);
		
		
		inst=connexion.createStatement();
		
	}

}
