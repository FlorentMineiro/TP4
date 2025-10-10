package sio.tp4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sio.tp4.entities.Travailler;

@Repository
public interface TravaillerRepository extends JpaRepository<Travailler,Integer>
{
    @Query("select  sum (t.temps) from Travailler t where t.codeRayon.numSecteur.id=:idSecteur")
    public int totalHeureSecteur(@Param("idSecteur") int idSecteur);

}
