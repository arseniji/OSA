package org.example.analyzers;

import org.example.algorithm.ArrayAlgorithm;
import org.example.utils.Calculus;
import org.example.utils.Result;

public class ArrayAnalyzer {
    public static void analyze(ArrayAlgorithm algorithm, int startPow, int endPow){
        int length = endPow - startPow + 1;
        int[] sizes = new int[length];
        long[] operations = new long[length];
        System.out.println("Анализ алгоритма " + algorithm.getName() + " с " + algorithm.getFill() + " заполнением");
        int index = 0;
        for (int i = startPow; i <= endPow; i++) {
            int size = (int) Math.pow(10, i);
            Result result = algorithm.run(size);
            sizes[index] = result.getSize();
            operations[index] = result.getOperations();
            index++;
        }
        String power = Calculus.estimate(sizes, operations);
        System.out.printf("Вычисленная сложность алгоритма: %s",power);
        System.out.println();
    }
}
