import java.io.Console;
import java.math.BigInteger;
import java.util.Timer;
import java.util.stream.IntStream;

/**
 * Created by Oris on 09.11.2016.
 */
public class Lesson3 extends Lesson {

    ///Упражнение 3.1
    private static void Task1 ()
    {
        System.out.print("Введите два целых числа: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        System.out.print("Число 2: ");
        int a2 = sc.nextInt();

        if(a1<a2){
            a1 = a2;
        }
        System.out.print("Наибольшее: "+a1);
    }

    private static void Task2(){
        System.out.print("Введите два целых числа: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        System.out.print("Число 2: ");
        int a2 = sc.nextInt();

        if(a1<a2){
          System.out.print(2);
        }else
            if(a1>a2){
                System.out.print(1);
            }
            else
                System.out.print(0);
    }

    private static void Task3(){
        System.out.print("Введите три целых числа: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        System.out.print("Число 2: ");
        int a2 = sc.nextInt();
        System.out.print("Число 3: ");
        int a3 = sc.nextInt();

        boolean r1 = a1>a2;
        boolean r2 = a2>a3;

        if(r1 && r2) System.out.print(a1);
        else if(r2) System.out.print(a2);
            else System.out.print(a3);
    }

    private static void Task4(){
        System.out.print("Введите целое число: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();

        if(a1>0) System.out.print(1);
        else if (a1<0) System.out.print(-1);
            else System.out.print(0);
    }

    private static void Task5(){
        System.out.print("Введите три целых числа: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        System.out.print("Число 2: ");
        int a2 = sc.nextInt();
        System.out.print("Число 3: ");
        int a3 = sc.nextInt();

        boolean r1 = a1==a2;
        boolean r2 = a2==a3;
        boolean r3 = a1==a3;

        if(r1&&r2) System.out.print(3);
        else
            if(r1||r2||r3) System.out.print(2);
            else
                System.out.print(0);
    }

    ///Упражнение 3.2
    private static void Task6(){
        System.out.print("Введите натуральное число: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        int res = 0;

        for(int i=1;i<=a1;i++){
            res+=i*i;
        }

        System.out.print(res);
    }

    private static void Task7(){
        System.out.print("Введите натуральное число: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        int res = 0;

        for(int i=2;i<=a1;i++)
        {
            res+=(i-1)*i;
        }

        System.out.print(res);
    }

    private static void Task8(){
        System.out.print("Введите натуральное число: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        int res = 0;
        int interimRes=0;

        for(int i=1;i<=a1;i++)
        {
            res+=i+interimRes;
            interimRes+=i;
        }
        System.out.print(res);
    }

    private static void Task9(){
        System.out.print("Введите два целых числа: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        System.out.print("Число 2: ");
        int a2 = sc.nextInt();

        for(int i=a1;i<=a2;i++)
        {
            if(i%2==0) System.out.print(i+"\n");
        }
    }

    private static void Task10(){
        System.out.print("Введите целое число: \n");
        System.out.print("Число 1: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        BigInteger a = factorial(a1);
        BigInteger b = factorial(a2);
        BigInteger d = factorial(a2+1,a1);
        BigInteger e = d.multiply(b);
        System.out.print(a+"\n"+b+"\n"+d+"\n"+e);
    }

    private static BigInteger factorial(int end){
        return factorial(2,end);
    }

    private static BigInteger factorial(int start, int end){
        if(start<0||end<0)
            return BigInteger.valueOf(0);
        if(start==0||end==0)
            return BigInteger.valueOf(1);
        if(end==1||end==2)
            return BigInteger.valueOf(end);
        if(start<1000&&end<1000)
            return treeFactorial(start,end);
        return IntStream.rangeClosed(start,end).parallel()
                .mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }

    private static BigInteger treeFactorial(int l, int r) {
        if(l>r)
            return BigInteger.valueOf(1);
        if(l==r)
            return BigInteger.valueOf(l);
        if(r-l==1)
            return BigInteger.valueOf(l*r);
        int m = (l+r)/2;
        return treeFactorial(l,m).multiply(treeFactorial(m+1,r));
    }

    private static void Task11(){
        System.out.print("Введите два целых числа: \n");
        System.out.print("Число n: ");
        int n = sc.nextInt();
        System.out.print("Число k: ");
        int k = sc.nextInt();

        BigInteger factK;
        BigInteger factN;
        BigInteger factNSubK;

        if(n<k||n<=0||k<0) {
            System.out.print(0);
            return;
        }
        factK = factorial(k);

        if(n>k){
            factN = factorial(k+1,n).multiply(factK);
            if(n-k==k)
            {
                factNSubK=factK;
            }
            else
            {
                if(n-k>k){
                    factNSubK = factorial(k,n-k).multiply(factK);
                }
                else
                {
                    factNSubK = factorial(n-k);
                }
            }
        }
        else
        {
            factN = factK;
            factNSubK = BigInteger.ONE;
        }

        BigInteger c = factN.divide(factK.multiply(factNSubK));

        System.out.print(c);


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
        //Task9();
        //Task10();
        //Task11();
    }
}
