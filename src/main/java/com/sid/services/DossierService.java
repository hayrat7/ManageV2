package com.sid.services;

import com.sid.entities.Dossier;
import com.sid.entities.LigneProduit;
import com.sid.entities.Produit;

import java.util.List;

public interface DossierService {
    Dossier AjouterDossier(Dossier dossier);
    Dossier getDossierById(Long id);
    void supprimerDossierById(Long id);
    void ajouterLigneProduitToDossier(Dossier dosier,LigneProduit ligneProduit);
    List<Dossier> getDossiers();
    List<Dossier> getdossierFinis();
    List<Dossier> getdossierBrouillon();
    List<Dossier> getdossierOuvert();
    List<Dossier> getdossierFermer();
}
