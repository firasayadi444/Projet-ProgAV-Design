import controller.EtudiantController;
import controller.UserController;
import model.Etudiant;
import model.UserModel;
import view.EtudiantView;
import view.UserView;

public class App {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        userController.createUser(1, "admin", "admin@email.com", "1234", "ADMIN");

        EtudiantController etudiantController = new EtudiantController();
        etudiantController.createEtudiant(1, "Dupont", "Alice", "alice@email.com", "L3 INFO", "0654321890");

        UserView userView = new UserView();
        EtudiantView etudiantView = new EtudiantView();

        userView.displayUser(userController.getUser());
        etudiantView.displayEtudiant(etudiantController.getEtudiant());
    }
}
