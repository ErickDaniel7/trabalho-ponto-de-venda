package com.example.exemplobancodados.dao;

import java.util.ArrayList;

public interface GenericDao<Object> {


    /**
     * Inserir/atualizar/deletar (ESCRITA)
     * Retornar dados (LEITURA)
     * @param obj
     * @return
     */

    long insert(Object obj);
    long update(Object obj);
    long delete(Object obj);
    ArrayList<Object> getAll();
    Object getById(int id);

}
