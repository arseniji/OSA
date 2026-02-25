package org.lr1.analyzers;

import org.lr1.algorithm.MatrixAlgorithm;
import org.lr1.utils.Calculus;
import org.lr1.utils.Result;
import org.lr1.fill.Generator;

public class MatrixAnalyzer {
    public static void analyze(MatrixAlgorithm algorithm,
                               Generator<int[][]> generator,
                               int startPow,
                               int endPow) {
        int length = endPow - startPow + 1;
        int[] sizes = new int[length];
        long[] operations = new long[length];
        System.out.println("Анализ алгоритма " + algorithm.getName() + " с " + generator.getName() + " заполнением");
        int index = 0;
        for (int i = startPow; i <= endPow; i++) {
            int size = (int) Math.pow(10, i);
            int[][] a = generator.generate(size);
            int[][] b = generator.generate(size);
            Result result = algorithm.run(a, b);
            sizes[index] = size;
            operations[index] = result.getOperations();
            index++;
        }
        String power = Calculus.estimate(sizes, operations);
        System.out.printf("Вычисленная сложность алгоритма: %s%n", power);
    }
}
