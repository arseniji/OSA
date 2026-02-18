package org.example.algorithm;

import org.example.utils.Result;
import org.example.utils.Sorting;
import org.example.fill.Generator;

public class BubbleSort implements ArrayAlgorithm {
    Generator<int[]> generatorStrategy;
    public BubbleSort(Generator<int[]> generatorStrategy){
        this.generatorStrategy = generatorStrategy;
    }
    @Override
    public Result run(int size){
        int[]array = generatorStrategy.generate(size);
        return Sorting.bubbleSort(array);
    }
    @Override
    public String getName(){
        return "bubble";
    }

    @Override
    public String getFill(){
        return generatorStrategy.getName();
    }
}
