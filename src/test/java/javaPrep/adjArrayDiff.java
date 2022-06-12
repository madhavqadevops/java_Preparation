package javaPrep;

public class adjArrayDiff {
    public static void main(String[] args) {
        int[] a={1,3,989,7,9,11,136,15,17};
        maxDiff(a);
        System.out.println(maxDiff(a));
    }
//THis method returns the max of difference between adjacent values in array
    private static int maxDiff(int[] a) {
        int maxdiff=0;
        for (int i=0;i<a.length-1;i++){
            int diff=a[i+1]-a[i];
                if (diff>maxdiff){
                    maxdiff=diff;
                }
        }
        return maxdiff;
    }
}
