package Crud.management.Employee.Service;

import Crud.management.Employee.Entity.Employee;
import Crud.management.Employee.Repository.EmployeeRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        if (employeeDetails.getName() != null) employee.setName(employeeDetails.getName());
        if (employeeDetails.getEmail() != null) employee.setEmail(employeeDetails.getEmail());
        if (employeeDetails.getDepartment() != null) employee.setDepartment(employeeDetails.getDepartment());

        return employeeRepository.save(employee);

}
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

}
