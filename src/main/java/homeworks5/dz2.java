package homeworks5;

import javax.lang.model.element.Name;
import java.lang.reflect.Array;
import java.util.Arrays;

public class dz2 {
    public static void main(String[] args) {
        printStringCount("hello", 5);
        ArraySum (new int[]{1, 6, 6, 6});

        int[] arr = {1, 2, 3, 4};
        ArrayFill(1, arr);
        int[] arra = {1, 2, 3, 4};
        ArrayIncrement(4, arra);
        ArrayDiff(new int[]{1, 9, 5, 5, 2});

        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i] + arr2[i];
        }
        System.out.println(Arrays.toString(arra));
    }

    public static void sumArray(int[] arr) {


    }
    public static void printStringCount(String s,int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(s);
        }
    }
    public static void ArraySum (int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 5) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
    public static void ArrayFill(int a, int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i]=a;

        }
    }
    public static void ArrayIncrement(int a, int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]+ a;
        }
    }
    public static void ArrayDiff( int[] rey) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < rey.length /2; i++){
            leftSum = rey[i]+leftSum;
        }
        for (int i = rey.length /2; i < rey.length; i++){
            rightSum = rey[i]+rightSum;
        }
        if (leftSum > rightSum){
            System.out.println(leftSum);
        }
        else {
            System.out.println(rightSum);
        }
    }
}