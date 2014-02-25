/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues
 * @author Lenildo Sousa
 *
 * Classe genérica que serve de base para criação de um produto qualquer.
 */

public abstract class Produto {

	/**
	 * Atributos da classe.
	 */
	
	private String descrição;
	
	private int tag;
	
	private String nome;
	
	/**
	 * Construtor da classe e seus parâmetros
	 * @param nome
	 * @param descrição
	 * @param tag
	 */
	
	public Produto(String nome, String descrição, int tag){
		this.nome = nome;
		this.descrição = descrição;
		this.tag = tag;
		
	}

	/**
	 * Métodos Get e Set da classe
	 * 
	 */
	
	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [getDescrição()=" + getDescrição() + ", getTag()="
				+ getTag() + ", getNome()=" + getNome() + "]";
	}

	
	
}
