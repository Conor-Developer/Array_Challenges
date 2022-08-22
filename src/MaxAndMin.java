import java.util.Arrays;


public class MaxAndMin {
    public static void main(String[] args){
        int[] randomValues = new int[10];

        // Generates a random integer value between 1 and 10 and assigns it to an element within the randomValues array.
        for(int i = 0; i < randomValues.length; i++) {
            int randomNumber = (int)(Math.random() * 10) + 1;
            randomValues[i] = randomNumber;
        }

        // Initialises min and max values to a value within the randomValues array
        int minValue = randomValues[randomValues.length - 1];
        int maxValue = randomValues[randomValues.length - 1];

        System.out.println("Values within the array: " + Arrays.toString(randomValues));

        // Reassigns the appropriate min and max values by iterating through the randomValues array
        for(int j = 0; j < randomValues.length; j++) {
            if(minValue > randomValues[j]) {
                minValue = randomValues[j];
            }
            if(maxValue < randomValues[j]) {
                maxValue = randomValues[j];
            }
        }

        System.out.println("The max value within the array is: " + maxValue);
        System.out.println("The min value within the array is: " + minValue);
    }
}
