package br.edu.unifei.ecot12.projetofinal.lol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public abstract class Ser implements Serializable{
	private static final long serialVersionUID = 6488815789146743380L;
	@Id
	protected String caracteristica;
	@OneToMany
	private List<Campeao> campeoes = new ArrayList<Campeao>();
}
