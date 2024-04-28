package org.boot.rest;

import org.boot.dao.CustomerDao;
import org.boot.dao.NewCustomerDao;
import org.boot.entities.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {
//    @Autowired
//    CustomerDao customerDao;

    @Autowired
    NewCustomerDao newCustomerDao;
    @GetMapping
    public List<Data> getCustomers() {
        return newCustomerDao.findAll();
    }

    @GetMapping("/{id}")
    public Data getCustomerById(@PathVariable int id) {
        return newCustomerDao.findById(id).get();
    }

    @PostMapping
    public Data createCustomer(@RequestBody Data data) {
        return newCustomerDao.save(data);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        newCustomerDao.deleteById(id);
    }

    @PutMapping
    public Data updateCustomer(@RequestBody Data data) {
        return newCustomerDao.save(data);
    }
}
