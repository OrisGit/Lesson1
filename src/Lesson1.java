import com.sun.javafx.tk.Toolkit;

/**
 * Created by Oris on 15.10.2016.
 */
public class Lesson1 extends Lesson {

    private static void Task1()
    {
        int a = 13/5;
        int b = 13%5;
        int c = (int)13.0/5;
        double d = 13/5;
        double e = 13%5;
        double f = 13.0/5;
        double g = 13/5+2/5;
        double h = 13.0/5+2.0/5;
        int i = (int)(13.0/5+2.0/5);

        System.out.format("a: %d, b: %d, c: %d, d: %f.3, e: %f.3, f: %f.3, g: %f.3, h: %f.3, i: %d",a,b,c,d,e,f,g,h,i);
    }

    private static void Task2345()
    {
        double a = sc.nextFloat();
        double c = a*a;
        double b = c*c;
        double d = b*c;
        double s = d*a;
        double v = s*s*s;
        System.out.print("4 степень (2 операции): "+b);
        System.out.print("6 (3 операции): "+d);
        System.out.print("7 (4 операции): "+s);
        System.out.print("21 (6 операций): "+v);
    }

    private static void Task6()
    {
        int a = sc.nextInt();

        while (a>10)
        {
            a = a%10;
        }

        System.out.print(a);
    }

    private static void Task7()
    {
        int a = sc.nextInt();

        System.out.print(a/10+" десятков");
    }

    private static void Task8()
    {
        int a = sc.nextInt();

        System.out.print(a%100/10);
    }

    private static void Task9()
    {
        int a = sc.nextInt();

        int b = a/100+a/10%10+a%10;
        System.out.print(b);
    }

    private static void Task10() {
        int v = sc.nextInt();

        int t = sc.nextInt();

        int r = v*t;

        if(r<=109) System.out.print(r);
        else System.out.print(r%109);
    }


    private static void Task11() {
        int n = sc.nextInt();
        int hour = n/60;
        int min = n%60;

        if(hour>24) hour = hour%24;
        System.out.printf("%02d:%02d",hour,min);
    }

    private static void Task12() {
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        if(s>60)
        {
            m+=s/60;
            s%=60;
        }
        if(m>60)
        {
            h+=m/60;
            m%=60;
        }

        if(h==12) {
            if (m > 0 || s > 0) h = 0;
        }
        else if(h>12){
            h%=12;
        }


        double float_hour = h + m / 60.0 + s / 3600.0;

        System.out.print("Большая стрелка на "+h+". Средняя на "+m+". Маленькая на "+s+". "+float_hour * 30+" градусов");
    }




    public static void main(String[] args) {


        Task1();
        Task2345();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
        Task11();
        Task12();

    }


}
