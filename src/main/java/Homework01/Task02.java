package Homework01;

/** 2. Дан массив nums = [3,2,2,3] и число val = 3.
 Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 Таким образом, первые несколько (или все) элементы массива должны быть отличны от заданного,
 а остальные - равны ему.
 */
import java.util.Arrays;

public class Task02 {
    public static void reorder(int[] A) {

        int val = 3;
        int k = 0;

        for (int i : A) {
            if (i != val) {
                A[k++] = i;
            }
        }


        for (int i = k; i < A.length; i++) {
            A[i] = val;
        }
    }

    public static void main(String[] args) {
        int[] A = {3, 3, 8, 2, 7, 0, 4, 0, 3};

        reorder(A);
        System.out.println(Arrays.toString(A));

    }
}
