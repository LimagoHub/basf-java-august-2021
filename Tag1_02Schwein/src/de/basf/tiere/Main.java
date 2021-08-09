package de.basf.tiere;

public class Main {

    public static void main(String[] args) {

        System.runFinalizersOnExit(true);

        System.out.println(Schwein.counter);

        // Deklaration (Lokale Variable)
        Schwein piggy;


        // Instanziierung
        piggy = new Schwein(); // erstens allokiert notwendigen Speicher auf dem Heap, zweitens er füllt den Speicher mit startwerten, gibt und die Adresse

        System.out.println(Schwein.counter);

        piggy.setName("Miss Piggy");

        System.out.println(piggy.toString());
        piggy.fressen();
        System.out.println(piggy.toString());


    }
}
