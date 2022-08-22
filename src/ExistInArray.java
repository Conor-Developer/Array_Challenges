import java.util.Arrays;
import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3};
        int userInput;
        boolean arrayValueFound = false;

        Scanner reader = new Scanner(System.in);
        boolean isNumber = true;

        // While loop to allow user to repeatedly make guesses to the values within the array
        while(isNumber) {
            System.out.print("Guess a number within the array, or any other key to exit the program: ");

            // Finds out whether the user has inputted an integer, else the loop ends
            try {
                userInput = Integer.parseInt(reader.nextLine());
                isNumber = true;
            } catch (NumberFormatException e) {
                isNumber = false;
                continue;
            }

            // Iterates through the array to check if the user input matches
            for(int element: intArray){
                if(element == userInput) {
                    System.out.println("Value " + userInput + " found in array");
                    arrayValueFound = true;
                    break;
                }
            }

            // If no match between array value and user input, then a print statement is created
            if(arrayValueFound != true) {
                System.out.println("Value was not found in array");
            }
            arrayValueFound = false;
        }
    }
}
