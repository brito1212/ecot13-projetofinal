package br.edu.unifei.ecot13.projetofinal.lol.swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot12.projetofinal.lol.Arma;
import br.edu.unifei.ecot12.projetofinal.lol.Aspecto;
import br.edu.unifei.ecot12.projetofinal.lol.Atirador;
import br.edu.unifei.ecot12.projetofinal.lol.Darkin;
import br.edu.unifei.ecot12.projetofinal.lol.Hibrido;
import br.edu.unifei.ecot12.projetofinal.lol.Humano;
import br.edu.unifei.ecot12.projetofinal.lol.Ser;
import br.edu.unifei.ecot12.projetofinal.lol.Vastaya;
import br.edu.unifei.ecot12.projetofinal.lol.Yordle;

public class AtiradorExcluir extends JFrame {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("lolPU");
	private EntityManager em = emf.createEntityManager();


	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCarac;
	private JTextField txtEscolha;
	

	private JTextField txtArma;
	private Atirador atirador = new Atirador();
	private Arma arma;
	private Ser especie;
	private JTextField txtEspecie;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtiradorExcluir frame = new AtiradorExcluir();
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
	public AtiradorExcluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNome = new JLabel("Nome:");
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
		spnVida.setEnabled(false);
		spnVida.setBounds(58, 33, 86, 20);
		contentPane.add(spnVida);
		
		final JSpinner spnMana = new JSpinner();
		spnMana.setEnabled(false);
		spnMana.setBounds(58, 58, 86, 20);
		contentPane.add(spnMana);
		
		final JCheckBox chkMorto = new JCheckBox("Está Morto");
		chkMorto.setEnabled(false);
		chkMorto.setBounds(58, 92, 97, 23);
		contentPane.add(chkMorto);
		
		JLabel lblMorto = new JLabel("Morto:");
		lblMorto.setBounds(10, 96, 46, 14);
		contentPane.add(lblMorto);
		
		final JSpinner spnAlcance = new JSpinner();
		spnAlcance.setEnabled(false);
		spnAlcance.setBounds(58, 118, 86, 20);
		contentPane.add(spnAlcance);
		
		
		
		final JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setBounds(261, 106, 86, 14);
		lblEspecialidade.setVisible(false);	
		contentPane.add(lblEspecialidade);
		
		
		final JLabel lblCarac = new JLabel("Caracteristica:");
		lblCarac.setBounds(261, 50, 86, 14);
		lblCarac.setVisible(true);
		contentPane.add(lblCarac);
		
		txtCarac = new JTextField();
		txtCarac.setEnabled(false);
		txtCarac.setBounds(261, 75, 112, 20);
		contentPane.add(txtCarac);
		txtCarac.setColumns(10);
		
		txtEscolha = new JTextField();
		txtEscolha.setEnabled(false);
		txtEscolha.setBounds(261, 131, 112, 20);
		txtEscolha.setVisible(false);
		contentPane.add(txtEscolha);
		txtEscolha.setColumns(10);
		
		final JLabel lblDivindade = new JLabel("Divindade:");
		lblDivindade.setBounds(261, 106, 112, 14);
		lblDivindade.setVisible(false);
		contentPane.add(lblDivindade);
		
		final JLabel lblEnergia = new JLabel("Energia:");
		lblEnergia.setBounds(261, 106, 112, 14);
		lblEnergia.setVisible(false);
		contentPane.add(lblEnergia);
		
		final JLabel lblAnimal = new JLabel("Animal:");
		lblAnimal.setBounds(261, 106, 112, 14);
		lblAnimal.setVisible(false);
		contentPane.add(lblAnimal);
		
		final JLabel lblHospedeiro = new JLabel("Hospedeiro:");
		lblHospedeiro.setBounds(261, 106, 112, 14);
		lblHospedeiro.setVisible(false);
		contentPane.add(lblHospedeiro);
		
		final JLabel lblIdioma = new JLabel("Idioma");
		lblIdioma.setBounds(261, 106, 112, 14);
		lblIdioma.setVisible(false);
		contentPane.add(lblIdioma);
		
		JLabel lblArma = new JLabel("Arma:");
		lblArma.setBounds(10, 161, 46, 14);
		contentPane.add(lblArma);
		
		txtArma = new JTextField();
		txtArma.setEnabled(false);
		txtArma.setBounds(58, 158, 86, 20);
		contentPane.add(txtArma);
		txtArma.setColumns(10);
		
		JLabel lblDano = new JLabel("Dano:");
		lblDano.setBounds(10, 192, 46, 14);
		contentPane.add(lblDano);
		
		final JSpinner spnDano = new JSpinner();
		spnDano.setEnabled(false);
		spnDano.setBounds(58, 189, 86, 20);
		contentPane.add(spnDano);
		
		txtEspecie = new JTextField();
		txtEspecie.setEnabled(false);
		txtEspecie.setBounds(308, 8, 86, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);
		
		final JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				atirador.setNome(txtNome.getText());
				atirador.setVida((Integer)spnVida.getValue());
				atirador.setMana((Integer)spnMana.getValue());
				atirador.setMorto(chkMorto.isSelected());
				atirador.setAlcance((Integer)spnAlcance.getValue());
				
				
				arma.setNome(txtArma.getText());
				arma.setDano((Integer)spnDano.getValue());
				
				atirador.setArma(arma);
				
				
				String especie_tipo = txtEspecie.getText();
				if (especie_tipo.equals("Vastaya")) {
                	((Vastaya) especie).setAnimal(txtEscolha.getText());
                }
				else if (especie_tipo.equals("Humano")) {
                	((Humano) especie).setIdioma(txtEscolha.getText());
                }
				else if (especie_tipo.equals("Aspecto")) {
                	((Aspecto) especie).setDivindade(txtEscolha.getText());
                }
				else if (especie_tipo.equals("Yordle")) {
                	((Yordle) especie).setEspecialidade(txtEscolha.getText());
                }
				else if (especie_tipo.equals("Darkin")) {
                	((Darkin) especie).setHospedeiro(txtEscolha.getText());
                }
				else if (especie_tipo.equals("Hibrido")) {
                	((Hibrido) especie).setElemento(txtEscolha.getText());
                }
				
		        atirador.setEspecie(especie);
		        em.getTransaction().begin();
		        em.remove(arma);
		        em.remove(especie);
		        em.remove(atirador);
		        em.getTransaction().commit();
		        
		       
			}
		});
		btnExcluir.setBounds(31, 253, 89, 23);
		contentPane.add(btnExcluir);
		
		final JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atirador = em.find(Atirador.class, txtNome.getText());
				if(atirador!=null) {
					btnExcluir.setEnabled(true);
					
					//txtNome.setEnabled(false);
					btnBuscar.setEnabled(false);
					
					spnVida.setValue(atirador.getVida());
					
					spnMana.setValue(atirador.getMana());
					
					chkMorto.setSelected(atirador.isMorto());
					
					spnAlcance.setValue(atirador.getAlcance());
					
					
					arma = atirador.getArma();
					if (arma!=null) {
						txtArma.setText(arma.getNome());
						
						spnDano.setValue(arma.getDano());
					}
					
					
					especie = atirador.getEspecie();
					if (especie!=null) {
						txtCarac.setText(especie.getCaracteristica());
						lblEspecialidade.setVisible(true);
						txtEscolha.setVisible(true);
						
						if (especie instanceof Vastaya) {
							txtEspecie.setText("Vastaya");
							txtEscolha.setText(((Vastaya) especie).getAnimal());
						}
						else if (especie instanceof Yordle) {
							txtEspecie.setText("Yordle");
							txtEscolha.setText(((Yordle) especie).getEspecialidade());
						}
						else if (especie instanceof Aspecto) {
							txtEspecie.setText("Aspecto");
							txtEscolha.setText(((Aspecto) especie).getDivindade());
						}
						else if (especie instanceof Humano) {
							txtEspecie.setText("Humano");
							txtEscolha.setText(((Humano) especie).getIdioma());
						}
						else if (especie instanceof Darkin) {
							txtEspecie.setText("Darkin");
							txtEscolha.setText(((Darkin) especie).getHospedeiro());
						}
						else if (especie instanceof Hibrido) {
							txtEspecie.setText("Hibrido");
							txtEscolha.setText(((Hibrido) especie).getElemento());
						}
					}
				
					
				}else {
					JOptionPane.showMessageDialog(null, "Campeão não existe");
				}
			}
		});
		btnBuscar.setBounds(162, 7, 89, 23);
		contentPane.add(btnBuscar);
		
		
	}

}
