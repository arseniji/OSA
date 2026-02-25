package org.lr1.algorithm;

import org.lr1.utils.Result;

public class ScalarMatrix implements MatrixAlgorithm{
    @Override
    public String getName() {
        return "Matrix Multiply";
    }

    @Override
    public Result run(int[][]a, int[][]b) {
        int n = a.length;
        int[][] c = new int[n][n];
        long operations = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    operations += 2;
                }

        return new Result(n, operations);
    }
}
