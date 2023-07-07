
public class Tree {
    public static void main(String[] args) {
        Dossier Bulletin = new Dossier("Unités d'enseigneent");
        Dossier UE1 = new Dossier("Algorithmique et Programmation2");
        Dossier UE2 = new Dossier("Outils d'électronique");
        Dossier UE3 = new Dossier("Outils Mathématiques2");
        Dossier UE4 = new Dossier("Systèmes et Réseaux");
        Dossier UE5 = new Dossier("Base du Génie Logiciel2");
        Dossier UE6 = new Dossier("Communication et Droit");
        Dossier UE = new Dossier("Facultatif");
        Fichier matiere1 = new Fichier("Structures de Données");
        Fichier matiere2 = new Fichier("Programmation Orientée Objet et Introduction à un Langage");
        Fichier matiere3 = new Fichier("Electronique");
        Fichier matiere4 = new Fichier("Introduction aux Systèmes Electroniques Embarqués");
        Fichier matiere5 = new Fichier("Calcul Numérique");
        Fichier matiere6 = new Fichier("Outils mathématiques pour le dimensionnement des réseaux");
        Fichier matiere7 = new Fichier("Analyse");
        Fichier matiere8 = new Fichier("Interconnexion des Réseaux");
        Fichier matiere9 = new Fichier("Système d'Exploitation");
        Fichier matiere10 = new Fichier("Base des Télécommunications");
        Fichier matiere11 = new Fichier("Technologie Web");
        Fichier matiere12 = new Fichier("Patron de Conception");
        Fichier matiere13 = new Fichier("Introduction au Processus de Développement Logiciel");
        Fichier matiere14 = new Fichier("Rapport Technique");
        Fichier matiere15 = new Fichier("Présentation Orale");
        Bulletin.ajoute(UE1);
        Bulletin.ajoute(UE2);
        Bulletin.ajoute(UE3);
        Bulletin.ajoute(UE4);
        Bulletin.ajoute(UE5);
        Bulletin.ajoute(UE6);

        UE1.ajoute(matiere1);
        UE1.ajoute(matiere2);
        UE2.ajoute(matiere3);
        UE2.ajoute(matiere4);
        UE3.ajoute(matiere5);
        UE3.ajoute(matiere6);
        UE3.ajoute(matiere7);
        UE4.ajoute(matiere8);
        UE4.ajoute(matiere9);
        UE4.ajoute(matiere10);
        UE5.ajoute(matiere11);
        UE5.ajoute(matiere12);
        UE5.ajoute(matiere13);
        UE6.ajoute(UE);

        UE.ajoute(matiere14);
        UE.ajoute(matiere15);

        Bulletin.affiche("", true);
    }
}
