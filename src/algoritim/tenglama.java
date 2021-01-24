package algoritim;

import java.util.Scanner;

import static java.lang.Math.*;

public class tenglama {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        double k=scanner.nextDouble();
//        System.out.println("k="+k);
//        double S=0;
//        for(int R=1;R<k;R++)
//        {
//            S=S+(R+2.4)/(R*R+7*R+1);
//        }
//        System.out.println("S="+S);

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x, x1, x2, D;
        //ax^2+bx+c=0

        D = pow(b, 2) - 4 * a * c;
        if (D < 0) {
            System.out.println("yechimga egaemas");
        } else if (D == 0) {
            x = (-b) / (2 * a);
            System.out.println("X=" + x);
        } else if (D > 0) {
            x1 = (-b + sqrt(D)) / (2 * a);
            x2 = (-b - sqrt(D)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
}
