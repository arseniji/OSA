package org.example.utils;

public class Result {
    int size;
    long operations;
    public Result(int size, long operations){
        this.size = size;
        this.operations = operations;
    }
    public int getSize() {
        return size;
    }
    public long getOperations() {
        return operations;
    }
}
