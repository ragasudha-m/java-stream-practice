package practice.streams.intermediate;

import practice.streams.model.Employee;
import practice.streams.model.EmployeeListFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeListFactory.createEmployeeList();
        Map<String, List<Employee>> empByDept = employees.stream().collect(
                Collectors.groupingBy(emp -> emp.getDepartment()==null ? "UNKNOWN" : emp.getDepartment(), Collectors.toList())
        );
        System.out.println(empByDept);
    }
}
