
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = 0;
        int ekok = 0;

        int max = Math.max(sayi1, sayi2);
        int min = Math.min(sayi1, sayi2);

        int i = min;

        while (i >= 1) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        int j = max;

        while (true) {
            if (j % sayi1 == 0 && j % sayi2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);        
        
        
    }
}
