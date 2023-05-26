package H2Database.H2DB.service;

import H2Database.H2DB.model.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
}
