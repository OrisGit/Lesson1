import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Oris on 19.11.2016.
 */
public class Lesson5 extends Lesson {

//---------------------------------Массивы---------------------------------------------------------------
    private static int[] getRandomOneDemArr(){
        int[] arr = new int[r.nextInt(10)+1];
        for(int i=0; i<arr.length;i++){
            arr[i]=r.nextInt(100);
        }

        return arr;
    }

    private static int[] getRandomOneDemArr(int start, int end){
        int[] arr = new int[r.nextInt(10)+1];
        for(int i=0; i<arr.length;i++){
            arr[i]=start+r.nextInt(end-start+1);
        }

        return arr;
    }

    private static int[] getRandomOneDemArrWithoutZero(int start, int end){
        int[] arr = new int[r.nextInt(10)+1];
        for(int i=0; i<arr.length;i++){
            while (arr[i]==0)
                arr[i]=start+r.nextInt(end-start+1);
        }

        return arr;
    }

    private static void printOneDemArr(int[] arr){
        for (int element : arr) {
            System.out.print(element+" ");
        }
    }

    private static void Task1(){
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);

        System.out.print("Результат: ");
        for (int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }

    private static void Task2(){
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);

        System.out.print("Результат: ");
        for (int element:arr) {
            if(element%2==0) System.out.print(element+" ");
        }
    }

    private static void Task3(){
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);
        int counter = 0;
        for (int element:arr) {
            if(element%2==0) counter++;
        }
        System.out.print("Результат: "+counter);
    }

    private static void Task4() {
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);
        int counter = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])counter++;
        }
        System.out.print("Результат: "+counter);
    }


    private static void Task5() {
        int[] arr = getRandomOneDemArrWithoutZero(-10,10);
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);

        for (int i=1; i<arr.length;i++){
            if(arr[i]*arr[i-1]>0)
            {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }

    private static void Task6(){
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);
        int counter = 0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])counter++;
        }
        System.out.print("Результат: "+counter);
    }
//-------------------------------Дополнительные задачи----------------------------------------------
    private static void Task7() {
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);

        int b;

        for(int i=0;i<=((arr.length-1)/2);i++)
        {
            b = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=b;
        }

        System.out.print("Результат: ");
        printOneDemArr(arr);
    }

    private static void Task8() {
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);

        int b;

        for(int i=1;i<arr.length;i+=2)
        {
            b = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=b;
        }

        System.out.print("Результат: ");
        printOneDemArr(arr);
    }

    private static void Task9() {
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);

        int b = arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=b;
        System.out.print("Результат: ");
        printOneDemArr(arr);
    }


    private static void Task10() {
        int[] arr = getRandomOneDemArr();
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);

        int max = arr[0];
        for (int element:arr) {
            if(element>max)max=element;
        }
        System.out.print("Результат: "+max);
    }

    private static void Task11() {
        int[] arr = new int[]{1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6};//getRandomOneDemArr();
        Arrays.sort(arr);
        System.out.print("Сгенерированный массив: ");
        printOneDemArr(arr);
        int counter=0;
        for (int i = 1; i < arr.length; i++ ){
            if(arr[i]!=arr[i-1])counter++;
        }
        if(counter!=0) counter++;
        System.out.print("Результат: "+counter);
    }
//---------------------------------Математические операции-----------------------------------------

    private static int GCD(int a, int b){
        while(a!=0 && b!=0){
            if(a>b)
                a%=b;
            else
                b%=a;
        }
        return a+b;
    }

    private static int LCM(int a, int b){
        return a/GCD(a,b)*b;
    }


    private static void Task12(){
        System.out.println("Введите значения");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int y = LCM(b,d);
        int x = a*y/b+c*y/d;
        int gcd = GCD(x,y);
        x/=gcd;
        y/=gcd;
        System.out.println(x+"/"+y);
    }

    public static void main(String[] args) {
        //Массивы
        //Task1();
        //Task2();
        //Task3();
        //Task4();
        //Task5();
        //Task6();
        //Дополнительные задачи
        //Task7();
        //Task8();
        //Task9();
        //Task10();
        //Task11();
        //Математические операции
        //Task12();
    }
}
