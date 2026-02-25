package org.lr1.algorithm;

import org.lr1.utils.Result;

public class ScalarVector implements VectorAlgorithm{

    @Override
    public String getName() {
        return "Scalar Vector";
    }

    @Override
    public Result run(int[]a, int[]b) {
        long operations = 0;
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (long) a[i] * b[i];
            operations += 2;
        }
        return new Result(a.length, operations);
    }
}
