package in.itkaran.lld1130624.lld1class13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //demoFileException();
        //demoDivideByZeroException(new Scanner(System.in));
        demoTryCatch();
    }

    private static void demoDivideByZeroException(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //int b = Integer.parseInt(String.valueOf(scanner.nextInt()));
        System.out.println(a/b);
    }

    private static void demoFileException() throws IOException {
        System.out.println("Hello");
        File file = new File("file1.txt");
        System.out.println("World");
        FileReader fileReader = new FileReader(file);
        System.out.println("Hi");
        fileReader.read();
        System.out.println("Bye");
    }

    private static void demoTryCatch() {
        try {
            System.out.println("Hello");
            //System.exit(1);
            //if (true == true) return ;
            //File file = new File("/Users/apple/IdeaProjects/lld1-130624/src/main/java/in/itkaran/lld1130624/lld1class13/exceptions/Client.java");
            File file = new File("file1.txt");
            System.out.println("World");
            FileReader fileReader = new FileReader(file);
            System.out.println("Hi");
            fileReader.read();
            System.out.println("Bye");

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            //int b = Integer.parseInt(String.valueOf(scanner.nextInt()));
            System.out.println(a/b);
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Parent Exception " + e.getMessage());
        }
        finally {
            System.out.println("Finally Block");
        }

        System.out.println("After try, catch and finally");

    }
}
