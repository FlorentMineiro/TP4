package sio.tp4.services;

import org.springframework.stereotype.Service;
import sio.tp4.entities.Secteur;
import sio.tp4.repositories.SecteurRepository;

import java.util.List;

@Service
public class SecteurServices {
    private SecteurRepository secteurRepository;


    public SecteurServices(SecteurRepository secteurRepository)
    {
        this.secteurRepository = secteurRepository;
    }

    public List<Secteur> getAllSecteurs()
    {
       return  secteurRepository.findAll();
    }
}
