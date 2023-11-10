package org.example.exo1.composite;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Figure figure = new Cercle(14);
        figure.afficher();
        System.out.println(figure.surface());

        figure = new Rectangle(5,10);
        figure.afficher();
        System.out.println(figure.surface());

        List<Figure> figures = new ArrayList<>();
        figures.add(new Cercle(15));
        figures.add(new Rectangle(2,3));
        figure = new Groupe(figures);
figure.afficher();
figure.surface();

    }
}
