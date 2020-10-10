package com.casespringboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casespringboot.entities.Topico;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	
	public List<Topico> findByTituloContainingIgnoreCase(String titulo);
	
	
	 

}
