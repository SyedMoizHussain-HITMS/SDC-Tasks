package com.hitms.lms.util;

/** Provides small price calculations used by the library checkout flow. */
public final class PriceUtils {

    private PriceUtils() {
        // Utility class; do not instantiate.
    }

    /**
     * Calculates a price after tax.
     *
     * @param price pre-tax price, which must be non-negative
     * @param taxRate tax as a decimal fraction, which must be non-negative
     * @return the price including tax
     * @throws IllegalArgumentException if price or taxRate is negative
     */
    public static double calculatePriceWithTax(double price, double taxRate) {
        if (price < 0 || taxRate < 0) {
            throw new IllegalArgumentException("Price and tax rate must not be negative.");
        }
        // Keep the calculation in one place so callers apply tax consistently.
        return price * (1 + taxRate);
    }
}
