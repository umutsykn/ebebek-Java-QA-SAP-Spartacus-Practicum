import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Double boy , kilo;
        Scanner k=new Scanner(System.in);
        System.out.println("Boyunuzu metre olarak giriniz: ");
        boy=k.nextDouble();      
        System.out.println("Kilonuzu giriniz");
        kilo=k.nextDouble();
        System.out.print("VKE:"+kilo/(boy*boy));
    }
}
