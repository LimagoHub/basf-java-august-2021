package de.basf;

import de.basf.geometrie.Punkt;

public class Main {

    public static void main(String[] args) {
        Punkt p = new Punkt(5, -1.3);
        System.out.println(p.toString());

        for (int i = 0; i < 12 ; i++) {
            p.rechts(0.9);
            System.out.println(p.toString());
        }
    }
}
