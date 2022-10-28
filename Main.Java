import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        double anapara , kdvmiktar , kdv;
        Scanner sc= new Scanner(System.in);        
        System.out.println("Ana Para Miktarı Giriniz: ");
        anapara=sc.nextDouble();
        kdv=(1000>anapara)?18:8;
        kdvmiktar=anapara*kdv/100;
        System.out.println("KDV miktarı:"+kdvmiktar);    
        System.out.println("KDV'li tutar:"+kdvmiktar+anapara);
    }
}
