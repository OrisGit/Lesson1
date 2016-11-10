import java.io.Console;
import java.util.Timer;

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
    }
}
