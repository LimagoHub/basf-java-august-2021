package de.basf.geometrie;

public class Kreis extends de.basf.geometrie.Punkt { // erbt alle Eigenschaften und alle Methoden, aber keine Konstruktoren

    private double radius;

    // private Nur die Klasse selbst (Keine Kinder, keine Freunde)
    /* package */ int abc;
    // default oder package Sichtbarkeit (freunde haben Zugriff, Freunde alle Klassen im selben Paket. Kinder nur wenn im selben Paket)
    // protected (Freunde und Kinder egal in welchem paket)
    // public (jeder)

    public Kreis() {
        this(0,0,0);
    }

    public Kreis(double radius) {
        this(radius,0,0);
    }


    public Kreis(double x, double y) {
        this(0,x,y);

    }
    public Kreis(double radius, double x, double y) {
        super(x,y);
        setRadius(radius);
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius = " + radius;
    }
}
