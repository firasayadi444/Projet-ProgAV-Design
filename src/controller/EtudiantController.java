package controller;

import model.Etudiant;

public class EtudiantController {
    private Etudiant model;

    public EtudiantController() {
        this.model = new Etudiant();
    }

    public EtudiantController(Etudiant model) {
        this.model = model;
    }

    public void setEtudiant(Etudiant model) {
        this.model = model;
    }

    public Etudiant getEtudiant() {
        return model;
    }

    public void createEtudiant(int id, String nom, String prenom, String email, String classe, String telephone) {
        this.model = new Etudiant(id, nom, prenom, email, classe, telephone);
    }

    public void afficherEtudiant() {
        if (model == null) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            System.out.println(model);
        }
    }
}
