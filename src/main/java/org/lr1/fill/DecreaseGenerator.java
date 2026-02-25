package org.lr1.fill;

public class DecreaseGenerator implements Generator<int[]> {
    @Override
    public int[] generate(int size){
        int[] array = new int[size];
        for (int i = 0; i< size; i++){
            array[i] = array.length - i;
        }
        return array;
    }
    @Override
    public String getName(){
        return "decrease";
    }
}
