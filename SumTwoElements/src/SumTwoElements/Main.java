package SumTwoElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,7,14,15};

        String result = Arrays.toString(SumTwoElements.sumCalculate(numbers,12));
        System.out.println(result);
    }
}