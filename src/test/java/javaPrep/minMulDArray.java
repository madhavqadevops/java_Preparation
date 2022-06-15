package javaPrep;

public class minMulDArray {
    public static void main(String[] args) {
        int[][] mul={{9,8,7},{0,44,3},{24542,1,45}};
        min(mul);
        max(mul);
        System.out.println(min(mul));
        System.out.println(max(mul));

    }
    public static int min(int[][] a){
        int minVal=a[0][0];

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (a[i][j]<minVal){
                    minVal=a[i][j];
                }

            }

        }
        return minVal;
    }

    public static int max(int[][] a){
        int maxVal=a[0][0];

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (a[i][j]>maxVal){
                    maxVal=a[i][j];
                }

            }

        }
        return maxVal;
    }
}
