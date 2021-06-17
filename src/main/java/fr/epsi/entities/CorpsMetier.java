package fr.epsi.entities;

import java.util.List;

public class CorpsMetier {

    private Long id;

    private String nom;
    private List<Chantier> lesChantiers;

    private List<SousTraitant> lesSousTraitants;

    private List<Personne> lesPersonnes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Chantier> getLesChantiers() {
        return lesChantiers;
    }

    public void setLesChantiers(List<Chantier> lesChantiers) {
        this.lesChantiers = lesChantiers;
    }

    public List<SousTraitant> getLesSousTraitants() {
        return lesSousTraitants;
    }

    public void setLesSousTraitants(List<SousTraitant> lesSousTraitants) {
        this.lesSousTraitants = lesSousTraitants;
    }

    public List<Personne> getLesPersonnes() {
        return lesPersonnes;
    }

    public void setLesPersonnes(List<Personne> lesPersonnes) {
        this.lesPersonnes = lesPersonnes;
    }


    @Override
    public String toString() {
        return "CorpsMetier{" +
                "n°" + id +
                ", " + nom +
                '}';
    }

}
