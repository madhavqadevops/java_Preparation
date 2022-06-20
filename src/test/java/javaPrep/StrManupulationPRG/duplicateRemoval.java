package javaPrep.StrManupulationPRG;

public class duplicateRemoval {
    public static void main(String[] args) {
        String s01 = "MMMaaadhhhggggg a v";
        String temp = "" + s01.charAt(0);

        for (int i = 0;i<=s01.length()-1;i++){

            if (!temp.contains(String.valueOf(s01.charAt(i)))){
                temp = temp + s01.charAt(i);
            }
            //System.out.println(temp);
        }

        System.out.println(temp);
    }
}