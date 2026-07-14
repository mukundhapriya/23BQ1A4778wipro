package flowcontrol;

public class InterestCalculator {
    public static void main(String[] args) {

        String gender = "Female";
        int age = 25;

        if (gender.equals("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Percentage of Interest = 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Percentage of Interest = 9.2%");
            }
        } else if (gender.equals("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Percentage of Interest = 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Percentage of Interest = 10.5%");
            }
        }
    }
}