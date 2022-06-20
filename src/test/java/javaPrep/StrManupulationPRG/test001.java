package javaPrep.StrManupulationPRG;
//2.reverse a string without changing number/special chaecters.
import java.util.ArrayList;

public class test001 {

    public static void main(String[] args) {
        String str="a!!!!!!!y!m!bhi";
        char[] chararr=str.toCharArray();
        System.out.println(chararr);
        System.out.println(rvse(chararr));
    }

    private static char[] rvse(char[] chararr) {
        int l=0;
        int r=chararr.length-1;

        while (l<r){
            if(!Character.isAlphabetic(chararr[l])){
                l++;
            }
            else if(!Character.isAlphabetic(chararr[r])){
                r--;
            }
            else {
                char temp=chararr[r];
                chararr[r]=chararr[l];
                chararr[l]=temp;
                r--;
                l++;
            }
        }

        return chararr;
    }


}
