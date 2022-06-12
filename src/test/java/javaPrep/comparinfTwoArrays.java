package javaPrep;
//comparing two arrays of same length
import java.util.ArrayList;

public class comparinfTwoArrays {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,9};
        int[] b={1,2,6,9,8,7};
        Object[] c=comparing(a,b).toArray();

        for (Object obj:c){
            System.out.println(obj);
        }
    }
    private static ArrayList comparing(int[] a, int[] b) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i=0;i<=a.length-1;i++){
                for (int j=0;j<=a.length-1;j++) {
                    if (a[i] == b[j]) {
                        al.add(a[i]);
                    }
                }

        }
        return al;
    }
}
