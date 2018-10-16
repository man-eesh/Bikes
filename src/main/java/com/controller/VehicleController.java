package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/VehicleController")
public class VehicleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public VehicleController() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("asdasd");
		
		try {

			String colorSel = request.getParameter("mydropdown1");
			String ccSel = request.getParameter("mydropdown2");
			Vehicle vobj=Vehicle.getInstance();
			out.println(colorSel);
			out.println(ccSel);

			if(colorSel!=null || ccSel!=null)
			{
				
				if(colorSel!=null)
				{
					vobj.setVehicle_color(colorSel);
					out.println(vobj.getVehicle_color());
				}
				if(ccSel!=null)
				{
					vobj.setVehicle_cc(Integer.parseInt(ccSel));
				}
				out.println("Valid filters submitted");

				
			}
			else
			{			
				out.println("enter valid filters");
			}
			out.println("in controller end");
            VehicleModel veh1 =new VehicleModel();
            String Result1=veh1.getResult(colorSel);
            String Result2=veh1.getResult(ccSel);
            out.print(Result1);

		
		
			
			
		/*	req.setAttribute("color", vobj.vehicle_color);
			req.setAttribute("cc", vobj.vehicle_cc);
		*/	
			RequestDispatcher dispatcher = request.getRequestDispatcher("/view2.jsp");
			dispatcher.forward(request, response);
		}	
		catch(Exception e)
		{
			
		}
	}

}
