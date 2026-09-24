package dao;

import model.Formation;
import java.util.ArrayList;
import java.util.List;

public class FormationDAO {
    private List<Formation> formations = new ArrayList<>();

    public void addFormation(Formation formation) {
        formations.add(formation);
        System.out.println("[DAO] Formation sauvegardée : " + formation.getNom());
    }

    public List<Formation> getAllFormations() {
        return formations;
    }
}