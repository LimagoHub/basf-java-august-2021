package de.basf.app;

import de.basf.collections.Stapel;
import de.basf.geometrie.Kreis;
import de.basf.geometrie.Punkt;
import de.basf.tiere.Schwein;

public class Main {

    public static void main(String[] args) {

        Stapel stapel = new Stapel(40);

        for (int i = 0; i < 10; i++) {
            if( ! stapel.isFull()) {
                stapel.push(new Schwein("Schwein Nr." + i));
                stapel.push(new Punkt(i,i));
                stapel.push(new Kreis(i));
            }
        }

        while(!stapel.isEmpty()) {
            System.out.println(stapel.pop());
        }
    }
}
