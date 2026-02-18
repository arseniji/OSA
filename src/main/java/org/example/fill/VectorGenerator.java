package org.example.fill;

public class VectorGenerator implements Generator<int[]>{
    @Override
    public int[] generate(int size){
        int[] vector = new int[size];
        for (int i = 0; i < size; i++){
            vector[i] = (int) (Math.random()*10);
        }
        return vector;
    }
    @Override
    public String getName(){
        return "vector";
    }
}
