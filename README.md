# Projet Java MVC avec Connexion Base de Données

Ce projet illustre une architecture **MVC (Modèle - Vue - Contrôleur)** en Java avec préparation de la connexion à une base de données (JDBC / MySQL).

## Structure du Projet

- `src/config/DatabaseConnection.java` : Gestionnaire de connexion Singleton à la BD.
- `src/model/Etudiant.java` : Classe modèle (Entity).
- `src/dao/EtudiantDAO.java` : Objet d'accès aux données (DAO / SQL).
- `src/view/EtudiantView.java` : Interface utilisateur (Console).
- `src/controller/EtudiantController.java` : Contrôleur faisant le lien entre Modèle/DAO et Vue.
- `src/App.java` : Point d'entrée de l'application.
- `SCHEMA.md` : Document détaillant le schéma d'architecture MVC, le diagramme UML et le script SQL.

## Compilation et Exécution

Compiler le projet :
```bash
javac -d bin -sourcepath src src/App.java src/config/*.java src/model/*.java src/dao/*.java src/view/*.java src/controller/*.java
```

Exécuter le projet :
```bash
java -cp bin App
```
