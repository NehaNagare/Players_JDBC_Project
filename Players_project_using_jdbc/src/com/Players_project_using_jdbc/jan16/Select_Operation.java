package com.Players_project_using_jdbc.jan16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Select_Operation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/myntra_db";
		String username = "root";
		String password = "root";
		String selectQuery="SELECT * FROM myntra_db.playerss";

		Class.forName(driver);
		System.out.println("Driver load successfully");

		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection create successfully");
		

		PreparedStatement pst =conn.prepareStatement(selectQuery);
		System.out.println("prepare statement object created successfully..");
		
		ResultSet rs = pst.executeQuery(selectQuery);
		
		List<Players> players_db=new ArrayList<>();
		while(rs.next()) {
			int l=rs.getInt(1);
			String m=rs.getString(2);
			int n=rs.getInt(3);
			int o=rs.getInt(4);
			String p=rs.getString(5);
			int q=rs.getInt(6);
			
			Players p1=new Players(l,m,n,o,p,q);
			players_db.add(p1);
			
		
		}
		for(Players p1: players_db) {
			System.out.println(p1.getJ_no()+" | "+p1.getP_names()+" | "+p1.getRuns()+" | "+p1.getWicket()+" | "+p1.getT_name()+"|"+p1.getAge());;
		}
		pst.close();
		rs.close();
		conn.close();
		

	}
}
