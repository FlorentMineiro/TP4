package sio.tp4.services;

import org.springframework.stereotype.Repository;
import sio.tp4.entities.Rayon;
import sio.tp4.entities.Secteur;
import sio.tp4.repositories.RayonRepository;

import java.util.List;

@Repository
public class RayonService {
    private RayonRepository rayonRepository;

    public RayonService(RayonRepository rayonRepository) {
        this.rayonRepository = rayonRepository;
    }

    public List<Rayon> allGetRayonsByIdSecteur(Secteur secteur)
    {
        return rayonRepository.findByNumSecteur(secteur);
    }
}
