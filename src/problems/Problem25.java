package problems;

public class Problem25 {

    // 1000-digit Fibonacci number
    // F_n = F_(n-1) + F_(n-2) with F_1 = 1 and F_2 = 1
    // What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
    public static void main(String[] args) {

        /* Brute Force is not cool for a 1_000 digit number ( > 10^999 )

            We use the closed form expression of the fibonacci sequence:
            F(n) = [ p^n / sqrt(5) ]
            with p ~= 1.6180, the Golden Ratio

            The smallest number with 1_000 digits is 1e999 = 10^999. We can formulate
                p^n / sqrt(5) > 10^999
            <=> log(p) * n - log(5) / 2 > log(10) * 999
            <=> n > (log(10) * 999 + log(5) / 2) / log(p)

            which is:
         */

        double phi = 1.6180;
        System.out.println("The index of the first 1000-digit Fibonacci number is: " +
                (int) (( Math.log(10) * 999 + Math.log(5) / 2 ) / Math.log(phi)));
    }
}
