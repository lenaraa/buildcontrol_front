package fr.epsi.entities;

import java.util.List;


public class Role {

    private Long id;

    private String nom;

    private String privilege;

    private List<Capture> lesPersonnes;


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

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public List<Capture> getLesPersonnes() {
        return lesPersonnes;
    }

    public void setLesPersonnes(List<Capture> lesRoles) {
        this.lesPersonnes = lesRoles;
    }


    @Override
    public String toString() {
        return "Role{" +
                "n°" + id +
                " " + nom +
                " a les privileges " + privilege +
                '}';
    }

}
