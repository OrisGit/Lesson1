/**
 * Created by Oris on 16.01.2017.
 */
public class Lesson6 extends Lesson {
    ////------------------Задание 1
    private static void Task1(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(min(a, b, c, d));
    }

    private static int min(int a, int b, int c, int d) {
        if(a<b && c<d)
            if(a<c) return a;
            else return c;
        else
        if(b<d) return b;
        else return d;
    }
    ////-------------------------Задание 2
    private static void Task2(){
        double a = sc.nextDouble();
        int n = sc.nextInt();

        System.out.print(power(a,n));
    }

    private static double power(double a, int n) {
        String p = Integer.toBinaryString(n);
        double res = a;
        System.out.println(p);
        for (int i=p.length()-1;i>=0;i--){
            if(p.charAt(i) == '1'){
                System.out.println(true);
                res*=res;
                res*=a;
            }else res*=res;
            System.out.println(res);
        }

        return res;

    }
    ////------------------Задание 3
    private static void Task3() {
        boolean a = sc.nextInt()==1;
        boolean b = sc.nextInt()==1;

        System.out.print(xor(a, b));
    }


    private static boolean xor(boolean a, boolean b) {
        return a^b;
    }

    ////------------------Задание 4
    private static void Task4() {
        boolean a = sc.nextInt()==1;
        boolean b = sc.nextInt()==1;
        boolean c = sc.nextInt()==1;

        System.out.println(electron(a,b,c));
    }

    private static boolean electron(boolean a, boolean b, boolean c) {
        return (a&&b)^(b&&c)^(a&&c);
    }

    ////------------------Задание 5
    private static void Task5() {
        //int a = sc.nextInt();

        for(int i = 1;i<1000;i++)
        {
            if(isPrime(i)){}// System.out.println(i+"- prime");
            else System.out.println(i + "- composite");
        }

    }

    private static boolean isPrime(int a) {
        for(int i=2;i<=a-1;i++)
        {
            if(a%i==0)return false;
        }
        return true;
    }

    ////------------------Задание 6
    private static void Task6() {
        int a = sc.nextInt();

        System.out.println((sumOfDigits(a)));
    }

    private static int sumOfDigits(int a) {
        int sum=0;
        while(a>0)
        {
            sum+=a%10;
            a/=10;
        }
        return sum;
    }

    ////------------------Задание 7
    private static void Task7() {
        int a = sc.nextInt();

        System.out.println(reverse(a));
    }

    private static int reverse(int a) {
        int result = 0;
        while (a != 0)
        {
            result = result*10+a%10;
            a/=10;
        }
        return result;
    }

    ////------------------Задание 8
    private static void Task8() {
        int a = sc.nextInt();

        int num = 0;
        for(int i=1;i<=a;i++) if(isPolindrome(i))num++;
        System.out.println(num);

    }

    private static boolean isPolindrome(int a) {
        return a==reverse(a);
    }

    ///----------------------------------Примеры 2
    ////------------------Задание 9
    private static void Task9() {
        double a=sc.nextInt();
        int n=sc.nextInt();


        System.out.println(pow(a, n));
    }

    private static double pow(double a, int n) {
        //if(n==0)return 1;
        if(n-1>=1) return a*pow(a,n-1);
        return a;
    }

    ////------------------Задание 10
    private static void Task10() {
        double a=sc.nextInt();
        int n=sc.nextInt();


        System.out.println(mPow(a, n));
    }

    private static double mPow(double a, int n) {
        if(n<0) return 1/nPow(a,-n);
        return nPow(a,n);
    }

    ////------------------Задание 11
    private static void Task11() {
        double a=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(mPow(a, n));
    }

    private static double nPow(double a, int n) {
        if(n==0)return 1;
        if(n>=1)
            if(n%2==0)
                return pow(nPow(a,n/2),2);
            else
                return pow(a,n-1);
        return a;
    }


    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        //Task4();
        //Task5();
        //Task6();
        //Task7();
        //Task8();
        //------Примеры 2
        //Task9();
        //Task10();
        Task11();
    }
}
