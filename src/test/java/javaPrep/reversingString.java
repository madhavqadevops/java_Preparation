package javaPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/*Reversing String
1.And print each charecter.
2.And print whole string.
* */
public class reversingString {
    public static void main(String[] args) {
        System.out.println("Reversing String:: Using for,String array");
        String s01 = "Madhav a d h a v Reddy";
        char[] c01 = s01.toCharArray();
        String s02 = "";

        for (int i = s01.length() - 1; i >= 0; i--) {
            char ch = s01.charAt(i);
            s02 = s02 + ch;
            System.out.println(ch);
        }
        System.out.println(s02);

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Using built in reverse() method of the StringBuilder class");

        StringBuilder sB = new StringBuilder();
        sB.append(s01);
        sB.reverse();
        System.out.println(sB);

        // Java program to Reverse a String using ListIterator
        System.out.println("----------------------------------------------------------------------------------------------------");
        List<Character> train2 = new ArrayList<>();

        for (char c : c01) {
            train2.add(c);
        }

        Collections.reverse(train2);
        ListIterator li = train2.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
}
