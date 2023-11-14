package fr.gouv.finances.javamon;

public enum Type {
    // création d'une class enum pour attribuer à un javamon un type spécifique
    FEU("Feu"), EAU("Eau"), ELEC("Electricité"), LUM("Lumière"), TEN("Ténèbres"), PLA("Plante");

    String type;

    private Type(String type) {
	this.type = type;
    }

}
