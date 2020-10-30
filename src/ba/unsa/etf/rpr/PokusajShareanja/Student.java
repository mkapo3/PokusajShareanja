package ba.unsa.etf.rpr.PokusajShareanja;

public class Student implements  Osoba{
    protected String ime_prezime;
    private int ocjena;

    public Student(String ime_prezime, int ocjena) {
        this.ocjena = ocjena;
        this.ime_prezime=ime_prezime;
    }

    public void ispisi(){
        System.out.print("Student: " + ime_prezime);
    }
}