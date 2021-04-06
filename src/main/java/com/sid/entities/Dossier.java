package com.sid.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25)
    private String titreDuLot;
    private TypeDossier type;
    private EtatDossier etat;
    private boolean plusieureLigne;
    private String nomFornisseur;
    private Devise devise;
    private String incoterm;
    private float coursEnDh;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;
    @OneToMany(mappedBy = "dossier")
    private List<Frais> frais;
    @OneToMany(mappedBy = "dossier")
    private List<LigneProduit> produits;
}
