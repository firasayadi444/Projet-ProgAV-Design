import controller.FormationController;
import controller.InscriptionController;
import view.FormationView;
import view.InscriptionView;
import dao.FormationDAO;
import dao.InscriptionDAO;

public class TestFormation {
    public static void main(String[] args) {
        // --- 1. TEST DE LA FORMATION ---
        FormationController formationController = new FormationController();
        formationController.createFormation(101, "Développement Web", "Apprendre Java, Spring et React");
        
        FormationView formationView = new FormationView();
        formationView.displayFormation(formationController.getFormation());

        FormationDAO formationDAO = new FormationDAO();
        formationDAO.addFormation(formationController.getFormation());

        System.out.println("\n-----------------------------------\n");

        // --- 2. TEST DE L'INSCRIPTION ---
        InscriptionController inscriptionController = new InscriptionController();
        // ID Inscription: 1 | ID Etudiant: 1 (Alice Dupont) | ID Formation: 101 | Date: Aujourd'hui
        inscriptionController.createInscription(1, 1, 101, "24/09/2026");

        InscriptionView inscriptionView = new InscriptionView();
        inscriptionView.displayInscription(inscriptionController.getInscription());

        InscriptionDAO inscriptionDAO = new InscriptionDAO();
        inscriptionDAO.addInscription(inscriptionController.getInscription());
    }
}