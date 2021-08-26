package SumTwoElements;

import java.util.*;

public class SumTwoElements {

    public static HashMap<Integer,Integer> hashMap = new HashMap<>();


    public static int[] sumCalculate(int[] numbers, int amount) throws IllegalArgumentException {

        int secondValue = 0;

        initialize(numbers, amount);

        int arrayFirst = 0;
        int arraySecond = 0;

        for (int firstValue = 0; firstValue < numbers.length; firstValue++) {

            if (hashMap.containsKey(amount-numbers[firstValue])){

                secondValue = hashMap.get(amount-numbers[firstValue]);

                if (secondValue == firstValue){
                    return null;
                }

                if (secondValue != firstValue) {
                    arrayFirst=firstValue;
                    arraySecond=secondValue;
                    return new int[]{arrayFirst, arraySecond};

                }
            }
        }
        return null;
    }
    public static void initialize(int[]numbers, int amount){

        for (int index = 0; index < numbers.length; index++) {
            hashMap.put(numbers[index], index);
        }
    }
}
