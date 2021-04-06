package com.sid.dao;

import com.sid.entities.Dossier;
import com.sid.entities.EtatDossier;
import com.sid.entities.TypeDossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface DossierRepository extends JpaRepository<Dossier,Long> {
    List<Dossier> findDossierByTypeEquals(TypeDossier dossier);
    List<Dossier> findDossierByEtatEquals(EtatDossier etatDossier);
}
