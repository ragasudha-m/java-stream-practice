package practice.streams.model;

import java.util.List;
public class EmployeeListFactory {

    public static List<Employee> createEmployeeList() {
        Employee e1 = new Employee(1, "Alice", 50000, "IT");
        Employee e2 = new Employee(2, "Bob", 60000, "HR");
        Employee e3 = new Employee(3, "John", 20000, "Cleaning");
        Employee e4 = new Employee(4, "Jose", 70000, "IT");
        Employee e5 = new Employee(5, "Krista", 45000, "HR");

        return List.of(e1, e2, e3, e4, e5);
    }
}
