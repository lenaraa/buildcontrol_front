package fr.epsi.entities;

import java.time.LocalDate;

public class Profil {

    private String username;

    private String nom;

    private String mdp;

    private LocalDate dateModification;

    Boolean estInterne;

    private Personne personne;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public LocalDate getDateModification() {
        return dateModification;
    }

    public void setDateModification(LocalDate dateModification) {
        this.dateModification = dateModification;
    }

    public Boolean getEstInterne() {
        return estInterne;
    }

    public void setEstInterne(Boolean estInterne) {
        this.estInterne = estInterne;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }


    @Override
    public String toString() {
        return "Profil{" +
                "nom d'utilisateur " + username +
                ", de nom " + nom +
                ", modifié le " + dateModification +
                '}';
    }

}
