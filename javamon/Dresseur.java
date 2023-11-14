package fr.gouv.finances.javamon;

import java.util.ArrayList;

public class Dresseur {
    // création d'attribut qui sont spécifiques à tout les dresseurs qui seront
    // crées.
    private String nom;
    private int age = 18;
    private ArrayList<Javamon> javamons = new ArrayList<>();

    // création d'une liste avec tout les javamons et pour les attribuer à chaque
    // dresseur lors de la création des équipes.
    public void afficherListe() {
	for (Javamon javamon : javamons) {
	    javamon.afficher();
	}
    }

    // création du constructeur avec les attributs qui sont communs à tout les
    // dresseurs que l'ont va créer dans le main
    public Dresseur(String nom, int age) {
	super();
	this.nom = nom;
	this.age = age;
    }

    // création des getters et setters de chaque attribut que l'on a crée
    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;

    }

    public ArrayList<Javamon> getJavamons() {
	return javamons;
    }

    public void setJavamons(ArrayList<Javamon> javamons) {
	this.javamons = javamons;
    }

    // méthode d'affichage des dresseurs participant avec un condition d'âge pour
    // pouvoir participer à ce tournoi.
    public void afficher() {
	if (this.age < 18)

	{
	    System.out.println(
		    "Vous êtes trop jeune, vous ne pouvez pas participer à cette compétition de Javamon, désolé !");
	} else {
	    System.out.println("Bienvenue dans cette compétition de Javamon !");
	}
	System.out.println("Dresseur " + this.nom + " " + this.age + " ans, " + " et voici son équipe : ");
	afficherListe();
    }

}
