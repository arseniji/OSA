package org.lr1.algorithm;

import org.lr1.utils.Result;
import org.lr1.utils.Sorting;
import org.lr1.fill.Generator;

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
