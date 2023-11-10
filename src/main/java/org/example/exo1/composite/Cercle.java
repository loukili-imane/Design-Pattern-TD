package org.example.exo1.composite;

public class Cercle extends Figure{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double surface() {
        return Math.PI*2*rayon;
    }

    @Override
    public void afficher() {
        System.out.println("C'est un cercle");
    }
}
