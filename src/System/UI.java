package System;

public class UI {
    private static final String displayName = "Pounter";

    public static void printMain() {
        System.out.printf("%s File Manager [Version 0.1]\n(c) %s. All rights reserved.\n\nYou need help? You must run 'help' command.\n", displayName, displayName);
    }

    public static void columnPointer() {
        System.out.printf("\n(FM)\n$-> ");
    }

    public static void printCommands() {
        for (var commandItem : Process.commands) {
            System.out.printf("%s\t- %s%n", commandItem[0], commandItem[1]);
        }
    }
}