package com.hitms.lms.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/** Reusable formatting and date helpers for the LMS. */
public final class LibraryUtils {

    private LibraryUtils() {
        // Utility class; do not instantiate.
    }

    /** Formats a title in title case. */
    public static String formatTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            return "";
        }
        String[] words = title.trim().toLowerCase(Locale.ROOT).split("\\s+");
        StringBuilder formattedTitle = new StringBuilder();
        for (String word : words) {
            if (formattedTitle.length() > 0) {
                formattedTitle.append(' ');
            }
            formattedTitle.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1));
        }
        return formattedTitle.toString();
    }

    /** Returns the signed number of days from date1 to date2. */
    public static long daysBetween(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }
}
