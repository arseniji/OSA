package org.example.fill;

public class MatrixGenerator implements Generator<int[][]>{
    @Override
    public int[][] generate(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j = 0; j< size;j++){
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
    @Override
    public String getName(){
        return "matrix";
    }
}
