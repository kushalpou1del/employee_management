package Crud.management.Employee.Repository;

import Crud.management.Employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
