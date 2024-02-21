/*A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
 aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
 */
public class Triangolo extends Forma{
    @Override
    public double calcolaArea(double base, double altezza) {
        return ((base * altezza) / 2);
    }
}

