package pkg100816;

import java.util.*;

public class KARATSUBA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter four digit number(X)");
        String x = scan.nextLine();
        System.out.println("Enter four digit number(Y)");
        String y = scan.nextLine();

        int a = Integer.parseInt(x.substring(0, 2));
        int b = Integer.parseInt(x.substring(2, 4));
        int c = Integer.parseInt(y.substring(0, 2));
        int d = Integer.parseInt(y.substring(2, 4));
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        int ac = a * c;
        int ad = a * d;
        int bc = b * c;
        int bd = b * d;
        System.out.println("AC = " + ac + ", AD = " + ad + ", BC = " + bc + ", BD = " + bd);
        int xy = (ac * 10000) + ((ad + bc) * (100)) + bd;
        System.out.println("Product = " + xy);
    }
}
