package com.semillero.repositorios;

import java.util.List;

public interface Repositorio {
    
    public void guardar(Object objeto);

    public void eliminar(String identificador);

    public void actualizar(Object objeto);

    public Object buscar(String identificador);

    public List<?> listar();

    public void actualizarId(Object objeto, String id);
}

