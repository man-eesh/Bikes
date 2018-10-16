package com.controller;


public class Vehicle {
		String vehicle_regn;
		String vehicle_make;
		int vehicle_model;
		int vehicle_cc;
		String vehicle_color;

		private static Vehicle myobj;
		private Vehicle() {}
		public static Vehicle getInstance()
		{
			if(myobj==null)
			{
				myobj=new Vehicle();
			}
			return myobj;
		}
		
		public String getVehicle_regn() {
			return vehicle_regn;
		}

		public void setVehicle_regn(String vehicle_regn) {
			this.vehicle_regn = vehicle_regn;
		}

		public String getVehicle_make() {
			return vehicle_make;
		}

		public void setVehicle_make(String vehicle_make) {
			this.vehicle_make = vehicle_make;
		}

		public int getVehicle_model() {
			return vehicle_model;
		}

		public void setVehicle_model(int vehicle_model) {
			this.vehicle_model = vehicle_model;
		}

		public int getVehicle_cc() {
			return vehicle_cc;
		}

		public void setVehicle_cc(int vehicle_cc) {
			this.vehicle_cc = vehicle_cc;
		}

		public String getVehicle_color() {
			return vehicle_color;
		}

		public void setVehicle_color(String vehicle_color) {
			this.vehicle_color = vehicle_color;
		}

	


}
