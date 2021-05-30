package fr.epsi.entities;

import java.time.LocalDate;
import java.util.List;


public class Projet {

    private Long id;

    private String nom;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private List<Capture> lesCaptures;


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


    @Override
    public String toString() {
        return "Projet{" +
                "n°" + id +
                ", " + nom +
                " du dateDebut " + dateDebut +
                " au dateFin " + dateFin +
                '}';
    }

}
