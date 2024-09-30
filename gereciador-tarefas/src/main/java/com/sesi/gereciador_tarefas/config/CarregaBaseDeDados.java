package com.sesi.gereciador_tarefas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sesi.gereciador_tarefas.model.TarefaCategoria;
import com.sesi.gereciador_tarefas.repository.TarefaCategoriaRepository;

@Configuration
public class CarregaBaseDeDados {
	
	@Autowired
	private TarefaCategoriaRepository tarefaCategoriaRepository;
	
	@Bean
	CommandLineRunner executar() {
		
		return args ->{
			TarefaCategoria categoria = new TarefaCategoria();	
			categoria.setNome("Estudos");
			
			tarefaCategoriaRepository.save(categoria);
			
			TarefaCategoria categorial = new TarefaCategoria();	
			categorial.setNome("Pesquisa");
			tarefaCategoriaRepository.save(categorial);
		};
		
	}
;
	
}
