package H2Database.H2DB.controller;

import H2Database.H2DB.model.Employee;
import H2Database.H2DB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;
    @PostMapping("save")
    public String saveEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return "Saved";
    }
    @GetMapping("getall")
    public List<Employee> getAll(){
        return repository.findAll();
    }
}
