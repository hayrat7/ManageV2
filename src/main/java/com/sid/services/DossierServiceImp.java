package com.sid.services;

import com.sid.dao.DossierRepository;
import com.sid.entities.Dossier;
import com.sid.entities.EtatDossier;
import com.sid.entities.LigneProduit;
import com.sid.entities.TypeDossier;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DossierServiceImp implements DossierService{
    private DossierRepository dossierRepository;
    @Override
    public Dossier AjouterDossier(Dossier dossier) {
        return dossierRepository.save(dossier);
    }

    @Override
    public Dossier getDossierById(Long id) {
        return dossierRepository.findById(id).get();
    }

    @Override
    public void supprimerDossierById(Long id) {
        dossierRepository.deleteById(id);
    }

    @Override
    public void ajouterLigneProduitToDossier(Dossier dossier,LigneProduit ligneProduit) {
        dossier.getProduits().add(ligneProduit);
    }

    @Override
    public List<Dossier> getDossiers() {
        return dossierRepository.findAll();
    }

    @Override
    public List<Dossier> getdossierFinis() {
        return dossierRepository.findDossierByTypeEquals(TypeDossier.FINIS);
    }

    @Override
    public List<Dossier> getdossierBrouillon() {
        return dossierRepository.findDossierByTypeEquals(TypeDossier.BROUILLON);
    }

    @Override
    public List<Dossier> getdossierOuvert() {
        return dossierRepository.findDossierByEtatEquals(EtatDossier.OUVERT);
    }

    @Override
    public List<Dossier> getdossierFermer() {
        return dossierRepository.findDossierByEtatEquals(EtatDossier.FERMER);
    }
}
