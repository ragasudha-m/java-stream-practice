package practice.streams.advanced;

import practice.streams.model.Employee;
import practice.streams.model.EmployeeListFactory;

import java.util.Comparator;
import java.util.List;

/**
 * Find highest paid employee in each department
 */
public class HighestPaidEmployee {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeListFactory.createEmployeeList();

        Employee emp = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println("Highest paid employee: "+ emp);
    }
}
