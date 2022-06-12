package javaPrep;

public class primeNum {
    public static void main(String[] args) {
        primecheck(-11);

    }

    //prime no:-should be copmeletly divisible by 1,number.

    public static void primecheck(int val){
        for (int i=2;i<val/2;i++){
            if (val%i==0){
                System.out.println("The numbver is not prime");
                break;
            }
            else if (val%i!=0){
                System.out.println("The number is prime");
                break;
            }
        }
    }
}
