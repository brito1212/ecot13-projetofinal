package br.edu.unifei.ecot12.projetofinal.lol;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("lolPU");
		EntityManager em = emf.createEntityManager();

		
		
		Atirador a1 = new Atirador();
		a1.setNome("Aphelios");
		a1.setVida(1800);
		a1.setMana(150);
		a1.setMorto(false);
		a1.setAlcance(150);
		
		Arma ar1 = new Arma();
		ar1.setNome("lunari");
		ar1.setDano(300);
		ar1.setDono(a1);
		
		Darkin e1 = new Darkin();
		e1.setCaracteristica("gracioso");
		e1.setHospedeiro("Alune");
		
		a1.setArma(ar1);
		a1.setEspecie(e1);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(ar1);
		em.persist(a1);
		em.getTransaction().commit();
		
		Atirador a = new Atirador();
		a.setNome("Ashe");
		a.setVida(2500);
		a.setMana(200);
		a.setMorto(false);
		a.setAlcance(150);
		
		Arma ar = new Arma();
		ar.setNome("arco e flecha");
		ar.setDano(230);
		ar.setDono(a);
		
		Humano e = new Humano();
		e.setCaracteristica("congelada");
		e.setIdioma("ingles");
		
		a.setArma(ar);
		a.setEspecie(e);
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(ar);
		em.persist(a);
		em.getTransaction().commit();
		
		Atirador a11 = new Atirador();
		a11.setNome("Ziggs");
		a11.setVida(2500);
		a11.setMana(200);
		a11.setMorto(false);
		a11.setAlcance(230);
		
		Arma ar11 = new Arma();
		ar11.setNome("bomba");
		ar11.setDano(100);
		ar11.setDono(a11);
		
		Hibrido e11 = new Hibrido();
		e11.setCaracteristica("alquimista");
		e11.setElemento("fogo");
		
		a11.setArma(ar11);
		a11.setEspecie(e11);
		
		em.getTransaction().begin();
		em.persist(e11);
		em.persist(ar11);
		em.persist(a11);
		em.getTransaction().commit();
		
		Atirador a111 = new Atirador();
		a111.setNome("Twitch");
		a111.setVida(2500);
		a111.setMana(200);
		a111.setMorto(false);
		a111.setAlcance(230);
		
		Arma ar111 = new Arma();
		ar111.setNome("besta");
		ar111.setDano(220);
		ar111.setDono(a111);
		
		Vastaya e111 = new Vastaya();
		e111.setCaracteristica("ladrao");
		e111.setAnimal("rato");
		
		a111.setArma(ar111);
		a111.setEspecie(e111);
		
		em.getTransaction().begin();
		em.persist(e111);
		em.persist(ar111);
		em.persist(a111);
		em.getTransaction().commit();
		
		
	}
	

}
