package com.hitms.lms.demo;

import java.util.Locale;

/** Calculates and prints a simple score report. */
public final class ScoresReport {

    private ScoresReport() {
        // Utility class; do not instantiate.
    }

    /** Returns the arithmetic mean of the provided scores. */
    public static double calculateAverage(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("At least one score is required.");
        }
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    /** Calculates and prints the average score in a report. */
    public static void printReport(int[] scores) {
        System.out.printf(Locale.ROOT, "Average score: %.2f%n", calculateAverage(scores));
    }

    /** Runs the score-report example. */
    public static void main(String[] args) {
        printReport(new int[] {80, 90, 100});
    }
}
