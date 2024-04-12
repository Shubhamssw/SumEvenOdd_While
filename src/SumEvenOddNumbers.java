public class SumEvenOddNumbers {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int number = 1;

        while (evenCount < 100 || oddCount < 100) {
            if (number % 2 == 0 && evenCount < 100) {
                evenSum += number;
                evenCount++;
            } else if (number % 2 != 0 && oddCount < 100) {
                oddSum += number;
                oddCount++;
            }
            number++;
        }

        // Print the results
        System.out.println("The sum of the first 100 even numbers is: " + evenSum);
        System.out.println("The sum of the first 100 odd numbers is: " + oddSum);
    }
}
