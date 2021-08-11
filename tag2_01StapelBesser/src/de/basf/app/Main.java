package de.basf.app;

import de.basf.collections.Stapel;
import de.basf.geometrie.Kreis;
import de.basf.geometrie.Punkt;
import de.basf.tiere.Schwein;

public class Main {

    public static void main(String[] args) {

        Stapel<Punkt> stapel = new Stapel<>(40); // Compiler ersetzt T durch Punkt

        for (int i = 0; i < 10; i++) {
            if( ! stapel.isFull()) {
                // stapel.push(new Schwein("Schwein Nr." + i)); // Aua!!
                stapel.push(new Punkt(i,i));
                stapel.push(new Kreis(i));
               // stapel.push(i); // Autoboxing Boxing
            }
        }

        while(!stapel.isEmpty()) {

            Punkt punkt = stapel.pop(); // Kann nur Punkt sein
            punkt.rechts();
            System.out.println(punkt);
        }


    }
}
