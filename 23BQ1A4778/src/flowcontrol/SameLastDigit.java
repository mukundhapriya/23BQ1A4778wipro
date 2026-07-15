package flowcontrol;

public class SameLastDigit {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if (num1 % 10 == num2 % 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}