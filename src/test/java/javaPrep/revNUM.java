package javaPrep;

public class revNUM {
    public static void main(String[] args) {
        revNUM(123564564);

    }
    public static String revNUM(int n){
        String str="";

        while (n>0){
            str=str+(n%10);
            n=n/10;
        }
        System.out.println(str);
        return str;
    }
}
