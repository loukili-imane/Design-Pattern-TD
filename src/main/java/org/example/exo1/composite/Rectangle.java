package org.example.exo1.composite;

public class Rectangle extends Figure{
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }

    @Override
    public void afficher() {
        System.out.println("Cest un rectangle");
    }
}
