package sio.tp4.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sio.tp4.entities.Employe;

import java.util.List;

@Repository
public interface EmployeRepositery extends JpaRepository<Employe,Integer>
{
    @Override
    List<Employe> findAll();
}
