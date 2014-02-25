/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues
 * @author Lenildo Sousa
 *
 *Classe Cliente, que visa criar os clientes da aplica��o
 */


public class Cliente extends Pessoa {

	/**
	 * Construtor da classe com os seguintes par�metros: 
	 * @param nome
	 * @param idade
	 * @param cpf
	 * @param email
	 */
	
	public Cliente(String nome, int idade, float cpf, String email) {
		super(nome, idade, cpf, email);
		
	}

	/**
	 * M�todo toString com os m�todos herdados da superclasse
	 */
	
	@Override
	public String toString() {
		return "Cliente [getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
