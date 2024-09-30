package com.sesi.gereciador_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.gereciador_tarefas.model.TarefaCategoria;

public interface TarefaCategoriaRepository extends JpaRepository<TarefaCategoria, Integer> {

}
