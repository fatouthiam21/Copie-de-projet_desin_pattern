import java.util.ArrayList;
import java.util.List;

abstract class Documents {
    private String nom;

    public Documents(String nom) {
        this.nom = nom;
    }

    public abstract void affiche(String prefixe, boolean dernier);

    public String getNom() {
        return nom;
    }
}

class Fichier extends Documents {
    public Fichier(String nom) {
        super(nom);
    }

    public void affiche(String prefixe, boolean dernier) {
        System.out.println(prefixe + (dernier ? "└── " : "├── ") + getNom());
    }
}

class Dossier extends Documents {
    private List<Documents> composants;

    public Dossier(String nom) {
        super(nom);
        composants = new ArrayList<>();
    }

    public void ajoute(Documents composant) {
        composants.add(composant);
    }

    public void affiche(String prefixe, boolean dernier) {
        System.out.println(prefixe + (dernier ? "└── " : "├── ") + getNom() );
        String prefixe1 = prefixe + (dernier ? "    " : "│   ");
        int index = composants.size() - 1;
        for (int i = 0; i < composants.size(); i++) {
            Documents composant = composants.get(i);
            boolean dernier1 = i == index;
            composant.affiche(prefixe1, dernier1);
        }
    }
}

