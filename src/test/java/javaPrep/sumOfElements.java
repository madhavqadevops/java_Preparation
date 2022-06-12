package javaPrep;
//sum of values in array.
public class sumOfElements {

    public static void main(String[] args) {
        int[] a={1,2,3};
        int totalSum=sumArray(a);
        System.out.println("Total Value of array"+" "+totalSum);
        int m01=multi(5,10);
        System.out.println("Multi value of"+" "+m01);
    }
//method to muliply a numbers without using *
    private static int multi(int i, int j) {
        int mul=0;
        int k=1;
        while (k<=j){
            mul=mul+i;
            k++;
        }

        return mul;
    }

    //Method to sum of values in array.
    private static int sumArray(int[] a) {
        int sum=0;
        //extract every value in array and add to sum
        for (int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
            System.out.println("Adding"+""+a[i]+"to sum");
        }
        return sum;
    }

}

