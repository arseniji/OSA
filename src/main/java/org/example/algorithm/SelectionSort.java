package org.example.algorithm;

import org.example.fill.Generator;
import org.example.utils.Result;
import org.example.utils.Sorting;

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
