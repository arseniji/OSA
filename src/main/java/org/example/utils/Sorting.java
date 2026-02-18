package org.example.utils;

public class Sorting {
    public static Result bubbleSort(int[] a){
        int operations = 0;
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1; j ++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    operations += 3;
                }
            }
        }
        System.out.println("Size: " + a.length);
        System.out.println("Operations: " + operations + "\n");
        return new Result(a.length,operations);
    }
    public static Result selectionSort(int[] a){
        int operations = 0;

        for (int i = 0; i < a.length - 1; i++){
            int minIndex = i;
            operations++;

            for (int j = i + 1; j < a.length; j++){
                operations++;
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                    operations++;
                }
            }

            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
                operations += 3;
            }
        }
        System.out.println("Size: " + a.length);
        System.out.println("Operations: " + operations + "\n");
        return new Result(a.length, operations);
    }
    public static Result insertionSort(int[] a){
        int operations = 0;

        for (int i = 1; i < a.length; i++){
            int key = a[i];
            int j = i - 1;

            operations++;

            while (j >= 0) {
                operations++;

                operations++;
                if (a[j] > key) {
                    a[j + 1] = a[j];
                    operations++;
                    j--;
                    operations++;
                } else {
                    break;
                }
            }
            a[j + 1] = key;
            operations++;
        }
        System.out.println("Size: " + a.length);
        System.out.println("Operations: " + operations + "\n");
        return new Result(a.length, operations);
    }


}
