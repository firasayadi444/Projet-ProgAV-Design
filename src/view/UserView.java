package view;

import model.UserModel;

public class UserView {
    public void displayUser(UserModel user) {
        if (user == null) {
            System.out.println("Aucun utilisateur à afficher.");
            return;
        }

        System.out.println("=== Informations Utilisateur ===");
        System.out.println("ID: " + user.getId());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Role: " + user.getRole());
    }
}
