package br.edu.unifei.ecot13.projetofinal.lol.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.edu.unifei.ecot12.projetofinal.lol.Arma;
import br.edu.unifei.ecot12.projetofinal.lol.Aspecto;
import br.edu.unifei.ecot12.projetofinal.lol.Atirador;
import br.edu.unifei.ecot12.projetofinal.lol.Campeao;
import br.edu.unifei.ecot12.projetofinal.lol.Darkin;
import br.edu.unifei.ecot12.projetofinal.lol.Hibrido;
import br.edu.unifei.ecot12.projetofinal.lol.Humano;
import br.edu.unifei.ecot12.projetofinal.lol.Ser;
import br.edu.unifei.ecot12.projetofinal.lol.Vastaya;
import br.edu.unifei.ecot12.projetofinal.lol.Yordle;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AtiradorInsere extends JFrame {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("lolPU");
	private EntityManager em = emf.createEntityManager();

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCarac;
	private JTextField txtEscolha;
	

	private JTextField txtArma;
	private Atirador atirador;
	private Arma arma;
	private Ser especie;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtiradorInsere frame = new AtiradorInsere();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AtiradorInsere() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setBounds(10, 36, 46, 14);
		contentPane.add(lblVida);
		
		JLabel lblMana = new JLabel("Mana:");
		lblMana.setBounds(10, 61, 46, 14);
		contentPane.add(lblMana);
		
		JLabel lblAlcance = new JLabel("Alcance:");
		lblAlcance.setBounds(10, 121, 46, 14);
		contentPane.add(lblAlcance);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(261, 11, 66, 14);
		contentPane.add(lblEspecie);
		
		txtNome = new JTextField();
		txtNome.setBounds(58, 8, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		final JSpinner spnVida = new JSpinner();
		spnVida.setBounds(58, 33, 86, 20);
		contentPane.add(spnVida);
		
		final JSpinner spnMana = new JSpinner();
		spnMana.setBounds(58, 58, 86, 20);
		contentPane.add(spnMana);
		
		final JCheckBox chkMorto = new JCheckBox("Está Morto");
		chkMorto.setBounds(58, 92, 97, 23);
		contentPane.add(chkMorto);
		
		JLabel lblMorto = new JLabel("Morto:");
		lblMorto.setBounds(10, 96, 46, 14);
		contentPane.add(lblMorto);
		
		final JSpinner spnAlcance = new JSpinner();
		spnAlcance.setBounds(58, 118, 86, 20);
		contentPane.add(spnAlcance);
		
		
		
		final JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setBounds(261, 177, 86, 14);
		lblEspecialidade.setVisible(false);	
		contentPane.add(lblEspecialidade);
		
		
		final JLabel lblCarac = new JLabel("Caracteristica:");
		lblCarac.setBounds(261, 121, 86, 14);
		lblCarac.setVisible(false);
		contentPane.add(lblCarac);
		
		txtCarac = new JTextField();
		txtCarac.setBounds(261, 146, 112, 20);
		txtCarac.setVisible(false);
		contentPane.add(txtCarac);
		txtCarac.setColumns(10);
		
		txtEscolha = new JTextField();
		txtEscolha.setBounds(261, 202, 112, 20);
		txtEscolha.setVisible(false);
		contentPane.add(txtEscolha);
		txtEscolha.setColumns(10);
		
		final JLabel lblDivindade = new JLabel("Divindade:");
		lblDivindade.setBounds(261, 177, 112, 14);
		lblDivindade.setVisible(false);
		contentPane.add(lblDivindade);
		
		final JLabel lblEnergia = new JLabel("Energia:");
		lblEnergia.setBounds(261, 177, 112, 14);
		lblEnergia.setVisible(false);
		contentPane.add(lblEnergia);
		
		final JLabel lblAnimal = new JLabel("Animal:");
		lblAnimal.setBounds(261, 177, 112, 14);
		lblAnimal.setVisible(false);
		contentPane.add(lblAnimal);
		
		final JLabel lblHospedeiro = new JLabel("Hospedeiro:");
		lblHospedeiro.setBounds(261, 177, 112, 14);
		lblHospedeiro.setVisible(false);
		contentPane.add(lblHospedeiro);
		
		final JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setBounds(261, 177, 112, 14);
		lblIdioma.setVisible(false);
		contentPane.add(lblIdioma);
		
		final JList listEspecie = new JList();
		listEspecie.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listEspecie.setModel(new AbstractListModel() {
			String[] values = new String[] {"Vastaya", "Hibrido", "Yordle", "Darkin", "Humano", "Aspecto"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listEspecie.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting() && listEspecie.getSelectedValue() != null) {
                    String selectedValue = listEspecie.getSelectedValue().toString();
                    if (selectedValue.equals("Vastaya")) {
                    	lblCarac.setVisible(true);
                    	txtCarac.setVisible(true);
                    	
                    	lblAnimal.setVisible(true);
                    	txtEscolha.setVisible(true);
                    	
                    	lblEspecialidade.setVisible(false);
                    	lblDivindade.setVisible(false);
                    	lblEnergia.setVisible(false);
                    	lblHospedeiro.setVisible(false);
                    	lblIdioma.setVisible(false);
                    	
                    	
                    } 
                    else if (selectedValue.equals("Hibrido")){
                    	lblCarac.setVisible(true);
                    	txtCarac.setVisible(true);
                    	
                    	lblEnergia.setVisible(true);
                    	txtEscolha.setVisible(true);
                    	
                    	lblEspecialidade.setVisible(false);
                    	lblDivindade.setVisible(false);
                    	lblAnimal.setVisible(false);
                    	lblHospedeiro.setVisible(false);
                    	lblIdioma.setVisible(false);
                    	
                    	
                    }
                    else if (selectedValue.equals("Yordle")) {
                    	lblCarac.setVisible(true);
                    	txtCarac.setVisible(true);
                    	
                    	lblEspecialidade.setVisible(true);
                    	txtEscolha.setVisible(true);
                    	
                    	lblEnergia.setVisible(false);
                    	lblDivindade.setVisible(false);
                    	lblAnimal.setVisible(false);
                    	lblHospedeiro.setVisible(false);
                    	lblIdioma.setVisible(false);
                    	
                    	
                    }
                    else if (selectedValue.equals("Darkin")) {
                    	lblCarac.setVisible(true);
                    	txtCarac.setVisible(true);
                    	
                    	lblHospedeiro.setVisible(true);
                    	txtEscolha.setVisible(true);
                    	
                    	lblEnergia.setVisible(false);
                    	lblDivindade.setVisible(false);
                    	lblAnimal.setVisible(false);
                    	lblEspecialidade.setVisible(false);
                    	lblIdioma.setVisible(false);
                    	
                    	
                    }
                    else if (selectedValue.equals("Humano")) {
                    	lblCarac.setVisible(true);
                    	txtCarac.setVisible(true);
                    	
                    	lblIdioma.setVisible(true);
                    	txtEscolha.setVisible(true);
                    	
                    	lblEnergia.setVisible(false);
                    	lblDivindade.setVisible(false);
                    	lblAnimal.setVisible(false);
                    	lblEspecialidade.setVisible(false);
                    	lblHospedeiro.setVisible(false);
                    	
                    	
                    }
                    else if (selectedValue.equals("Aspecto")) {
                    	lblCarac.setVisible(true);
                    	txtCarac.setVisible(true);
                    	
                    	lblDivindade.setVisible(true);
                    	txtEscolha.setVisible(true);
                    	
                    	lblEnergia.setVisible(false);
                    	lblIdioma.setVisible(false);
                    	lblAnimal.setVisible(false);
                    	lblEspecialidade.setVisible(false);
                    	lblHospedeiro.setVisible(false);
                    	
                
                    }
                }

			}
		});
		listEspecie.setBounds(337, 10, 61, 105);
		contentPane.add(listEspecie);
		
		JLabel lblArma = new JLabel("Arma:");
		lblArma.setBounds(10, 161, 46, 14);
		contentPane.add(lblArma);
		
		txtArma = new JTextField();
		txtArma.setBounds(58, 158, 86, 20);
		contentPane.add(txtArma);
		txtArma.setColumns(10);
		
		JLabel lblDano = new JLabel("Dano:");
		lblDano.setBounds(10, 192, 46, 14);
		contentPane.add(lblDano);
		
		final JSpinner spnDano = new JSpinner();
		spnDano.setBounds(58, 189, 86, 20);
		contentPane.add(spnDano);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atirador = new Atirador();
				atirador.setNome(txtNome.getText());
				atirador.setVida((Integer)spnVida.getValue());
				atirador.setMana((Integer)spnMana.getValue());
				atirador.setMorto(chkMorto.isSelected());
				atirador.setAlcance((Integer)spnAlcance.getValue());
				arma = new Arma();
				arma.setNome(txtArma.getText());
				arma.setDono(atirador);
				arma.setDano((Integer)spnDano.getValue());
				atirador.setArma(arma);
				String selectedValue = listEspecie.getSelectedValue().toString();
				if (selectedValue.equals("Vastaya")) {
                	Vastaya especie = new Vastaya();
                	especie.setCaracteristica(txtCarac.getText());
                	especie.setAnimal(txtEscolha.getText());
                	List<Campeao> campeoes = especie.getCampeoes();
                	campeoes.add(atirador);
                	especie.setCampeoes(campeoes);
                	atirador.setEspecie(especie);
                	AtiradorInsere.this.especie = especie;
                }
				else if (selectedValue.equals("Hibrido")) {
                	Hibrido especie = new Hibrido();
                	especie.setCaracteristica(txtCarac.getText());
                	especie.setElemento(txtEscolha.getName());
                	List<Campeao> campeoes = especie.getCampeoes();
                	campeoes.add(atirador);
                	especie.setCampeoes(campeoes);
                	atirador.setEspecie(especie);
                	AtiradorInsere.this.especie = especie;
                }
				else if (selectedValue.equals("Yordle")) {
                	Yordle especie = new Yordle();
                	especie.setCaracteristica(txtCarac.getText());
                	especie.setEspecialidade(txtEscolha.getText());
                	List<Campeao> campeoes = especie.getCampeoes();
                	campeoes.add(atirador);
                	especie.setCampeoes(campeoes);
                	atirador.setEspecie(especie);
                	AtiradorInsere.this.especie = especie;
                }
				else if (selectedValue.equals("Darkin")) {
                	Darkin especie = new Darkin();
                	especie.setCaracteristica(txtCarac.getText());
                	especie.setHospedeiro(txtEscolha.getText());
                	List<Campeao> campeoes = especie.getCampeoes();
                	campeoes.add(atirador);
                	especie.setCampeoes(campeoes);
                	atirador.setEspecie(especie);
                	AtiradorInsere.this.especie = especie;
                }
				else if (selectedValue.equals("Humano")) {
					Humano especie = new Humano();
                	especie.setCaracteristica(txtCarac.getText());
                	especie.setIdioma(txtEscolha.getText());
                	List<Campeao> campeoes = especie.getCampeoes();
                	campeoes.add(atirador);
                	especie.setCampeoes(campeoes);
                	atirador.setEspecie(especie);
                	AtiradorInsere.this.especie = especie;
                }
				else if (selectedValue.equals("Aspecto")) {
					Aspecto especie = new Aspecto();
                	especie.setCaracteristica(txtCarac.getText());
                	especie.setDivindade(txtEscolha.getText());
                	List<Campeao> campeoes = especie.getCampeoes();
                	campeoes.add(atirador);
                	especie.setCampeoes(campeoes);
                	atirador.setEspecie(especie);
                	AtiradorInsere.this.especie = especie;
                }
				
				em.getTransaction().begin();
				em.persist(especie);
				em.persist(arma);
				em.persist(atirador);
				em.getTransaction().commit();
			}
		});
		btnInserir.setBounds(31, 253, 89, 23);
		contentPane.add(btnInserir);
		
		
	}
}
