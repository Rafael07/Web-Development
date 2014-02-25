/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael
 *
 */

public class Funcionario extends Pessoa {

	/**
	 * 
	 */
	private int matricula;
	
	private String login;
	
	private java.lang.String senha;

	public Funcionario(String nome, int idade, float cpf, String email, int matricula, String login, String senha) {
		super(nome, idade, cpf, email);
		this.login = login;
		this.senha = senha;
		this.matricula = matricula;
		
	}

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

	
	

}
