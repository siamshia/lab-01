package com.example.petshop;

import java.util.Date;

public class Pet {

    // Step 3: fields
    private String name;
    private Date birthDate;

    // Step 4: constructor 1
    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    // Step 4: constructor 2
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
