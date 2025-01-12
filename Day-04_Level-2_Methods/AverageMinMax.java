public class AverageMinMax {
    public static void main(String[] args) {
        int size = 5; // Example size
        int[] randomArray = generate4DigitRandomArray(size);

        // Display the generated array
        System.out.print("Generated array: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find and display average, min, and max values
        double[] results = findAverageMinMax(randomArray);
        System.out.println("Average: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1000 + (int)(Math.random() * 9000); // Generate 4-digit number
        }
        return array;
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}