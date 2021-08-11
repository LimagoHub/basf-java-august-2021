package de.basf.office;

public class Excel implements Dokument{

    int x ;// Sichtbarkeit Package
    @Override
    public void drucken() {
        System.out.println("Hier druckt Excel");
    }
}
