package in.itkaran.lld1130624.lld1class13.checkedanduncheckedexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            demoCheckedException();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        demoUncheckedException();
    }

    private static void demoUncheckedException() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // throw an exception if b is 0
        if (b == 0) {
            throw new RuntimeException("Please enter a non-zero number");
        }
    }

    private static void demoCheckedException() throws IOException {
        File file = new File("abc.txt");
        // Compile time error because the constructor throws FileNotFoundException
        FileReader fileReader = new FileReader(file);
        fileReader.read();
    }
}
