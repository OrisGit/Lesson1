import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by Oris on 16.01.2017.
 */
public class Lesson7 extends Lesson {
    private static void Task1(){
        for (int i=32; i<256; i++)
        {
            out.println(i+" "+(char)i);
        }

    }


    private static void Task2() {
        char c = sc.next().charAt(0);

        if(isDigit(c))out.println("Yes");
        else out.println("No");
    }

    private static boolean isDigit(char value) {
        if((int)value>47&&(int)value<58)
            return true;
        return false;
    }

    private static void Task3() {
        char c = sc.next().charAt(0);
        out.println(toUpper(c));
    }

    private static char toUpper(char value){
        int code = (int)value;
        if(code>96&&code<123) return (char)(code-32);
        return value;
    }

    private static void Task4() {
        char c = sc.next().charAt(0);
        out.println(reverseChar(c));
    }

    private static char reverseChar(char value){
        int code = (int)value;
        if((code>64&&code<91)||(code>96&&code<123))
            return (char)(code^1<<5);
        return (char)code;
    }

    private static void Task5() {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(compare(s1,s2)) out.println("Yes");
        else out.println("No");
    }

    private static boolean compare(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1.length!=c2.length) return false;
        for(int i=0; i<c1.length; i++)
        {
            if(c1[i]!=c2[i]) return false;
        }
        return true;

    }

    private static void Task6(){
        String c = sc.nextLine();

        out.println(getNumberWords(c));
    }

    private static int getNumberWords(String value){
        char[] cValue = value.toCharArray();
        int counter = 0;
        for(int i=0; i<cValue.length; i++){
            if((int)cValue[i]==32) counter++;
        }
        return counter+1;

    }

    private static void Task7(){
        String c = sc.nextLine();
        String s = getMaxLengthWord(c);
        out.println(s+" "+s.length());
    }

    private static String getMaxLengthWord(String line){
        line = line.trim();
        char[] cValue = line.toCharArray();
        int counter = 0;
        int maxLength = 0;
        int maxIndex = 0;

        for(int i=0; i<cValue.length; i++){
            counter++;
            if((int)cValue[i]==32||i==cValue.length-1) {
                if(counter-1>=maxLength){
                    maxIndex = i+1-counter;
                    if(i==cValue.length-1)
                        maxLength=counter;
                    else maxLength=counter-1;
                }
                counter=0;
            }
        }

        return line.substring(maxIndex,maxIndex+maxLength);
    }

    private static void Task8() {
        String c = sc.nextLine();

        out.println(isPolyndrome(c));
    }

    private static boolean isPolyndrome(String value){
        char[] cValue = value.toCharArray();
        for(int i=0; i<cValue.length/2; i++)
        {
            if(cValue[i]!=cValue[cValue.length-1-i]) return false;
        }
        return true;

    }

    private static void Task9() {
        String c = sc.nextLine();

        out.println(twoSymbol(c));
    }

    private static char twoSymbol(String s){
        char[] line = s.toCharArray();
        int i = 0;
        while(true)
        {
            for(int k=0; k<s.length(); k++){
                if((line[i]==line[k])&&(k!=i))
                    return line[i];
            }
            i++;
        }
    }

    private static void Task10(){
        String c1 = sc.nextLine();
        String c2 = sc.nextLine();

        System.out.print(subLine(c1,c2));

    }

    private static boolean subLine(String c1, String c2) {
        char[] s1 = c1.toCharArray();
        char[] s2 = c2.toCharArray();
        List<Integer> indexes = new ArrayList<Integer>();

        for(int i = 0; i<s1.length; i++)
        {
            if((i+s2.length-1<s1.length)&&(s1[i]==s2[0])&&(s1[i+s2.length-1]==s2[s2.length-1]))
                indexes.add(i);
        }


        for(int index:indexes){
            for(int i=0; i<s2.length; i++)
            {
                if(s1[index+i]!=s2[i])
                    break;
                if(i==s2.length-1)
                    return true;
            }

        }
        return false;

    }

    private static void Task11() {
        StringBuilder b;
        String c1;
        int index;
        int x = 0;
        int y = 0;

        while(true)
        {
            c1 = sc.nextLine();
            b = new StringBuilder(c1);
            index = b.indexOf(Character.toString(' '));


            switch (b.substring(0,index))
            {
                case "North": y+=Integer.valueOf(b.substring(index+1,b.length())); break;
                case "South": y-=Integer.valueOf(b.substring(index+1,b.length())); break;
                case "East": x+=Integer.valueOf(b.substring(index+1,b.length())); break;
                case "West": x-=Integer.valueOf(b.substring(index+1,b.length())); break;
            }

            out.println("x: "+x+" y: "+y);
        }
    }

    private static void Task12() {
        String c1 = sc.nextLine();

        System.out.print(isPolyndrome2(c1));
    }

    private static boolean isPolyndrome2(String c1) {
        StringBuilder n = new StringBuilder(c1);
        for(int i = 0; i<n.length(); i++)
        {
            if(n.charAt(i)==(char)32)
            {
                n.deleteCharAt(i);
                i--;
            }

        }

        return isPolyndrome(n.toString());
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
        Task11();
        //Task12();


    }
}
