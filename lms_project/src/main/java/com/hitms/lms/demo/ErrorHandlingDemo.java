package com.hitms.lms.demo;

import com.hitms.lms.exception.BookUnavailableException;
import com.hitms.lms.service.LibraryService;

/** Demonstrates safe division, checked exceptions, and a corrected max search. */
public final class ErrorHandlingDemo {

    private ErrorHandlingDemo() {
        // Utility class; do not instantiate.
    }

    /** Divides two integers and handles a zero denominator gracefully. */
    public static int safeDivide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    /** Returns the largest value in a non-empty array. */
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required.");
        }
        int maxValue = numbers[0];
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    /** Runs the exception-handling examples. */
    public static void main(String[] args) {
        System.out.println("Safe division: " + safeDivide(12, 3));
        safeDivide(12, 0);

        LibraryService libraryService = new LibraryService();
        try {
            System.out.println("Copies after issue: "
                    + libraryService.issueBook(2, "Clean Code"));
            libraryService.issueBook(0, "Clean Code");
        } catch (BookUnavailableException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Largest negative value: " + findMax(new int[] {-5, -2, -9}));
    }
}
