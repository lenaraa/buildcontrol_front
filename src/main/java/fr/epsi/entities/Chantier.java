package fr.epsi.entities;

import java.time.LocalDate;
import java.util.List;

public class Chantier {

    private Long id;

    private String nom;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private String lieu;

    private List<SousTraitant> lesCorpsMetiers;


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

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public List<SousTraitant> getLesCorpsMetiers() {
        return lesCorpsMetiers;
    }

    public void setLesCorpsMetiers(List<SousTraitant> lesCorpsMetiers) {
        this.lesCorpsMetiers = lesCorpsMetiers;
    }


    @Override
    public String toString() {
        return "Chantier{" +
                "n°" + id +
                ", " + nom +
                " du dateDebut " + dateDebut +
                " au dateFin " + dateFin +
                " à " + lieu +
                '}';
    }

}
