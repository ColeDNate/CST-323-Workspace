package com.gcu.services;

import java.util.List;

import com.gcu.model.VehicleModel;

public interface VehicleServiceInterface {
	/**
	 * creates a List of EventModel into a static getEvents()
	 * @return
	 */
	public List<VehicleModel> getVehicles();
	/**
	 * creates a List of EventModel into a static getEvents()
	 * @return
	 */
	public VehicleModel addVehicle();

	public void addVehicle(VehicleModel vehicleModel);
	public void init();
	public void destroy();
}
