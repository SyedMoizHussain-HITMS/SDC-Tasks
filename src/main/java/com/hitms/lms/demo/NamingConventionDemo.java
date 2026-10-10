package com.hitms.lms.demo;

/** Demonstrates a naming-convention refactor of a score calculation. */
public final class NamingConventionDemo {

    private NamingConventionDemo() {
        // Utility class; do not instantiate.
    }

    /** Returns the average of the supplied score values. */
    public static double calculateAverageScore(int[] scoreValues) {
        return ScoresReport.calculateAverage(scoreValues);
    }

    /** Runs the refactored naming example. */
    public static void main(String[] args) {
        int[] quizScores = {75, 85, 95};
        System.out.println("Average: " + calculateAverageScore(quizScores));
    }
}
