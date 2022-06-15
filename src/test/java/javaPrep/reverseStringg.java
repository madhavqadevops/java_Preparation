package javaPrep;

import java.util.SortedMap;

public class reverseStringg {
    public static void main(String[] args) {
        palindrome("Madhav");
        palindrome("MaDam");

    }
    public static String revSTR(String s){
        String s1=s.toLowerCase();
        String temp="";
        for (int i=s1.length()-1;i>=0;i--){
            temp=temp + s1.charAt(i);
        }
        return temp;
    }
    public static void palindrome(String s){
        revSTR(s);
        if (revSTR(s).equals(s.toLowerCase())){
            System.out.println("The provided string is palindrome");
        }
        else {
            System.out.println("The provided string is NOT A palindrome");
        }
    }
}
