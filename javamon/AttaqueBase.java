package fr.gouv.finances.javamon;

public class AttaqueBase {
    private String attaqueBase;
    private int nbDegat = 2;

    // création du constructeur pour l'attaque de base lancer par le javamons
    public AttaqueBase(String attaqueBase, int nbDegat) {
	super();
	this.attaqueBase = attaqueBase;
	this.nbDegat = nbDegat;
    }

    // création des getters et setters de chaque attribut que l'on a crée
    public int getNbDegat() {
	return nbDegat;
    }

    public void setNbDegat(int nbDegat) {
	this.nbDegat = nbDegat;
    }

    public String getAttaqueBase() {
	return attaqueBase;
    }

    public void setNom(String attaqueBase) {
	this.attaqueBase = attaqueBase;
    }

}
