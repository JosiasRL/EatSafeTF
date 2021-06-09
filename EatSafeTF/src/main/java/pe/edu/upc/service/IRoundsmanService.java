package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;
import pe.edu.upc.entity.Roundsman;

public interface IRoundsmanService {

	public void insert(Roundsman rm);

	List<Roundsman> list();

	public void delete(int id);
	
	Optional<Roundsman> listarID(int ID_Roundsman);
}
