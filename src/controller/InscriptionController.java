package controller;

import model.Inscription;

public class InscriptionController {
    private Inscription model;

    public InscriptionController() {
        this.model = new Inscription();
    }

    public InscriptionController(Inscription model) {
        this.model = model;
    }

    public Inscription getInscription() {
        return model;
    }

    public void createInscription(int id, int idEtudiant, int idFormation, String dateInscription) {
        this.model = new Inscription(id, idEtudiant, idFormation, dateInscription);
    }
}