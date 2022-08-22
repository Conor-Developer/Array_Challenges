import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loops through arrays and sums the values within the numbers Array
        for(int number: numbers){
            sum += number;
        }

        // Prints sum
        System.out.println(sum);

        // Calculates average of the values within numbers array
        double average = sum / numbers.length;
        System.out.println(average);


    }
}
