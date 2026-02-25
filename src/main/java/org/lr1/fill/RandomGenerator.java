package org.lr1.fill;

public class RandomGenerator implements Generator<int[]> {
    @Override
    public int[] generate(int size){
        int[] array = new int[size];
        for (int i = 0; i< size; i++){
            array[i] = (int) (Math.random()*10);
        }
        return array;
    }
    @Override
    public String getName(){
        return "random";
    }
}
