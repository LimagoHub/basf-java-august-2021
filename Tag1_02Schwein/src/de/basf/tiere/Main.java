package de.basf.tiere;

import static de.basf.tiere.Schwein.getCounter;

public class Main {

    public static void main(String[] args) {


        new Main().run();

    }

    public void run() {
        System.runFinalizersOnExit(true);

        System.out.println(getCounter());

        // Deklaration (Lokale Variable)
        Schwein piggy;


        // Instanziierung
        piggy = new Schwein("Miss Piggy"); // erstens allokiert notwendigen Speicher auf dem Heap, zweitens er füllt den Speicher mit startwerten, gibt und die Adresse

        System.out.println(getCounter());



        System.out.println(piggy.toString());
        piggy.fressen();
        System.out.println(piggy.toString());
    }
}
