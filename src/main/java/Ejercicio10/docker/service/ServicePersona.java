package Ejercicio10.docker.service;

import Ejercicio10.docker.dTOS.PersonaINputDto;
import Ejercicio10.docker.dTOS.PersonaOUTputDto;

import java.util.List;

public interface ServicePersona {

    public PersonaOUTputDto viewId(Integer id) throws Exception; //ok

    public List<PersonaOUTputDto> viewPerson(String name) throws Exception ; //ok

    PersonaOUTputDto update(Integer id, PersonaINputDto personaINputDto) throws Exception;//ok

    public void delete(Integer id) throws Exception; //ok

    public List<PersonaOUTputDto> viewall();

    public PersonaOUTputDto loadpersona(PersonaINputDto personaINputDto)throws Exception; //ok
}
