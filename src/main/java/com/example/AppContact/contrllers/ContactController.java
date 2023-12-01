package com.example.AppContact.contrllers;

import com.example.AppContact.Service.ContactService;
import com.example.AppContact.module.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")

public class ContactController {

    @Autowired
    private ContactService contactService;


    @GetMapping("/all")
    public List<Contact> getAll(){
        return contactService.getAll();
    }

    @PostMapping("/add")
    public Contact save(@RequestBody Contact contact){
       return contactService.save(contact);
    }

    @PutMapping("/update")
    public  Contact update(@RequestBody Contact contact){
        return contactService.update(contact);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        contactService.delete(id);
    }


    @GetMapping("/{id}")
    public Optional<Contact> findById(@PathVariable Integer id){
        return contactService.findById(id);

    }

    @GetMapping("/nom/{nom}")
    public  Contact findByNom(@PathVariable String nom){
        
        return contactService.findByNom(nom);
    }
}
