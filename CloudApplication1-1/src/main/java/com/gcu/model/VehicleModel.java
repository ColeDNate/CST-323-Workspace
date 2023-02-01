package com.gcu.model;

public class VehicleModel {
	
	/*** VARIABLES ***/
	private String driverID;
	private String driverName;
	private int vehicleYear;
	private String vehicleMake;
	private String vehicleModel;
	
	
	/*** CONSTRUCTORS ***/
	//default
	public VehicleModel() {
		
	}
	//full constructor
	public VehicleModel(String driverID, String driverName, int vehicleYear, String vehicleMake, String vehicleModel) {
		setDriverID(driverID);
		setDriverName(driverName);
		setVehicleYear(vehicleYear);
		setVehicleMake(vehicleMake);
		setVehicleModel(vehicleModel);
	}
	
	/*** FUNCTIONS ***/
	//driver id
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
	public String getDriverID() {
		return driverID;
	}
	
	//driver name
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverName() {
		return driverName;
	}
	
	//vehicle year
	public void setVehicleYear(int vehicleYear) {
		this.vehicleYear = vehicleYear;
	}
	public int getVehicleYear() {
		return vehicleYear;
	}
	
	//vehicle make
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	public String getVehicleMake() {
		return vehicleMake;
	}
	
	//vehicle model
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}

}
