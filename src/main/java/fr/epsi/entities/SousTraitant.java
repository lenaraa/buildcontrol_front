package fr.epsi.entities;

import java.util.List;


public class SousTraitant {

    private Long id;

    private String nom;

    private String rue;

    private String codePostal;

    private String ville;

    private List<Capture> lesCaptures;

    private CorpsMetier corpsMetier;


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

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Capture> getLesCaptures() {
        return lesCaptures;
    }

    public void setLesCaptures(List<Capture> lesCaptures) {
        this.lesCaptures = lesCaptures;
    }

    public CorpsMetier getCorpsMetier() {
        return corpsMetier;
    }

    public void setCorpsMetier(CorpsMetier corpsMetier) {
        this.corpsMetier = corpsMetier;
    }


    @Override
    public String toString() {
        return "SousTraitant{" +
                "n°" + id +
                ", " + nom +
                ", habitant au " + rue +
                ", " + codePostal +
                ", " + ville +
                ", employé par " + corpsMetier.getNom() +
                '}';
    }

}
