package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

public class ConnectionModel {
	public void createConnection()
	{
		try
		{
			Vehicle v1=Vehicle.getInstance();
			String colorSel=v1.getVehicle_color();
			int ccSel=v1.getVehicle_cc();
			Class.forName("com.mysql.jdbc.Driver");
		//	String qry = "select * from customers where vehicle_cc="+v1.vehicle_cc+"and vehicle_color='"+v1.vehicle_color+" ' ";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/vehicles","root","password");
			Statement st = con.createStatement();	
			while(rs.next()) {
				v1.setVehicle_regn(rs.getString("VEHICLE_REGN"));
				v1.setVehicle_make(rs.getString("VEHICLE_MAKE"));
				v1.setVehicle_model(rs.getInt("VEHICLE_MODEL"));
			
				

				}
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WebContent/view2.jsp");
			dispatcher.forward(req, res);
		}
		else
		{
			RequestDispatcher dis=req.getRequestDispatcher("/WebContent/view3.jsp");
			dis.forward(req, res);

		}
		
	}catch(

	Exception ex)
	{

	}

}

}
