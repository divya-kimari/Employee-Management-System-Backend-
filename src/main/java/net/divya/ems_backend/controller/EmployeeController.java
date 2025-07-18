package net.divya.ems_backend.controller;

import lombok.AllArgsConstructor;
import net.divya.ems_backend.dto.EmployeeDto;
import net.divya.ems_backend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
     private EmployeeService employeeService;

    //Building Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //Building Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto>getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    //Building GET ALL Employees REST API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>>getAllEmployees(){
        List<EmployeeDto> employees= employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    //Building UPDATE Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto>updateEmployee(@PathVariable("id") Long employeeId , @RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto= employeeService.updateEmployee(employeeId,updatedEmployee);
        return ResponseEntity.ok(employeeDto);
        }

    //Building UPDATE Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteEmployee(@PathVariable("id") Long employeeId){
       employeeService.deleteEmployee(employeeId);
       return ResponseEntity.ok("Employee deleted successfully");
    }
}
