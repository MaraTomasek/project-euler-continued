package helpers;

public class Fibonacci {

    public static long fibonacci(long termTarget) {
        if (termTarget <= 0) return 0;
        if (termTarget == 1) return 1;

        long term1 = 0;
        long term2 = 1;
        long termValue = 1;
        for (int termIndex = 2; termIndex <= termTarget; termIndex++) {
            termValue = term1 + term2;
            term1 = term2;
            term2 = termValue;

            if (term2 < term1) {
                throw new RuntimeException(String.format("Overflow at Term %d - Last correct value is %d: %d", termIndex, termIndex - 1, term1));
            }
        }

        return termValue;
    }
}
