import java.io.*;

/**
 * Created by Oris on 15.10.2016.
 */
public class Lesson2 extends Lesson {

    private static void Task1() {
        {
            //Задание 1
            byte digit = sc.nextByte();
            if (digit < 32) {
                int result = 1 << digit;
                System.out.print(Integer.toBinaryString(1) + " " + result + " " + Integer.toBinaryString(result));
            } else System.out.print("Не верно введено число");

        }
    }

    private static void Task2() {
        //Задание 2
        byte digit1 = sc.nextByte();
        byte digit2 = sc.nextByte();
        int result = 0;
        if (digit1 < 31 && digit2 < 31) {
            if(digit1!=digit2) result = 1 << digit1 | 1<<digit2;
            else
                result = 2<<digit2;
            System.out.print(result);
        } else System.out.print("Не верно введено число");
    }

    private static void Task3()
    {
        byte digit1 = sc.nextByte();
        byte digit2 = sc.nextByte();
        System.out.println(Integer.toBinaryString(digit1));
        System.out.print(Integer.toBinaryString((digit1>>>digit2)<< digit2));
    }

    private static void Task4()
    {
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();
        int mask = 1<<(digit2);
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(digit1));
        System.out.print(Integer.toBinaryString(digit1|mask));
    }

    private static void Task5()
    {
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();
        int mask = 1<<(digit2);
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(digit1));
        System.out.print(Integer.toBinaryString(digit1^mask));
    }

    private static void Task6()
    {
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();
        int mask = ~(1<<(digit2));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(digit1));
        System.out.print(Integer.toBinaryString(digit1&mask));
    }

    private static void Task7()
    {
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();

        int mask = 0;
        for(int i=0; i<digit2; i++)
        {
            mask |= 1<<i;
        }
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(digit1));
        System.out.print(Integer.toBinaryString(digit1&mask));
    }

    private static void Task8()
    {
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();

        int mask = 1<<(digit2);
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(digit1));
        if((digit1&mask)==0)
        {
            System.out.print(0);
        }
        else System.out.print(1);
    }

    private static void Task9()
    {


        int digit1 = sc.nextInt();
        if(digit1<0||digit1>255)
            return;
        System.out.println(Integer.toBinaryString(digit1));
        int mask = 0;

        for(int i = 7; i>=0; i--)
        {
            mask = 1<<i;
            System.out.print((digit1&mask)==0?"0":"1");
        }

    }

    private static void Task10() {
        StringBuilder sb = new StringBuilder();
        int result = 0;
        try(FileInputStream input = new FileInputStream("in.txt")) {

            int data = input.read();

            while(data != -1){
                if(Character.isDigit((char)data))
                {
                    sb.append((char)data);
                }
                else
                    if(Character.isSpaceChar((char)data))
                    {
                        System.out.print(sb.toString());
                        result+=Integer.parseInt(sb.toString());
                        sb.delete(0,sb.length());
                    }
                data = input.read();
            }
            if(sb.length()!=0)result+=Integer.parseInt(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("out.txt"))) {
            output.write(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        Task1();
//        Task2();
//         Task3();
//         Task4();
//         Task5();
//        Task6();
//        Task7();
//        Task8();
//        Task9();
        //Task10();
    }
}
