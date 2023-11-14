package fr.gouv.finances.javamon;

public class JavamonObjet {

    public static void main(String[] args) {
	// création des deux dresseurs avec les attributs indiquer dans la classe
	// Dresseur
	Dresseur dresseur1 = new Dresseur("Sacha", 19);
	Dresseur dresseur2 = new Dresseur("Leo", 24);
	// création des javamons avec les attributs indiquer dans la classe Javamon
	Javamon javamon1 = new Javamon("Condoriano", "Condorrrrrrrrr", 12, 3, Type.LUM,
		new AttaqueBase("Rayon lumineux", 2), new AttaqueSpe("Flash Solaire", 4));
	Javamon javamon2 = new Javamon("Tigronodon", "Tigrrrooooooo", 12, 3, Type.FEU,
		new AttaqueBase("Souffle de Feu", 2), new AttaqueSpe("Boule de Feu", 4));
	Javamon javamon3 = new Javamon("Rochaillou", "Rochaiiiii", 12, 3, Type.TEN, new AttaqueBase("Vent Sombre", 2),
		new AttaqueSpe("Trou Noir", 4));
	Javamon javamon4 = new Javamon("Fleurodas", "Fleurooooo", 12, 3, Type.PLA,
		new AttaqueBase("Feuilles Piquantes", 2), new AttaqueSpe("Lianes Tranchantes", 4));
	Javamon javamon5 = new Javamon("Orquonasis", "Orquooooooo", 12, 3, Type.EAU,
		new AttaqueBase("Pistolet à eau", 2), new AttaqueSpe("Tsunami", 4));
	Javamon javamon6 = new Javamon("Pouloulou", "Pouloulouuuuuuu", 12, 3, Type.ELEC,
		new AttaqueBase("Boule d'énergie", 2), new AttaqueSpe("Attaque foudroyante", 4));
	// création de l'équipe du premier dresseur avec une liste des javamons que l'on
	// a crée plutôt.
	dresseur1.getJavamons().add(javamon1);
	dresseur1.getJavamons().add(javamon2);
	dresseur1.getJavamons().add(javamon3);
	// création de l'équipe du second dresseur avec une liste des javamons que l'on
	// a crée plutôt.
	dresseur2.getJavamons().add(javamon4);
	dresseur2.getJavamons().add(javamon5);
	dresseur2.getJavamons().add(javamon6);
	// affichage des deux dresseurs et de leurs équipes respectivent.
	dresseur1.afficher();
	dresseur2.afficher();
	// execution des combats entre les deux équipes de Javamon
	javamon1.attaque(javamon5, dresseur1);
	javamon2.attaque(javamon6, dresseur1);
	javamon3.attaque(javamon4, dresseur1);
	// dans ce programme, on a fait un combat où il y a uniquement un javamon qui
	// attaque et l'autre qui subit.
	// pour les cri des javamons, on aurait pu créer un système d'héritage car
	// chaque javamon a un cri qui lui est spécifique
	// créer aussi un système d'héritage pour chaque Javamon si on veut lui
	// attribuer ou créer une évolution

    }

}
