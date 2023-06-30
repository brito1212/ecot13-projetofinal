package br.edu.unifei.ecot12.projetofinal.lol;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Lutador extends Campeao {
	private static final long serialVersionUID = 6488815789146743380L;
	private int ataqueFisico;
	private int defesa;
}
