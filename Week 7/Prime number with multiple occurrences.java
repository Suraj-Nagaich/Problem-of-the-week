import java.util.*;
public class PrimeDuplicateFinderArray {
    public static boolean isPrime(int n) {          // checking the prime number
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> freqMap = new HashMap<>();              // store frequency of prime numbers
        for (int num : arr) {
            if (isPrime(num)) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }
        System.out.println("Prime numbers with multiple occurrences:");              // // Print prime numbers with multiple occurrences
        boolean found = false;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No prime number occurs more than once.");
        }
        sc.close();
    }
}
