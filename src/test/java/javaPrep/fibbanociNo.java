package javaPrep;
//0 1 1 2 3 5 8 13 21
public class fibbanociNo {
    public static void main(String[] args) {
        fB(6);
    }

    public static void fB(int a){
        int i=0;
        int j=1;
        int sum=0;
        int b=0;

        while (b<a){
            sum=i+j;
            System.out.println(sum);
            i=j;
            j=sum;
            b++;
        }
    }
}
