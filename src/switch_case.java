import java.util.Scanner;
public class switch_case {
    static boolean laufen = true;
    static int auswahl;
    static double a;
    static double l;
    static double b;
    static double h;
    static double pi = 3.14;
    static double r;
    static double A;
    static double V;
    Scanner abnahme = new Scanner(System.in);
    public void auswahl() {
        System.out.println("Bitte wählen sie Den körper aus, von welchen sie Volumen und Oberfläche berechnen wollen\n" +
                "1. Würfel\n" +
                "2. Quader\n" +
                "3. Kugel\n" +
                "4. Zylinder\n" +
                "5. Kegel");
        auswahl = abnahme.nextInt();
    }
    public void werteAbfragen() // werte abfragen und diese berechnen
    {
        switch(auswahl){
            case 1:
                abfragea();
                V = a*a*a;
                A = 6*a*a;
                break;
            case 2:
                abfragel();
                abfrageb();
                abfrageh();
                V = l*b*h;
                A = 2*(l*b+l*h+b*h);
                break;
            case 3:
                abfrager();
                V = (3/4)*pi*r*r*r;
                A = 4*pi*r*r;
                break;
            case 4:
                abfrager();
                abfrageh();
                V = pi*r*r*h;
                A = 2*pi*r*(h+r);
                break;
        }
    }
    public void abfragea() {
        System.out.println("was ist die Länge des körpers");
        a = abnahme.nextInt();
    }
    public void abfragel() {
        System.out.println("was ist die Länge des körpers");
        l = abnahme.nextInt();
    }
    public void abfrageb() {
        System.out.println("was ist die Breite des körpers");
        b = abnahme.nextInt();
    }
    public void abfrageh() {
        System.out.println("was ist die Höhe des körpers");
        h = abnahme.nextInt();
    }
    public void abfrager() {
        System.out.println("was ist der Radius des körpers");
        r = abnahme.nextInt();
    }
    public void stopen() {
        System.out.println("wollen sie weiter rechen\n" +
                "1. ja\n" +
                "2. nein");
        int stop = abnahme.nextInt();
        if(stop == 2) {
            laufen = false;
        }
    }
     void main(String[] args) {
        while(laufen == true) {
            auswahl();
            werteAbfragen();
            System.out.println("das volumen ist "+V);
            System.out.println("die oberfläche ist " + A);
            stopen();
        }
    }
}