package javaPrep.StrManupulationPRG;

import java.util.ArrayList;

public class strgOccur {
    public static void main(String[] args) {
        occur("mAdhav",'a');
        rmvDC("MMAADDHHAVV");

    }

    public static void occur(String s, char c) {
        String s1=s.toLowerCase();
        int k = 0;

        for (int i = 0; i <= s1.length() - 1; i++) {
            if (s1.charAt(i) == c) {
                k++;
            }

        }
        System.out.println(c+"\t"+"is repeated" +k+ "times");
    }

    public static void rmvDC(String s) {
        String s1 = s.toLowerCase();
        char[] ch=s1.toCharArray();
        ArrayList<Character> temp=new ArrayList();
        int k = 0;
       //String temp="";
        for (int i=0;i<s1.length();i++)
            if (!temp.contains(ch[i])){
                temp.add(ch[i]);
            }
        System.out.println("The string with unique charecters is"+temp.toString());
    }

}