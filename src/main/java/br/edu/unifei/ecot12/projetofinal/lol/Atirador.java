package br.edu.unifei.ecot12.projetofinal.lol;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Atirador extends Campeao{
	private static final long serialVersionUID = 1143465578028187572L;
	private int alcance;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Arma arma;
}
