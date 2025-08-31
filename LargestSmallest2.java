public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 8, -2, 10, 7};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // Largest and second largest logic
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }

            // Smallest logic
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest number: " + firstLargest);
        System.out.println("Second Largest number: " + secondLargest);
        System.out.println("Smallest number: " + smallest);
    }
}
