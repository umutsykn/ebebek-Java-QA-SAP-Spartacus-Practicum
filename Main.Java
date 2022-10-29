import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz:");
        int a=sc.nextInt();

        for (int i=a; i >0 ; i--){

            for (int b=a-i; b>0; b--){
                System.out.print(" ");
            }

            for (int k=(2*i)-1; k>0; k--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
     }

}
