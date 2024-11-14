package hackerrank;

import java.util.Arrays;

public class PassingSubjects {
    public static int maxSubjectsNumber(int[] answered, int[] needed, int q) {
        int[] minAttempts = new int[answered.length];
        for (int i = 0; i < minAttempts.length; i++) {
            minAttempts[i] = Math.max(0, needed[i] - answered[i]);
        }
        Arrays.sort(minAttempts);

        int accumulated = 0;
        for (int i = 0; i < minAttempts.length; i++) {
            accumulated += minAttempts[i];
            if (accumulated > q) {
                return i;
            }
        }
        return minAttempts.length;
    }
}