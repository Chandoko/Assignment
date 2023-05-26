package H2Database.H2DB.controller;

import H2Database.H2DB.model.Employee;
import H2Database.H2DB.repository.EmployeeRepository;
import H2Database.H2DB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private  EmployeeRepository repository;
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("save")
    public String save(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "saved";
    }
    @GetMapping("getall")
    public List<Employee> getAll(){
        return repository.findAll();
    }
}
