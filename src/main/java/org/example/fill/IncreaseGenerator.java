package org.example.fill;

public class IncreaseGenerator implements Generator<int[]> {
    @Override
    public int[] generate(int size){
        int[] array = new int[size];
        for (int i = 0; i< size; i++){
            array[i] = i;
        }
        return array;
    }
    @Override
    public String getName(){
        return "increase";
    }
}
