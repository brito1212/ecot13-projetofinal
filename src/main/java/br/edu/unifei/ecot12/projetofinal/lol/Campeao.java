package br.edu.unifei.ecot12.projetofinal.lol;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Campeao implements Serializable {
	private static final long serialVersionUID = 6488815789146743380L;
	@Id
	private String nome;
	private int vida;
	private int mana;
	private boolean morto;
	@ManyToOne
	private Ser especie;
}
