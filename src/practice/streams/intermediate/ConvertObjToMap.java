package practice.streams.intermediate;

import practice.streams.model.Employee;
import practice.streams.model.EmployeeListFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertObjToMap {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeListFactory.createEmployeeList();

        //Collectors.toMap() requires a merge function when keys can repeat.
        Map<Integer, String> empMap = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName, (existing, replacement) -> existing));

        empMap.forEach((k,v)->System.out.println("Id: "+k+", Name: "+v));

    }
}
