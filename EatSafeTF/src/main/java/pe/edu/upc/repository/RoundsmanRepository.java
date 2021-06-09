package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Roundsman;

@Repository
public interface RoundsmanRepository extends JpaRepository<Roundsman, Integer>{

}
