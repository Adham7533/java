package algoritim;

import static java.lang.Math.*;

public class shartaperato {

    public static void main(String[] args) {
//        float x=5;
//        double y;
//        System.out.println("x="+x);
//        if(x<5)
//        {
//            y=sin(x)+sqrt(abs(x-5));
//            System.out.println("y="+y);
//        }
//        else if(x==5)
//        {
//            y=pow(5.45,2)*cos(PI)+log(x+2);
//            System.out.println("y="+y);
//        }
//
//        else if(x>5)
//        {
//            y=pow(x-5,2)*tan((x/2));
//            System.out.println("y="+y);
//        }
//--------------------misol-2
//        float x=1;
//        float y;
//        System.out.println("x="+x);
//        if(abs(x)<=1)
//        {
//            y= (float) (5*pow(x,3)+6*pow(x,2)-2*x+8);
//            System.out.println("y="+y);
//        }
//        else  if (x>1)
//        {
//            y=(x+3)/x;
//            System.out.println("y="+y);
//        }
//        else if (x<-1)
//        {
//            y=0;
//            System.out.println("y="+y);
//        }

        //--------------------misol-3

        float x = 1, a = 2.5F;
        float y;
        if (x > a) {
            y = (float) (x * sqrt(x - a));
            System.out.println("y=" + y);
        } else if (x < a)
        {
            y= (float) ((float) exp(-a*x)*sin(a*x));
            System.out.println("y="+y);
        }
        else if (x==a)
        {
            y= (float) (x*sin(a*x));
            System.out.println("y="+y);
        }
    }
}
