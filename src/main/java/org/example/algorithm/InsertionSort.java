package org.example.algorithm;

import org.example.fill.Generator;
import org.example.utils.Result;
import org.example.utils.Sorting;

public class InsertionSort implements ArrayAlgorithm{
    Generator<int[]> generatorStrategy;
    public InsertionSort(Generator<int[]> generatorStrategy){
        this.generatorStrategy = generatorStrategy;
    }
    @Override
    public Result run(int size){
        int[] array = generatorStrategy.generate(size);
        return Sorting.insertionSort(array);
    }
    @Override
    public String getName(){
        return "insertion";
    }

    @Override
    public String getFill(){
        return generatorStrategy.getName();
    }
}
