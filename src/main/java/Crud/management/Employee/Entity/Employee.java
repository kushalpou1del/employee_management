package Crud.management.Employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data
public class Employee {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 private String name;
 private String position;
 private double salary;
 private String email;
 private String department;


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee(double salary, String position, String name, Long id, String email ,String department) {
        this.salary = salary;
        this.position = position;
        this.name = name;
        this.id = id;
        this.email = email;
        this.department=department;

    }
}

