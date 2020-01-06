package ReplitPractices;

import java.util.Scanner;

public class repl125 {
    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        String[] str={scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
String shortest=getShortest(str);
        System.out.println(shortest);
    }
    public static String getShortest(String[] array){
        int index=0;
        int element=array[0].length();
        for (int i = 1; i <array.length ; i++) {
            if(array[i].length()<element){
                index=i;
                element=array[i].length();

            }

        }
        return array[index];
    }

}
