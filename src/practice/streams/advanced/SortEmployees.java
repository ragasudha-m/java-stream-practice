package practice.streams.advanced;

import practice.streams.model.Employee;
import practice.streams.model.EmployeeListFactory;

import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeListFactory.createEmployeeList();
        employees = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();

        System.out.println(employees);

    }
}
