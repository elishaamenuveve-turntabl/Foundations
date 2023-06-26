package org.example;

public class FibonacciSequence {

    public static long getNThTerm(int nthTerm) {
        long n_1 = 1;
        long n_2 = 0;

        if (!(nthTerm > 0)) throw new RuntimeException("Can't Find " + nthTerm + " Term");
        if (nthTerm == 1) return 0;
        if (nthTerm == 2) return 1;

        for (int term = 3; term <= nthTerm; term++) {
            long sum_of_previous_two_terms = n_2 + n_1;

            n_2 = n_1;
            n_1 = sum_of_previous_two_terms;
        }

        return n_1;
    }

}
