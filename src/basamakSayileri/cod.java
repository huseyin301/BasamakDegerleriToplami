package basamakSayileri;
import java.util.Scanner;
public class cod {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a, basamak = 0, value, total = 0;

        System.out.print("Sayıyı giriniz : ");
        a = sc.nextInt();

        while (a != 0){

            value = a % 10;

            a = a / 10;

            total = total + value;

        }

        System.out.println("Basaöak değerleri toplamı : " + total);

    }
}
