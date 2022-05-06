package com.student.Controller;

import com.student.model.DataObj;
import com.student.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/getData")
    public List<DataObj> getDetails(){
        return service.getData();
    }

    @PostMapping("/postData")
    public DataObj postData(@RequestBody DataObj obj1){
        return service.postData(obj1);
    }

    @PutMapping("/putData")
    public DataObj putData(@RequestBody DataObj obj2){
        return service.update(obj2);
    }

    @DeleteMapping("/deleteData")
    public void deleteData(@RequestParam int id){
        service.deleteData(id);
    }
}
