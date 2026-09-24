package controller;

import model.UserModel;

public class UserController {
    private UserModel model;

    public UserController() {
        this.model = new UserModel();
    }

    public UserController(UserModel model) {
        this.model = model;
    }

    public void setUser(UserModel model) {
        this.model = model;
    }

    public UserModel getUser() {
        return model;
    }

    public void createUser(int id, String username, String email, String password, String role) {
        this.model = new UserModel(id, username, email, password, role);
    }

    public void afficherUser() {
        if (model == null) {
            System.out.println("Aucun utilisateur enregistré.");
        } else {
            System.out.println(model);
        }
    }
}
