package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;
//JPA da o poder da a repository o poder de se comunicar com o Banco de dados

@Repository
public interface PostagemRepository  extends JpaRepository <Postagem, Long>{

	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	

}

