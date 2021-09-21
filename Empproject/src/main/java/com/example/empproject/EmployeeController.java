package com.example.empproject;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return EmployeeServiceStub.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeDetails(@PathVariable Long employeeId){
        return EmployeeServiceStub.getEmployeeDetails(employeeId);
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return EmployeeServiceStub.addEmployee(employee);
    }

    @PutMapping("/updateEmployee/{employeeId}")
    public Employee updateEmployee(@PathVariable Long employeeId, @RequestBody Employee employee){
        return EmployeeServiceStub.updateEmployee(employeeId,employee);
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    public Employee deleteEmployee(@PathVariable Long employeeId){
        return EmployeeServiceStub.deleteEmployee(employeeId);
    }
}
