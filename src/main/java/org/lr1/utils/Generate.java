package org.lr1.utils;

import java.util.Random;

public class Generate {

    static Random random = new Random();
    public static int[] generateVector(int size){
        int[] vector = new int[size];
        for (int i = 0;i < size; i++){
            vector[i] = random.nextInt(10);
        }
        return vector;
    }

    public static int[][] generateMatrix(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j = 0; j< size;j++){
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[] increaseFill(int[] a){
        for (int i = 0; i < a.length; i++) a[i] = i;
        return a;
    }

    public static int[] randomFill(int[] a){
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(10);
        return a;
    }

    public static int[] decreaseFill(int[] a){
        for (int i = 0; i < a.length; i++) a[i] = a.length - i;
        return a;
    }

}
