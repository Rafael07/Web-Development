/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues
 * @author Lenildo Sousa
 *
 *Classe Cliente, que visa criar os clientes da aplicação
 */


public class Cliente extends Pessoa {

	/**
	 * Construtor da classe com os seguintes parâmetros: 
	 * @param nome
	 * @param idade
	 * @param cpf
	 * @param email
	 */
	
	public Cliente(String nome, int idade, float cpf, String email) {
		super(nome, idade, cpf, email);
		
	}

	/**
	 * Método toString com os métodos herdados da superclasse
	 */
	
	@Override
	public String toString() {
		return "Cliente [getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
