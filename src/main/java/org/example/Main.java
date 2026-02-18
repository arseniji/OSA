package org.example;

import org.example.algorithm.*;
import org.example.analyzers.ArrayAnalyzer;
import org.example.analyzers.MatrixAnalyzer;
import org.example.analyzers.VectorAnalyzer;
import org.example.fill.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Скаляр векторов: ");
        VectorAnalyzer.analyze(new ScalarVector(),new VectorGenerator(),1,5);
        System.out.println("Скаляр матриц: ");
        MatrixAnalyzer.analyze(new ScalarMatrix(), new MatrixGenerator(), 1,3);
        System.out.println("Сортировки: ");
        ArrayAnalyzer.analyze(new BubbleSort(new RandomGenerator()),1,3);
        ArrayAnalyzer.analyze(new BubbleSort(new IncreaseGenerator()),1,3);
        ArrayAnalyzer.analyze(new BubbleSort(new DecreaseGenerator()),1,3);
        ArrayAnalyzer.analyze(new SelectionSort(new RandomGenerator()),1,3);
        ArrayAnalyzer.analyze(new SelectionSort(new IncreaseGenerator()),1,3);
        ArrayAnalyzer.analyze(new SelectionSort(new DecreaseGenerator()),1,3);
        ArrayAnalyzer.analyze(new InsertionSort(new RandomGenerator()),1,3);
        ArrayAnalyzer.analyze(new InsertionSort(new IncreaseGenerator()),1,3);
        ArrayAnalyzer.analyze(new InsertionSort(new DecreaseGenerator()),1,3);
    }
}