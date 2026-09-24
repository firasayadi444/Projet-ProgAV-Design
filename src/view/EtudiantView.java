package view;

import model.Etudiant;

public class EtudiantView {
    public void displayEtudiant(Etudiant etudiant) {
        if (etudiant == null) {
            System.out.println("Aucun étudiant à afficher.");
            return;
        }

        System.out.println("=== Informations Étudiant ===");
        System.out.println("ID: " + etudiant.getId());
        System.out.println("Nom: " + etudiant.getNom());
        System.out.println("Prénom: " + etudiant.getPrenom());
        System.out.println("Email: " + etudiant.getEmail());
        System.out.println("Classe: " + etudiant.getClasse());
        System.out.println("Téléphone: " + etudiant.getTelephone());
    }
}
