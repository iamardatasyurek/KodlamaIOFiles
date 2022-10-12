package ExceptionHandling.ReadingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        int total = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(
                    "D:\\Codes\\KodlamaIOFiles\\Files\\JavaPrograming1_BTK_13to24\\ExceptionHandling\\ReadingFileDemo\\numbers.txt"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total : " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
