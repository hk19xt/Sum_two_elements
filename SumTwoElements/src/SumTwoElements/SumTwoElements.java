package SumTwoElements;

import java.util.*;

public class SumTwoElements {

    public static HashMap<Integer,Integer> hashMap = new HashMap<>();


    public static int[] sumCalculate(int[] numbers, int amount) throws IllegalArgumentException {

        int secondValue = 0;

        initialize(numbers, amount); //Initialize the hashmap by inserting the numbers and the target number from user inputs.

        int arrayFirst = 0;
        int arraySecond = 0;

           for (int firstValueIndex = 0; firstValueIndex < numbers.length; firstValueIndex++) {

            if (hashMap.containsKey(amount-numbers[firstValueIndex])){ //Check if the rest numbers have the target value minus the first value.

                secondValueIndex = hashMap.get(amount-numbers[firstValueIndex]);

                if (secondValueIndex == firstValueIndex){ //If the second value index is the same as the first value index, then return null.
                    return null;
                }

                if (secondValueIndex != firstValueIndex) { //If the second value is different from the first value, it returns the result.
                    arrayFirst=firstValueIndex;
                    arraySecond=secondValueIndex;
                    return new int[]{arrayFirst, arraySecond};

                }
            }
        }
        return null;
    }sumCalculate
    
    //This method is to initialize the hashmap with user inputs of numbers and a target value.
    public static void initialize(int[]numbers, int amount){

        for (int index = 0; index < numbers.length; index++) {
            hashMap.put(numbers[index], index);
        }
    }//initialize
    
}//SumTwoElements
