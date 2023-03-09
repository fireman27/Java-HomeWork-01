/** 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы */
package Homework01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        Integer[] A = { 2, 5, 10, 6, 8, 9, 4 };
        List<Integer> ints = Arrays.asList(A);
        System.out.println("Min element " + Collections.min(ints));
        System.out.println("Max element " + Collections.max(ints));
    }
}

