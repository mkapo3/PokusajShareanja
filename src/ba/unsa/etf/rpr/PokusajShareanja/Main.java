package ba.unsa.etf.rpr.PokusajShareanja;

public class Main {

    public static void main(String[] args) {
        BachelorStudent bs= new BachelorStudent ("Muharem", 6, 2000);
        bs.ispisi();
        if(bs instanceof  Student)
            System.out.println("Ovo je student");
        if(bs instanceof BachelorStudent)
            System.out.println("Ovo je i becStud");
        Student s= new Student("Muhamed", 9);
        s.ispisi();
        BachelorStudent bs1= new BachelorStudent("Kapo", 5, 1999);
        Student s1=bs1;
        if(s1 instanceof BachelorStudent)
            System.out.println("Ovo je i bachelor");
        BachelorStudent bs2= (BachelorStudent) s1;
        bs2.ispisi();
    }
}