package userInput;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println("Input received : "+inputStr);
    }
}
