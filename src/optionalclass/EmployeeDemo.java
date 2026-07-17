package optionalclass;

import java.util.Optional;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = null;

        Employee employee = Optional.ofNullable(emp)
                .orElseThrow(() ->
                        new InvalidEmployeeException("Employee is null"));

        System.out.println(employee);
    }
}