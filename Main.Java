import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
       Scanner tar=new Scanner(System.in);
        Double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;
        Double armutkg,elmakg,domateskg,muzkg,patlicankg;
        System.out.println("Armut Kg Giriniz");
        armutkg=tar.nextDouble();
        System.out.println("Elma Kg Giriniz");
        elmakg=tar.nextDouble();
        System.out.println("Domates Kg Giriniz");
        domateskg=tar.nextDouble();
        System.out.println("Muz Kg Giriniz");    
        muzkg=tar.nextDouble();
        System.out.println("Patlıcan Kg Giriniz");
        patlicankg=tar.nextDouble();
        System.out.print("Ödenecek Toplam Tutar="+((armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg))+"TL");
    }
}
