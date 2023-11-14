package fr.gouv.finances.javamon;

public class AttaqueSpe {
    // création des attributs
    private String attaqueSpe;
    private int nbDegat = 4;

    // création d'un constructeur pour l'attaque spéciale lancer par le javamon
    public AttaqueSpe(String attaqueSpe, int nbDegat) {
	super();
	this.attaqueSpe = attaqueSpe;
	this.nbDegat = nbDegat;
    }

    // création des getters et setters de chaque attribut que l'on a crée
    public int getNbDegat() {
	return nbDegat;
    }

    public void setNbDegat(int nbDegat) {
	this.nbDegat = nbDegat;
    }

    public String getAttaqueSpe() {
	return attaqueSpe;

    }

    public void setAttaqueSpe(String attaqueSpe) {
	this.attaqueSpe = attaqueSpe;
    }

}
