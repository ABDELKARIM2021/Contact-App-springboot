package com.example.AppContact.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String nom;

    private String prenom;
    private String telephone;
    private String image;
}
