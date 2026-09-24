package view;

import model.Formation;

public class FormationView {
    public void displayFormation(Formation formation) {
        if (formation == null) {
            System.out.println("Aucune formation à afficher.");
            return;
        }

        System.out.println("=== Informations Formation ===");
        System.out.println("ID: " + formation.getId());
        System.out.println("Nom: " + formation.getNom());
        System.out.println("Description: " + formation.getDescription());
    }
}