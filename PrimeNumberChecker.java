import java.util.Scanner;

     public class PrimeNumberChecker {
        public static void main(String[] args) {
            // Create Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            
            // Prompt user for input
            System.out.print("Enter a number to check if it's prime: ");
            int number = scanner.nextInt();
            
            // Check if number is prime and display result
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
            
            // Close scanner
            scanner.close();
        }
        
        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            // Handle special cases
            if (num <= 1) {
                return false;  // Numbers less than or equal to 1 are not prime
            }
            if (num == 2) {
                return true;   // 2 is prime
            }
            if (num % 2 == 0) {
                return false;  // Even numbers greater than 2 are not prime
            }
            
            // Check odd numbers up to square root of num
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;  // If number is divisible by any i, it's not prime
                }
            }
            return true;  // If no divisors found, number is prime
        }
    }
