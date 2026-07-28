package wrapperclasses;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 255): ");
        int number = sc.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid Input");
        } else {
            String binary = Integer.toBinaryString(number);
            String result = String.format("%8s", binary).replace(' ', '0');

            System.out.println("Binary Representation: " + result);
        }

        sc.close();
    }
}