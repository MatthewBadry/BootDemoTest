package org.boot.dao;

import org.boot.entities.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewCustomerDaoInterfaceImpl implements NewCustomerDaoInterface{

    @Autowired
    private NewCustomerDao newCustomerDao;

    @Override
    public Data getCustomerById(int id) {
        newCustomerDao.getById(id);
        return null;
    }

    @Override
    public List<Data> getAllCustomers() {
        return newCustomerDao.findAll();
    }

    @Override
    public void createCustomer(Data course) {

    }

    @Override
    public void updateCustomer(Data course) {

    }

    @Override
    public void deleteCustomer(int id) {

    }
}
