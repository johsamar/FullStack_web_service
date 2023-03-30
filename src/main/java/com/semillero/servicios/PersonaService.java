package com.semillero.servicios;

import java.util.List;
import java.util.Map;

import com.semillero.entidades.Persona;
import com.semillero.repositorios.PersonaRepository;
import com.semillero.repositorios.Repositorio;

public class PersonaService {
    private Repositorio repositorioPersona;

    public PersonaService() {
        repositorioPersona = new PersonaRepository();
    }

    public void guardarPersona(Map datos) {
        String nombre = (String) datos.get("nombre");
        String apellido = (String) datos.get("apellido");
        int edad = (int) datos.get("edad");
        String identificacion = (String) datos.get("identificacion");
        String celular = (String) datos.get("celular");

        Persona newPerson = new Persona(nombre, apellido, edad, identificacion, celular);
        repositorioPersona.guardar(newPerson);
    }

    public List<Persona> listarPersonas() {
        return (List<Persona>) repositorioPersona.listar();
    }

    public Persona buscarPersona(String identificador) throws Exception {
        Object persona = repositorioPersona.buscar(identificador);
        if (persona == null) {
            throw new Exception("No se encontro la persona");
        }
        return (Persona) persona;
    }

    public void eliminarPersona(String identificador) {
        repositorioPersona.eliminar(identificador);
    }

    public void actualizarPersona(Map datos) {
        String nombre = (String) datos.get("nombre");
        String apellido = (String) datos.get("apellido");
        int edad = (int) datos.get("edad");
        String identificacion = (String) datos.get("identificacion");
        String celular = (String) datos.get("celular");

        Persona newPerson = new Persona(nombre, apellido, edad, identificacion, celular);
        repositorioPersona.actualizar(newPerson);
    }

    public void actualizarPersonaId(Map datos, String id) {
        String nombre = (String) datos.get("nombre");
        String apellido = (String) datos.get("apellido");
        int edad = (int) datos.get("edad");
        String identificacion = (String) datos.get("identificacion");
        String celular = (String) datos.get("celular");

        Persona newPerson = new Persona(nombre, apellido, edad, identificacion, celular);
        repositorioPersona.actualizarId(newPerson, id);
    }
}
