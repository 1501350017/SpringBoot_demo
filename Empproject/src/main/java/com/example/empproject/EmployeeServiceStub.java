package com.example.empproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceStub {
    private static Map<Long, Employee> employees = new HashMap<>();
    private static long index= 2L;

    static{
        Employee employee1 = new Employee(1L,"emp1","9999999999",200000L);
        Employee employee2 = new Employee(2L,"emp2","8888888888",300000L);
        employees.put(1L,employee1);
        employees.put(2L,employee2);
    }
    public static List<Employee> getAllEmployees(){
        return new ArrayList<>(employees.values());
    }
    public static Employee getEmployeeDetails(Long empoyeeId){
        return employees.get(empoyeeId);
    }
    public static Employee addEmployee(Employee employee){
        index += 1;
        employee.setId(index);
        employees.put(index,employee);
        return employee;
    }
    public static Employee updateEmployee(Long employeeId, Employee employee){
        employee.setId(employeeId);
        employees.put(employeeId,employee);
        return employee;
    }
    public static Employee deleteEmployee(Long employeeId){
        return employees.remove(employeeId);
    }
}
