package org.boot.dao;

import jakarta.persistence.EntityManager;
import org.boot.entities.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerDao {
    @Autowired
    private EntityManager em;

    @Transactional
    public Data getCustomerById(int id) {
        return em.find(Data.class, id);
    }
}
