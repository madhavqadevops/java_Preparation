package javaPrep;

import java.util.ArrayList;

public class unquieNUMArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,88,99,3,4,5,6,7,};
        pntReptd(a);

    }

    public static void pntReptd(int[] a) {
        ArrayList<Integer> al = new ArrayList();

        for (int i = 0; i < a.length; i++) {
            int k = 0;
                if (!al.contains(a[i])) {
                    al.add(a[i]);
                    k++;
                for (int j = i + 1; j < a.length; j++) {

                        if (a[j] == a[i]) {
                        k++;
                    }

                }
                    System.out.println(a[i] +"\t"+ "repeated" + "\t"+k+ "times");
                if (k==1){
                    System.out.println(a[i] +"\t"+ "is Unique Number");
                }
            }

        }

    }
}
