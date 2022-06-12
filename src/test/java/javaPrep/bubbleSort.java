package javaPrep;

import java.util.ArrayList;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,3,2,1,5};
        bubbleASC(a);
        bubbleDSC(a);
    }

    private static void bubbleASC(int[] a) {
        int temp;
        for (int i=0;i<=a.length-1;i++){
            for (int j=i+1;j<=a.length-1;j++){
                if (a[i]>a[j]){
                    //SWAPing with Temp variable
                    /*temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;*/
                    //SWAPing with OUT Temp variable
                    a[i]=a[i]+a[j];//a=a+b
                    a[j]=a[i]-a[j];//b=a-b
                    a[i]=a[i]-a[j];//a=a-b
                }
            }
        }
        for (int arr:a){
            System.out.println(arr);
        }
    }

    private static void bubbleDSC(int[] a) {
        int temp;
        for (int i=0;i<=a.length-1;i++){
            for (int j=i+1;j<=a.length-1;j++){
                if (a[i]<a[j]){
                    //SWAPing with Temp variable
                    /*temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;*/
                    //SWAPing with OUT Temp variable
                    a[i]=a[i]+a[j];//a=a+b
                    a[j]=a[i]-a[j];//b=a-b
                    a[i]=a[i]-a[j];//a=a-b
                }
            }
        }
        for (int arr:a){
            System.out.println(arr);
        }
    }

}
