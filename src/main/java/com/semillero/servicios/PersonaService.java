package com.semillero.servicios;

import java.util.List;

import com.semillero.entidades.Persona;
import com.semillero.repositorios.PersonaRepository;
import com.semillero.repositorios.Repositorio;

public class PersonaService {
    private Repositorio repositorioPersona;

    public PersonaService() {
        repositorioPersona = new PersonaRepository();
    }

    public void guardarPersona(Persona newPerson) {
        repositorioPersona.guardar(newPerson);
    }

    public List<Persona> listarPersonas() {
        return (List<Persona>) repositorioPersona.listar();
    }

    public Persona buscarPersona(String identificador) throws Exception {
        Object persona = repositorioPersona.buscar(identificador);
        if(persona == null) {
            throw new Exception("No se encontro la persona");
        }
        return (Persona) persona;
    }

    public void eliminarPersona(String identificador) {
        repositorioPersona.eliminar(identificador);
    }
}
