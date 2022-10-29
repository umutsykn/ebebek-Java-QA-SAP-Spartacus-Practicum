import java.util.Scanner;
public class ArmstrongSayilariBulanProgramPratik {
    public static void main(String[] args) {
        int number;
        int value;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();


        while (number != 0) {
            value = number % 10;
            total += value;
            number /= 10;
        }
        System.out.println(total);

    }
}
