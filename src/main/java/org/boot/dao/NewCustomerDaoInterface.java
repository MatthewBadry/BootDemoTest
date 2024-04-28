package org.boot.dao;

import org.boot.entities.Data;

import java.util.List;

public interface NewCustomerDaoInterface{
    Data getCustomerById(int id);
    List<Data> getAllCustomers();
    void createCustomer(Data course);
    void updateCustomer(Data course);
    void deleteCustomer(int id);
}