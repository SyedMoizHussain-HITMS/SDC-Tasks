package com.hitms.lms.demo;

import com.hitms.lms.util.LibraryUtils;
import java.time.LocalDate;

/** Demonstrates reuse of the LMS utility module. */
public final class Main {

    private Main() {
        // Utility class; do not instantiate.
    }

    /** Prints the results of the title and date helper methods. */
    public static void main(String[] args) {
        String title = LibraryUtils.formatTitle("  the old man and the sea ");
        long loanPeriod = LibraryUtils.daysBetween(
                LocalDate.of(2026, 10, 1), LocalDate.of(2026, 10, 15));
        System.out.println("Formatted title: " + title);
        System.out.println("Days between dates: " + loanPeriod);
    }
}
