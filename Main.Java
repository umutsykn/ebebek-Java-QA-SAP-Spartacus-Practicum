import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int fizikNot,matNot,kimyaNot,turkceNot,tarihNot,muzikNot;
        System.out.println("Fizik notunuzu giriniz: ");
        fizikNot= input.nextInt();
        System.out.println("Matematik notunuzu giriniz: ");
        matNot= input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimyaNot= input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkceNot= input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarihNot= input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzikNot= input.nextInt();
        System.out.println("Ortalama: "+(fizikNot+matNot+muzikNot+tarihNot+turkceNot+kimyaNot)/6);
    }
}
