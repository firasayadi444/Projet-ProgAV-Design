package view;

import model.Inscription;

public class InscriptionView {
    public void displayInscription(Inscription inscription) {
        if (inscription == null) {
            System.out.println("Aucune inscription à afficher.");
            return;
        }

        System.out.println("=== Informations Inscription ===");
        System.out.println("ID Inscription: " + inscription.getId());
        System.out.println("ID Étudiant (Référence): " + inscription.getIdEtudiant());
        System.out.println("ID Formation (Référence): " + inscription.getIdFormation());
        System.out.println("Date: " + inscription.getDateInscription());
    }
}