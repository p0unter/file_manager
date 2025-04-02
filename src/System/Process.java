package System;

import java.util.Scanner;

public class Process {
    public static String currentCommand = "home";
    public static String currentPath = ""; // Default Current Path
    static Scanner scanner = new Scanner(System.in);

    public static String[][] commands = {
            { "help", "Displays the list of available commands." },
            { "cd", "Set current directory." },
            { "kla", "Create a new folder." },
            { "dos", "Create a new file." },
            { "rename", "Rename a file." }
    };

    public static void setCommand() {
        String input = scanner.nextLine().trim();
        String[] splitInput = input.split(" ");
        String command = splitInput[0];

        switch (command) {
            case "help":
                Commands.printHelp();
                break;

            case "cd":
                if (splitInput.length > 1) {
                    Commands.setPath(splitInput[1]);
                } else {
                    System.out.println("Usage: cd [path]");
                }
                break;

            case "kla":
                if (splitInput.length > 1) {
                    Commands.createFolder(splitInput[1]);
                } else {
                    System.out.println("Usage: kla [folderName]");
                }
                break;

            case "dos":
                if (splitInput.length > 1) {
                    Commands.createFile(splitInput[1]);
                } else {
                    System.out.println("Usage: dos [fileName]");
                }
                break;

            case "rename":
                if (splitInput.length > 2) {
                    Commands.renameFile(splitInput[1], splitInput[2]);
                } else {
                    System.out.println("Usage: rename [newname] [oldname]");
                }
                break;

            default:
                System.out.println("Unknown command. Please enter a correct command.");
                break;
        }
    }
}
