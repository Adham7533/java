package algoritim;

import java.util.Scanner;

public class tekshirish {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();

        boolean boolen1=A>B && B>C;
        boolean boolen2=A==B && B==C;
        if (boolen1==true)
        {
            System.out.println("teng emas"+boolen1);
        }
       else if (boolen2==true)
        {
            System.out.println("hamasi teng"+boolen2);
        }
        else
            {
        System.out.println("ikkitasi teng");
    }
    }
}
