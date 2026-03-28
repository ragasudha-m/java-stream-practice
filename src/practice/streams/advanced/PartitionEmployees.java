package practice.streams.advanced;

import practice.streams.model.Employee;
import practice.streams.model.EmployeeListFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Partition employees by salary > 50K
 *
 */
public class PartitionEmployees {
    public static void main(String[] args) {
        //This is a PARTITIONING problem, not GROUPING
        //PartitioningBy takes a predicate and returns a Map<Boolean, List<T>> -> used when exactly two groups are expected
        List<Employee> employees = EmployeeListFactory.createEmployeeList();
        Map<Boolean, List<Employee>> map = employees.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));

        System.out.println("Employees earning more than 50K: "+map.get(true));
        System.out.println("Employees earning less than 50K: " +map.get(false));

    }
}
