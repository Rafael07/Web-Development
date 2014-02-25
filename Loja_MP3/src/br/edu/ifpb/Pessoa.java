/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues 
 * @author Lenildo Sousa
 * @version 1.0
 */

/**
 * Classe responsável pela criação de pessoas, de modo genérico.
 */
public abstract class Pessoa {

	
	private String nome;
	
	private int idade;
	
	private float cpf;
	
	private String email;
	
	
	/**
	 * Os parâmetros correspodem as informações da pessoa, que serão geradas a partir deste construtor.
	 * @param nome
	 * @param idade
	 * @param cpf
	 * @param email
	 */

	public Pessoa(String nome, int idade, float cpf, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.email = email;
	}

	/**
	 * Métodos Get e Set da classe, para acesso aos dados de maneira segura
	 * 
	 */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método toString que permite a impressão dos atributos da classe.
	 */
	
	@Override
	public String toString() {
		return "Pessoa nome: " + nome + "\nidade: " + idade + "\ncpf: " + cpf
				+ "\nemail: " + email;
	}

	
}
