package org.lr1.fill;

public interface Generator<T> {
    T generate(int size);
    String getName();
}
