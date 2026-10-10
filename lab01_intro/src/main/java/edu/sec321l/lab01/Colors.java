package edu.sec321l.lab01;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

/** Prints the lab greeting in green using Jansi. */
public final class Colors {

    private Colors() {
        // Utility class; do not instantiate.
    }

    /** Starts the colored greeting program. */
    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        try {
            System.out.println(Ansi.ansi()
                    .fg(Ansi.Color.GREEN)
                    .a("Hello, Software Construction!")
                    .reset());
        } finally {
            AnsiConsole.systemUninstall();
        }
    }
}
