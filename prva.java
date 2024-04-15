import java.util.Scanner;

public class prva {
     public static void main(String[] args) {
    //     //Ce nimam nobenega konstruktorja v Avto, se izvede konstruktor razreda object
    //     Avto Fico = new Avto();
    //     Fico.regSt = "Go 123";
    //     Fico.poraba = 8;
    //     Fico.izpis();
    //     Avto a = new Avto("GO 777",9);
    //     a.izpis();
    // 
    TestMetod a = new TestMetod();
    // a.Izpis(); //izpis vrača, kar je tipa void
    // a.vracanje(); //ni sintaktična napaka
    // int z = a.vracanje();
    a.test1(5);
    int z = 15;
    a.test1(z);
    //vnos podatkov
    System.out.println("Vnesi neko celo stevilo");
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    a.test1(y);
    }
}
