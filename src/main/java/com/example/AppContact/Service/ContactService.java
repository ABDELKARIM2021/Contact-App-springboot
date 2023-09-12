package com.example.AppContact.Service;

import com.example.AppContact.DAO.ContactDAO;
import com.example.AppContact.module.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private ContactDAO contactDAO;
    public ContactService(ContactDAO contactDAO){
        this.contactDAO=contactDAO;
    }
    public List<Contact> getAll(){
       return contactDAO.findAll();
    }
    public Contact save(Contact contact){
        return contactDAO.save(contact);
    }

    public void delete(Integer id){
        contactDAO.deleteById(id);
    }

    public Contact update(Contact contact){
     Optional<Contact> contact1=contactDAO.findById(contact.getId());
     if (contact1.isPresent()) {
         return contactDAO.save(contact);
     }
     else {
         throw new RuntimeException("contact Not found");
     }
    }

    public Contact findById(Integer id){
        Contact contact1=contactDAO.findById(id).orElseThrow(() -> new RuntimeException("Contact Not Found"));
        return contact1;
    }


    public Contact findByNom(String nom){
        Contact contact =contactDAO.findByNom(nom);
        return contact;
    }


}
