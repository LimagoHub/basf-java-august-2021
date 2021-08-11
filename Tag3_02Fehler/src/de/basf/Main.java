package de.basf;

public class Main {

    public static void main(String[] args) {


        try {
            int [] feld = new int[2];
            int a,b,c;
            a = b = 0;

            feld[1000] = 17;
            c = a / b;


        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {
            e.printStackTrace();
        }

        catch (Exception e) {
            System.out.println("Allgemeiner Fehler");  e.printStackTrace();
        }


        System.out.println("Vielen Dank Sie haben ein kleines Programm echt glücklich gemacht!");

    }


}
