import controller.FormationController;
import view.FormationView;

public class TestFormation {
    public static void main(String[] args) {
        // Initialisation de votre partie
        FormationController formationController = new FormationController();
        formationController.createFormation(101, "Développement Web", "Apprendre Java, Spring et React");
        
        FormationView formationView = new FormationView();
        
        // Affichage
        formationView.displayFormation(formationController.getFormation());
    }
}