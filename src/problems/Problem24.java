package problems;

import java.util.ArrayList;

public class Problem24 {

    // Lexicographic Permutations
    // 1.000.000th lexicographic permutation of these digits
    public static void main(String[] args) {

        // Setup

        int digitLimit = 9;
        int targetPermutationCount = 1_000_000;

        int currentPermutationMin = 0;
        int currentPermutationMax;

        StringBuilder result = new StringBuilder();

        ArrayList<Integer> remainingDigits = new ArrayList<>();
        for (int i = 0; i <= digitLimit; i++) {
            remainingDigits.add(i);
        }

        // Solution

        while (!remainingDigits.isEmpty()) {
            int permutationAmount = factorial(remainingDigits.size() - 1);
            int digitIndex = 0;

            currentPermutationMax = currentPermutationMin + permutationAmount;
            while (currentPermutationMax < targetPermutationCount) {
                currentPermutationMin += permutationAmount;
                currentPermutationMax += permutationAmount;
                digitIndex++;
            }

            int digit = remainingDigits.remove(digitIndex);
            result.append(digit);
        }

        System.out.println("The millionth lexicographic permutation is: \n" + result);
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
