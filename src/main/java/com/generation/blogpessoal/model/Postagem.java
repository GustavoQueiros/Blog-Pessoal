package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


//modelar os atributos e tabela postagens no banco de dados
@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id // Torna esse atributo uma chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 5, max = 100, message = "O título deve ter no minimo 5 caracteres e no maximo 100") // Essa anotação
																									// valida oo
																									// atributo tendo um
																									// valor maximo e
																									// minimo de
																									// caracteres
	@NotBlank(message = "Atributo titulo é obrigatório") //
	private String titulo;

	@Size(min = 10, max = 1000, message = "O texto deve ter no minimo 10 caracteres e no maximo 1000") // Essa anotação
																										// valida oo
																										// atributo
																										// tendo um
																										// valor maximo
																										// e minimo de
																										// caracteres
	@NotBlank(message = "Atributo texto é obrigatório") //
	private String texto;

	@UpdateTimestamp // Pega a data do sistema da maquina, quando faz o registro
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
