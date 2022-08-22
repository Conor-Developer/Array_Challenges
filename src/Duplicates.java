import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        // Assigns 10 x random integers between the values of 1 and 20 into array1;
        for(int i = 0; i < array1.length; i++) {
            int randomNumber = (int)(Math.random() * 20) + 1;
            array1[i] = randomNumber;
        }

        // Assigns 10 x random integers between the values of 1 and 20 into array2;
        for(int j = 0; j < array2.length; j++) {
            int randomNumber = (int)(Math.random() * 20) + 1;
            array2[j] = randomNumber;
        }

        System.out.println("Values within array1: " + Arrays.toString(array1));
        System.out.println("Values within array2: " + Arrays.toString(array2));

        // Iterates through both arrays and finds duplicate values
        for(int k = 0; k < array1.length; k++) {
            for(int l = 0; l < array2.length; l++) {
                if(array1[k] == array2[l]) {
                    System.out.println("Value " + array1[k] + " is a duplicate in both array1 and array2. You can find the values at index " + k + " (in array1), and index " + l + " (in array2)");
                }
            }
        }
    }
}
