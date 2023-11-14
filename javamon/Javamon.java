package fr.gouv.finances.javamon;

public class Javamon {
    // création d'attribut qui sont spécifiques à tout les Javamon qui seront crées.
    private String nom;
    private String cri;
    private int ptDeVie = 12;
    private int scoreArmure = 3;
    private Type type;
    private AttaqueBase attaqueBase;
    private AttaqueSpe attaqueSpe;

    // création du constructeur qui correspond aux attributs que tout les
    // javamons vont posséder.
    public Javamon(String nom, String cri, int ptDeVie, int scoreArmure, Type type, AttaqueBase attaqueBase,
	    AttaqueSpe attaqueSpe) {
	super();
	this.nom = nom;
	this.cri = cri;
	this.ptDeVie = ptDeVie;
	this.scoreArmure = scoreArmure;
	this.type = type;
	this.attaqueBase = attaqueBase;
	this.attaqueSpe = attaqueSpe;

    }

    // création des getters et setters de chaque attribut que l'on a crée
    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getCri() {
	return cri;
    }

    public void setCri(String cri) {
	this.cri = cri;
    }

    public int getPtDeVie() {
	return ptDeVie;
    }

    public void setPtDeVie(int ptDeVie) {
	this.ptDeVie = ptDeVie;
    }

    public int getScoreArmure() {
	return scoreArmure;
    }

    public void setScoreArmure(int scoreArmure) {
	this.scoreArmure = scoreArmure;
    }

    public Type getType() {
	return type;
    }

    public void setType(Type type) {
	this.type = type;
    }

    public AttaqueBase getAttaqueBase() {
	return attaqueBase;
    }

    public void setAttaqueBase(AttaqueBase attaqueBase) {
	this.attaqueBase = attaqueBase;
    }

    public AttaqueSpe getAttaqueSpe() {
	return attaqueSpe;
    }

    public void setAttaqueSpe(AttaqueSpe attaqueSpe) {
	this.attaqueSpe = attaqueSpe;
    }

    // création d'une méthode pour afficher la description de chaque javamon que
    // l'on voudra créer dans main
    public void afficher() {
	System.out.println(this.nom + "/ cri : " + this.cri + "/ Point de vie :" + this.ptDeVie + "/ Armure : "
		+ this.scoreArmure + "" + "/ Type : " + this.type + "/ Attaque de Base :"
		+ this.attaqueBase.getAttaqueBase() + " / Attaque Spéciale :" + this.attaqueSpe.getAttaqueSpe());

    }

    // création des phases de combats entre de javamons en mettant des conditions de
    // combats entre les deux selon leurs types et selon
    // le type d'attaque utilisée, soit l'attaque spéciale, qui inflige de gros
    // dégats, et l'attaque de base, qui inflige un peu moins
    // de dégâts que la précédente.
    public void attaque(Javamon javamonAdv, Dresseur nom) {
	while (javamonAdv.ptDeVie != 0)
	    // première condition : si les javamons affrontent leurs faiblaissant, ils
	    // subiront le double des dégâts à travers l'attaque spéciale du javamon.
	    if (this.type.EAU == javamonAdv.type.FEU || this.type.PLA == javamonAdv.type.FEU
		    || this.type.LUM == javamonAdv.type.TEN || this.type.EAU == javamonAdv.type.ELEC) {
		System.out.println(this.nom + " lance l'attaque " + this.getAttaqueSpe().getAttaqueSpe() + " sur "
			+ javamonAdv.nom);
		// affichage des dégâts et des points de vies perdus par le javamon qui a subit
		// l'attaque
		javamonAdv.ptDeVie = javamonAdv.ptDeVie - this.attaqueSpe.getNbDegat();
		System.out.println(
			" Il reste " + javamonAdv.ptDeVie + " points de vies " + " au javamon " + javamonAdv.nom);
		// deuxième condition : si le javamon affronte un javamon normal, sans qu'il
		// soit sa faiblaisse, il subira des dégâts normaux à travers l'attaque de base
		// du javamon.
	    } else {
		System.out.println(this.nom + " lance l'attaque " + this.getAttaqueBase().getAttaqueBase() + " sur "
			+ javamonAdv.nom);
		javamonAdv.ptDeVie = javamonAdv.ptDeVie - this.attaqueBase.getNbDegat();
		// affichage des dégâts et des points de vies perdus par le javamon qui a subit
		// l'attaque
		System.out.println(
			" Il reste " + javamonAdv.ptDeVie + " points de vies " + " au javamon " + javamonAdv.nom);

	    }
	// affichage des javamons qui sont vaincues et du vainqueur du combat
	if (javamonAdv.ptDeVie == 0) {
	    System.out.println("Le javamon " + javamonAdv.nom + " n'a plus de point de vie, il est éliminé. ");
	    System.out.println("le dresseur " + nom.getNom() + " a remporté ce combat. ");
	}

    }

// dès que un des deux javamons arrivent à total de point de vie de zéro, il est
// éliminé et est remplacé par un autre javamon de l'équipe. Le dresseur qui
// n'aura plus plus de javamon en état de combattre, donc avec les points de vie
// zéro, il aura perdu le combat.

}
