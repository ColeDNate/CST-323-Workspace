package com.gcu.services;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.VehicleModel;

public class VehicleService implements VehicleServiceInterface{
	/**
	 * creates a List of VehicleModel and places it into a static eventList
	 */
	private List<VehicleModel> vehicleList;

	/**
	 * @return eventList
	 */
	public List<VehicleModel> getVehicles() {
		//return list of events
		return vehicleList;
	}
	
	//Add Event adds an event to the list of the events
	/**
	 * 
	 * @param driver id
	 * @param driver name
	 * @param vehicle year
	 * @param vehicle make
	 * @param vehicle model
	 */
	public void addVehicle(String driverID, String driverName, int vehicleYear, String vehicleMake, String vehicleModel) {
		VehicleModel newRide = new VehicleModel(driverID, driverName, vehicleYear, vehicleMake, vehicleModel);
		vehicleList.add(newRide);
	}
	
	public void addVehicle(VehicleModel vehicleModel) {
		vehicleList.add(vehicleModel);
	}
	
	
	//Initializes the event list
	/**
	 * @void
	 * flavor text
	 * and a basic EventModel
	 */
	public void init() {
		
		//flavor text
		System.out.println("This is the init function");
		System.out.println("    Retrieving data...");
		
		//establishing new default event list
		vehicleList = new ArrayList<VehicleModel>();

		vehicleList.add(new VehicleModel("1", "Name1", 2001, "Maker 1", "Car 1"));
		vehicleList.add(new VehicleModel("2", "Name2", 2002, "Maker 2", "Car 2"));
		vehicleList.add(new VehicleModel("3", "Name3", 2003, "Maker 3", "Car 3"));
		vehicleList.add(new VehicleModel("4", "Name4", 2004, "Maker 4", "Car 4"));
	}
	
	//TODO: expand functionality of destroy
	public void destroy() {
		/**
		 * just prints a message to the console
		 */
		System.out.println("This is the destroy function");
	}

	@Override
	public VehicleModel addVehicle() {
		// TODO Auto-generated method stub
		return null;
	}


}
