package FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // createFile();
        // getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    static void createFile() {
        File file = new File(
                "D:\\Codes\\KodlamaIOFiles\\Files\\JavaPrograming1_BTK_13to24\\FileOperations\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File is already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void getFileInfo() {
        File file = new File(
                "D:\\Codes\\KodlamaIOFiles\\Files\\JavaPrograming1_BTK_13to24\\FileOperations\\students.txt");
        if (file.exists()) {
            System.out.println("File name : " + file.getName());
            System.out.println("File path : " + file.getAbsolutePath());
            System.out.println("Is the file writable? : " + file.canWrite());
            System.out.println("Is the file readable? : " + file.canRead());
            System.out.println("File size (byte) : " + file.length());
        }
    }

    static void readFile() {
        File file = new File(
                "D:\\Codes\\KodlamaIOFiles\\Files\\JavaPrograming1_BTK_13to24\\FileOperations\\students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void writeFile() {
        try {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                    "D:\\Codes\\KodlamaIOFiles\\Files\\JavaPrograming1_BTK_13to24\\FileOperations\\students.txt"))) {
                bufferedWriter.newLine();
                bufferedWriter.write("John Abruzzi");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
