package org.example.exo1.composite;

import javax.swing.*;
import java.util.List;

public class Groupe extends Figure{
    private List<Figure> groupeFigures;

    public Groupe() {
    }

    public Groupe(List<Figure> groupeFigures) {
        this.groupeFigures = groupeFigures;
    }

    @Override
    public double surface() {
        double s=0;
        for (Figure f:groupeFigures
             ) {
            s+= f.surface();
        }
        return s;
    }

    @Override
    public void afficher() {
        System.out.println("C'est un groupe de figure composé de :");
        for (Figure f:groupeFigures
             ) {
            f.afficher();
        }
    }
}
