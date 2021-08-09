package de.basf.tiere;

public class Schwein {

    // Instanzvariablen
    private String name;
    private int gewicht;

    // Klassenvariable (Shared Variable)
    static int counter = 0;


    // Konstruktor
    public Schwein() {
        name = "nobody";
        gewicht = 10;
        counter ++;
    }


    // Destruktor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Quieeekk");
        counter --;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("Elsa"))
            return;
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }



    public void fressen() {
        gewicht ++;
    }


    public String toString() {
        return "Schwein{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
