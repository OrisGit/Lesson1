/**
 * Created by Oris on 11.11.2016.
 */
public class Lesson4 extends Lesson {

    private static void Task1(){
        int digit = 105;
        while(digit!=(digit%100)*7){
            digit+=7;
        }
        System.out.print(digit);
    }

    private static void Task2(){
        System.out.print("Введите целое число: \n");
        System.out.print("Число n: ");
        int n = sc.nextInt();

        System.out.println(1);

        for(int i=2;i<n;i++){
            if(n%i==0)
                System.out.println(i);
        }
        System.out.println(n);
    }

    private static void Task3(){
        System.out.print("Введите два целых числа: \n");
        System.out.print("Число n: ");
        int n = sc.nextInt();
        System.out.print("Число m: ");
        int m = sc.nextInt();

        if(n<=6&&m>=6) System.out.println(6);
        if(n<=28&&m>=28) System.out.print(28);
    }

    private static void Task4(){
        System.out.print("Введите два целых числа: \n");
        System.out.print("Число m: ");
        int m = sc.nextInt();
        System.out.print("Степень n: ");
        int n = sc.nextInt();

        int res = 1;
        while (n!=0){
            if((n & 1)==1)
            {
                res*=m;
                n--;
            }
            else{
                m*=m;
                n>>=1;
            }
        }

        System.out.print(res);
    }

    private static void Task5(){
        System.out.print("Введите два целых числа: \n");
        System.out.print("Число m: ");
        int m = sc.nextInt();
        System.out.print("Число n: ");
        int n = sc.nextInt();

        int deg = 0;

        if (m == 0 || n == 0) {
            System.out.print(m | n);
            return;
        }

        while (((m | n) & 1) == 0)
        {
            deg++;
            m >>= 1;
            n >>= 1;
        }

        while ((m & n)!=0)
        {
            if ((n & 1)==1)
                while ((m & 1) == 0)
                    m >>= 1;
            else
                while ((n & 1) == 0)
                    n >>= 1;
            if (m >= n)
                m = (m - n) >> 1;
            else
                n = (n - m) >> 1;
        }
        System.out.print((m | n) << deg);
    }


    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        //Task4();
        //Task5();
    }
}
