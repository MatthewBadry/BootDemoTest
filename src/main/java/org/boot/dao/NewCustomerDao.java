package org.boot.dao;

import org.boot.entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewCustomerDao extends JpaRepository<Data,Integer> {

}
