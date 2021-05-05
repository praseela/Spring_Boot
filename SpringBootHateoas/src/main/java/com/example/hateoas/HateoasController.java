package com.example.hateoas;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HateoasController {

    @GetMapping(value = "/{id}")
    public EntityModel<Patient> getPatientById(@PathVariable int id){

        Patient patient = patientService.getPatient(id);

        Link link = linkTo(methodOn(HateoasController.class).getPatientById(id)).withSelfRel();

        return new EntityModel<>(patient, link);
    }
}