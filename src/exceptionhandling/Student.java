package exceptionhandling;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name");
                String name = sc.nextLine();

                int total = 0;

                for (int j = 1; j <= 3; j++) {

                    System.out.println("Enter mark " + j);

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0)
                        throw new NegativeValuesException("Negative Marks are not allowed");

                    if (mark > 100)
                        throw new ValuesOutOfRangeException("Marks should be between 0 and 100");

                    total += mark;
                }

                System.out.println(name + " Average = " + (total / 3.0));
            }

        } catch (NegativeValuesException e) {
            System.out.println(e.getMessage());
        } catch (ValuesOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        sc.close();
    }
}