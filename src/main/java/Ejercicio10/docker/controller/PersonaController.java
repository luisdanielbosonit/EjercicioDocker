package Ejercicio10.docker.controller;


import Ejercicio10.docker.dTOS.PersonaINputDto;
import Ejercicio10.docker.dTOS.PersonaOUTputDto;
import Ejercicio10.docker.service.ServicePersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    ServicePersona servicepersona;


    @PostMapping("/post")
    public PersonaOUTputDto guardarpersona(@RequestBody PersonaINputDto personaINputDto) throws Exception {
        return servicepersona.loadpersona(personaINputDto);
    }

    @GetMapping("get/{id}")
    public PersonaOUTputDto show(@PathVariable Integer id) throws Exception {

        return servicepersona.viewId(id);

    }
    @GetMapping("/view/{name}")
    public List<PersonaOUTputDto> getPersonByUsername(@PathVariable String name) throws Exception {
        return servicepersona.viewPerson(name);
    }


    @PutMapping("/put/{id}")
    public PersonaOUTputDto modificarpersona(@PathVariable Integer id,@RequestBody PersonaINputDto personaINputDto) throws Exception{

        return servicepersona.update(id,personaINputDto);
    }
    @DeleteMapping("/delete/{id}")
    public void deletepersona(@PathVariable Integer id) throws Exception {
        servicepersona.delete(id);
    }

    @GetMapping("/todos")
    public List<PersonaOUTputDto> viewall(){
        return (List<PersonaOUTputDto>) servicepersona.viewall();
    }


}

