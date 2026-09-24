# Organisation du Travail en Équipe (Projet MVC)

Ce document décrit la méthode de répartition des tâches pour **2 développeurs** afin de développer le projet sans générer de conflits Git.

---

## 1. Règle d'or Anti-Conflit Git

Un conflit Git survient uniquement lorsque deux développeurs modifient **le même fichier au même moment**. 
Pour éviter tout conflit :
* Chaque développeur est responsable de **fichiers et packages distincts**.
* Le fichier principal `App.java` ne doit pas être modifié en parallèle.

---

## 2. Découpage des Tâches par Domaine (Modélisation UML)

### 👤 Développeur 1 : Module "Utilisateurs & Personnes"
Responsable de la gestion des identités, des étudiants et des formateurs.

* **Modèles (`src/model/`)** :
  * `Utilisateur.java` (Classe abstraite / mère)
  * `Etudiant.java`
  * `Formateur.java`
* **Accès aux données (`src/dao/`)** :
  * `UtilisateurDAO.java`
  * `EtudiantDAO.java`
  * `FormateurDAO.java`
* **Contrôleurs (`src/controller/`)** :
  * `UserController.java`
  * `EtudiantController.java`
  * `FormateurController.java`
* **Vues (`src/view/`)** :
  * `UserView.java`
  * `EtudiantView.java`
  * `FormateurView.java`

---

### 📚 Développeur 2 : Module "Formations & Inscriptions"
Responsable de la gestion académique, des cours et des inscriptions.

* **Modèles (`src/model/`)** :
  * `Formation.java`
  * `Inscription.java`
* **Accès aux données (`src/dao/`)** :
  * `FormationDAO.java`
  * `InscriptionDAO.java`
* **Contrôleurs (`src/controller/`)** :
  * `FormationController.java`
  * `InscriptionController.java`
* **Vues (`src/view/`)** :
  * `FormationView.java`
  * `InscriptionView.java`

---

## 3. Stratégie Git & Branches

1. **Création des branches de fonctionnalités** :
   * Développeur 1 : `git checkout -b feature/utilisateurs`
   * Développeur 2 : `git checkout -b feature/formations`

2. **Flux de travail au quotidien** :
   ```bash
   # 1. Récupérer les dernières mises à jour du projet
   git checkout master
   git pull origin master

   # 2. Revenir sur sa branche et intégrer le master
   git checkout feature/nom-de-ma-branche
   git merge master

   # 3. Travailler, commiter et pusher
   git add .
   git commit -m "Description des modifications"
   git push origin feature/nom-de-ma-branche
   ```

3. **Fusion finale sur `master`** :
   * Une fois le module terminé, effectuez une Merge Request / Pull Request ou un `git merge` sur la branche `master`.

---

## 4. Test et Intégration dans `App.java`

Pour éviter de bloquer `App.java` :
* Chaque développeur crée une classe de test locale (ex: `TestUtilisateur.java` ou `TestFormation.java`).
* À la fin des deux modules, un seul développeur rassemble les appels dans `App.java`.
