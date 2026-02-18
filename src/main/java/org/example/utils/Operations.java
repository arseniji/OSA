package org.example.utils;

public class Operations {
    public static Result scalarVector(int[] a, int[] b){
        int operations = 0;
        long sum = 0;
        for (int i = 0; i < a.length; i ++){
            sum+= (long) a[i] * b[i];
            operations +=2;
        }
        return new Result(a.length,operations);
    }

    public static Result scalarMatrix(int[][]a, int[][]b){
        int operations = 0;
        int[][] sum = new int[a.length][a.length];
        for (int i = 0; i< a.length; i++){
            for (int j = 0; j < a.length; j++){
                for (int k = 0; k < a.length; k++){
                    sum[i][j] += a[i][k] * b[k][j];
                    operations += 2;
                }
            }
        }
        return new Result(a.length,operations);
    }
}
