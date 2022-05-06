package com.student.service;

import com.student.model.DataObj;
import com.student.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;
    public List<DataObj> getData(){
        return repo.findAll();
}

public DataObj postData(DataObj data){
        repo.save(data);
        return data;
}

public DataObj update(DataObj obj){
        repo.saveAndFlush(obj);
        return obj;
}

public void deleteData(int id){
        repo.deleteById(id);
}
}