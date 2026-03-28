package practice.streams.advanced;

import practice.streams.model.Employee;
import practice.streams.model.EmployeeListFactory;

import java.util.Comparator;
import java.util.List;

/**
 * Return top 3 distinct salaries.
 */
public class HighestSalaries {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeListFactory.createEmployeeList();

        List<Double> topSalaries = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(topSalaries);
    }
}
