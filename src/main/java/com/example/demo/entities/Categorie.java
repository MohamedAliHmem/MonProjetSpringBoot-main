package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	
	private String nomC ;
	
	@OneToMany(mappedBy = "categorie")
	@JsonIgnore

	private List<Jeux> jeux;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomC() {
		return nomC;
	}

	public void setNomC(String nomC) {
		this.nomC = nomC;
	}

	public List<Jeux> getJeux() {
		return jeux;
	}

	public void setJeux(List<Jeux> jeux) {
		this.jeux = jeux;
	}

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(Long id, String nomC, List<Jeux> jeux) {
		super();
		this.id = id;
		this.nomC = nomC;
		this.jeux = jeux;
	}

	

	
	
	
	
	
	

}
