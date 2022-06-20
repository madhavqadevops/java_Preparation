package javaPrep.StrManupulationPRG;
//6.reverse a words in string sperated by space.
public class revrseWord {
    public static void main(String[] args) {
        rvrse("Welcome India");
        rvrSC("MAdhav@Ummadi*Red(TER");
    }
//Method to reverse a words in string sperated by space.
    private static void rvrse(String s1) {
        String[]  s2=s1.split(" ");
        String reverse="";

        for (int i=0;i<=s2.length-1;i++){
           String word= s2[i];
            //System.out.println(word);
            String temp="";

                for (int j=word.length()-1;j>=0;j--){
                temp+=word.charAt(j);
                }
            reverse=reverse+temp+" ";
            //System.out.println(reverse);
        }
        System.out.println(reverse);
    }


//Method to reverse words and print removing special charecters.
    private static void rvrSC(String s1) {
        String[]  s2=s1.split("[^A-Za-z0-9]");
        String reverse="";

        for (int i=0;i<=s2.length-1;i++){
            String word= s2[i];
            //System.out.println(word);
            String temp="";

            for (int j=word.length()-1;j>=0;j--){
                temp+=word.charAt(j);
            }
            reverse=reverse+temp;
            //System.out.println(reverse);
        }
        System.out.println(reverse);
    }



}


