package com.example.hateoas;

import org.springframework.hateoas.RepresentationModel;

class Patient extends RepresentationModel<Patient> {

    private int id;
    private String name;
}
