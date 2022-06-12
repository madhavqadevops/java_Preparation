package javaPrep;

public class pyramid {
    public static void main(String[] args) {
        pyramid(4);
        pyramid2(4);

    }

    public static void pyramid(int a){

        for (int i=1;i<=a;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }


    }

    public static void pyramid2(int a){
        String s01="*";

        for (int i=1;i<=a;i++){
            System.out.println(s01);
            for (int j=1;j<=i;j++){
                s01=s01+" *";
            }
        }


    }
}
