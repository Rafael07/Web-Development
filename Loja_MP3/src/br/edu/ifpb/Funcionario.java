/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues
 * @author Lenildo Sousa
 *
 * Classe que cria funcionário, herdando atributos e métodos da super classe Pessoa. 
 */

public class Funcionario extends Pessoa {

	/**
	 * Atributos da classe
	 */
	
	private int matricula;
	
	private String login;
	
	private java.lang.String senha;

	/**
	 * Construtor da classe e seus parâmetros
	 * @param nome
	 * @param idade
	 * @param cpf
	 * @param email
	 * @param matricula
	 * @param login
	 * @param senha
	 */
	
	public Funcionario(String nome, int idade, float cpf, String email, int matricula, String login, String senha) {
		super(nome, idade, cpf, email);
		this.login = login;
		this.senha = senha;
		this.matricula = matricula;
		
	}

	/**
	 * Métodos Get e Set da classe.
	 */
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public java.lang.String getSenha() {
		return senha;
	}

	public void setSenha(java.lang.String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Funcionario [getMatricula()=" + getMatricula()
				+ ", getLogin()=" + getLogin() + ", getSenha()=" + getSenha()
				+ ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail()
				+  "]";
	}

	
	

}
