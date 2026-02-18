package org.example.fill;

public interface Generator<T> {
    T generate(int size);
    String getName();
}
