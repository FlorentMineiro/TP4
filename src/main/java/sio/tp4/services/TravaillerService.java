package sio.tp4.services;

import org.springframework.stereotype.Service;
import sio.tp4.repositories.TravaillerRepository;

@Service
public class TravaillerService {
    public TravaillerRepository travaillerRepository;

    public TravaillerService(TravaillerRepository travaillerRepository) {
        this.travaillerRepository = travaillerRepository;
    }

    public int getTotalHeuresSecteurs(int idSecteur)
    {
        return travaillerRepository.totalHeureSecteur(idSecteur);
    }
}
