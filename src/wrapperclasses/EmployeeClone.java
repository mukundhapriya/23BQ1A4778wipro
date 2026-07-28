package wrapperclasses;

public class EmployeeClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1 = new Employee(101, "Mukundhapriya", 35000);

        Employee emp2 = (Employee) emp1.clone();

        // Change original employee details
        emp1.empName = "Priya";
        emp1.salary = 45000;

        System.out.println("Original Employee Details");
        emp1.display();

        System.out.println("Cloned Employee Details");
        emp2.display();

        System.out.println("Observation:");
        System.out.println("Changing the original object does not affect the cloned object.");
    }
}