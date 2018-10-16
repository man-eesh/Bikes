package com.controller;

import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VehicleModel {
	public String getResult(String color)
	{
		

	System.out.println("inside vehiclemodel");
	Vehicle vehRes=Vehicle.getInstance();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    vehRes = em.find(Vehicle.class, color);
    String Result=vehRes.vehicle_regn+vehRes.vehicle_make+vehRes.vehicle_model+vehRes.vehicle_color;
    em.getTransaction().commit();

    return Result;

	}
}
