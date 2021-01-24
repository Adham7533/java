package algoritim;

import static java.lang.Math.*;

public class tiplar {
    public static void main(String[] args) {
//        int x=10, y=12;
//        float c1;
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        c1 = (float) ((x + y) / (pow(y, 2) + abs((pow(y, 2) + 2) / (x + pow(x, 3) / 5))) + exp(y + 2));
//
//        System.out.println("c1=" + c1);
        //----------2
//        double x=25,y=25,F;
//        System.out.println("x="+x);
//        System.out.println("y="+y);
//        F=(2*tan(x+3.1415/6))/(1/3+pow(cos(y+x*x),2))+log(pow(x,2))/log(2);
//        System.out.println("F="+F);
        //----------3
        int x=1,y=-1;
        double f2;
        System.out.println("x="+x);
        System.out.println("y="+y);

        f2=(1/((x+2)/(x*x+3/pow(x,3)))+exp(pow(x,2+3*x)))/(atan(x+y)+pow(abs(5+x),2))-pow(cos(y*y+x*x/2),2);
        System.out.println("f2="+f2);
    }
}
