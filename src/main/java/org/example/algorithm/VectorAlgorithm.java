package org.example.algorithm;

import org.example.utils.Result;

public interface VectorAlgorithm extends Analyzable{
    Result run(int[] a, int[] b);
}
