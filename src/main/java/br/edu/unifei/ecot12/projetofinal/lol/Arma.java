package br.edu.unifei.ecot12.projetofinal.lol;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Arma implements Serializable {
	private static final long serialVersionUID = 6488815789146743380L;
	@Id
	private String nome;
	private int dano;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Atirador dono;
}
