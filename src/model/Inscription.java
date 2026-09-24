package model;

public class Inscription {
    private int id;
    private int idEtudiant;
    private int idFormation;
    private String dateInscription;

    public Inscription() {}

    public Inscription(int id, int idEtudiant, int idFormation, String dateInscription) {
        this.id = id;
        this.idEtudiant = idEtudiant;
        this.idFormation = idFormation;
        this.dateInscription = dateInscription;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdEtudiant() { return idEtudiant; }
    public void setIdEtudiant(int idEtudiant) { this.idEtudiant = idEtudiant; }

    public int getIdFormation() { return idFormation; }
    public void setIdFormation(int idFormation) { this.idFormation = idFormation; }

    public String getDateInscription() { return dateInscription; }
    public void setDateInscription(String dateInscription) { this.dateInscription = dateInscription; }
}