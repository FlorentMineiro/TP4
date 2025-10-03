package sio.tp4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sio.tp4.entities.Secteur;

@Repository

public interface SecteurRepository extends JpaRepository<Secteur,Integer> {

}
