package pe.edu.upc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Vehicle;
import pe.edu.upc.repository.VehicleRepository;
import pe.edu.upc.service.IVehicleService;

@Service
public class VechicleServiceImpl implements IVehicleService	{

	@Autowired
	private VehicleRepository vr;

	@Override
	public void insert(Vehicle vh) {
		vr.save(vh);
	}

	@Override
	public List<Vehicle> list() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}

	@Override
	public void delete(int id) {
		vr.deleteById(id);
	}
}
