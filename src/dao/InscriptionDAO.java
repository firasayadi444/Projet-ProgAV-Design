package dao;

import model.Inscription;
import java.util.ArrayList;
import java.util.List;

public class InscriptionDAO {
    private List<Inscription> inscriptions = new ArrayList<>();

    public void addInscription(Inscription inscription) {
        inscriptions.add(inscription);
        System.out.println("[DAO] Inscription sauvegardée (ID: " + inscription.getId() + ")");
    }

    public List<Inscription> getAllInscriptions() {
        return inscriptions;
    }
}