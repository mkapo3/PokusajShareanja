package ba.unsa.etf.rpr.PokusajShareanja;

public class BachelorStudent extends Student implements Osoba {
    private int godina;

    public BachelorStudent(String ime, int ocjena, int godina) {
        super(ime, ocjena);
        this.godina=godina;
    }

    public void ispisi() {
        super.ispisi();
        System.out.println(" ovo je BachelorStudent");
    }
}