package com.example.AppContact.DAO;

import com.example.AppContact.module.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDAO extends JpaRepository<Contact,Integer> {
    public Contact findByNom(String nom);
}
