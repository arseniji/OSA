package org.lr1.algorithm;

import org.lr1.fill.Generator;
import org.lr1.utils.Result;
import org.lr1.utils.Sorting;

public class SelectionSort implements ArrayAlgorithm{
    Generator<int[]> generatorStrategy;
    public SelectionSort(Generator<int[]> generatorStrategy){
        this.generatorStrategy = generatorStrategy;
    }
    @Override
    public Result run(int size){
        int[] array = generatorStrategy.generate(size);
        return Sorting.selectionSort(array);
    }
    @Override
    public String getName(){
        return "selection";
    }
    @Override
    public String getFill(){
        return generatorStrategy.getName();
    }
}
