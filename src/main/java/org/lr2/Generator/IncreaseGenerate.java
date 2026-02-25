package org.lr2.Generator;

public class IncreaseGenerate implements Generate{
    @Override
    public int[] generate(int size){
        int[] value = new int[size];
        for (int i=0;i<size;i++){
            value[i] = i;
        }
        return value;
    }
    @Override
    public String getName(){
        return "Increase";
    }
}
