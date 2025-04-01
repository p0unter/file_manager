package System;

import java.io.File;
import java.io.IOException;

public class Commands {
    public static void setPath(String path) {
        Process.currentPath = path.trim().replace("/", File.separator);
        System.out.println("Set path: " + Process.currentPath);
    }

    public static void printHelp() {
        UI.printCommands();
    }

    public static boolean createFolder(String folderName) {
        System.out.println("Creating folder...");

        File newDir = new File(Process.currentPath, folderName);

        if (newDir.mkdir()) {
            System.out.println("Folder created: " + folderName);
            return true;
        } else {
            System.out.println("- $ An error occurred: Folder may already exist or invalid path.");
            return false;
        }
    }

    public static void createFile(String fileName) {
        try {
            File file = new File(Process.currentPath, fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }
        } catch (IOException e) {
            System.err.println("File write error: " + e.getMessage());
        }
    }

    public static void renameFile(String newFileName, String oldFileName) {
        File oldFile = new File(Process.currentPath, oldFileName);
        File newFile = new File(Process.currentPath, newFileName);

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("Changed file name to: " + newFileName);
            } else {
                System.err.println("Error renaming file.");
            }
        } else {
            System.err.println("The old file does not exist: " + oldFileName);
        }
    }
}