package sio.tp4.services;


import org.springframework.stereotype.Service;
import sio.tp4.entities.Employe;
import sio.tp4.repositories.EmployeRepositery;

import java.util.List;

@Service
public class EmployeService {
    private EmployeRepositery employeRepositery;

    public EmployeService(EmployeRepositery employeRepositery) {
        this.employeRepositery = employeRepositery;
    }

    public List<Employe> getAllEmployes()
    {
        return employeRepositery.findAll();
    }
}
