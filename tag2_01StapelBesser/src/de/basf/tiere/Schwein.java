package de.basf.tiere;

public class Schwein {

    // Instanzvariablen
    private String name;
    private int gewicht;

    // Klassenvariable (Shared Variable)
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    // Klassen-Konstruktor
    static {
        counter = 0;
    }

    // Instanz-Konstruktor
    public Schwein() {

       this("nobody"); // Muss in einem Kontruktor stehen und es MUSS der erste Befehl sein->Konstruktorweiterleitung

    }

    public Schwein(String name) {
        setName(name);
        gewicht = 10;
        counter ++;
    }


    // Instanz-Destruktor  (mit Vorsicht zu genießen)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Quieeekk");
        counter --;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name.equals("Elsa"))
            return;
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }


    // Instanz Methode
    public void fressen() {

        this.gewicht ++;
    }


    public String toString() {
        return "Schwein{" +
                "name='" + this.name + '\'' +
                ", gewicht=" + this.gewicht +
                '}';
    }

    public static void main(String[] args) {

    }
}
