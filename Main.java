/*Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che
stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.*/
public class Main {
    public static void main (String[] args) {
        Forma general = new Forma();
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        System.out.println (general.calcolaArea(6, 5));
        System.out.println (rettangolo.calcolaArea(6, 5));
        System.out.println (triangolo.calcolaArea(6, 5));


    }
}
