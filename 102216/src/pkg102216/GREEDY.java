package pkg102216;

import java.util.*;

public class GREEDY {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float naiwan = 0, Given = 0;
        int bill_10 = 0, peso_5 = 0, peso_1 = 0, cent_25 = 0;

        System.out.print("Input a number: ");
        
        Given = scan.nextFloat();
        
        System.out.println("The combination of the fewest bills/coins to produce " + Given + " is as follows ");

        if ((Given / 10) >= 1) {
            bill_10 = (int) (Given / 10);
            naiwan = Given % 10;
        }
        if ((naiwan / 5) >= 1) {
            peso_5 = (int) (naiwan / 5);
            naiwan = naiwan % 5;
        }
        if ((naiwan / 1) >= 1) {
            peso_1 = (int) (naiwan / 1);
            naiwan = naiwan % 1;
        }
        if ((naiwan / .25) >= 1) {
            cent_25 = (int) (naiwan / .25);
        }
        System.out.println("10 Peso: " + bill_10 + "\n5 Peso: " + peso_5 + "\n1 Peso: " + peso_1 + "\n25 Cents: " + cent_25);
    }
}
