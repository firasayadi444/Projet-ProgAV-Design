package controller;

import model.Formation;

public class FormationController {
    private Formation model;

    public FormationController() {
        this.model = new Formation();
    }

    public FormationController(Formation model) {
        this.model = model;
    }

    public Formation getFormation() {
        return model;
    }

    public void createFormation(int id, String nom, String description) {
        this.model = new Formation(id, nom, description);
    }
}