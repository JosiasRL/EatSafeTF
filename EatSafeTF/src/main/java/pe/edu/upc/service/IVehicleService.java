package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Vehicle;

public interface IVehicleService {

	public void insert(Vehicle vh);

	List<Vehicle> list();

	public void delete(int id);
}
