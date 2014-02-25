/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues
 * @author Lenildo Sousa
 *
 * Classe gen�rica que serve de base para cria��o de um produto qualquer.
 */

public abstract class Produto {

	/**
	 * Atributos da classe.
	 */
	
	private String descri��o;
	
	private int tag;
	
	private String nome;
	
	/**
	 * Construtor da classe e seus par�metros
	 * @param nome
	 * @param descri��o
	 * @param tag
	 */
	
	public Produto(String nome, String descri��o, int tag){
		this.nome = nome;
		this.descri��o = descri��o;
		this.tag = tag;
		
	}

	/**
	 * M�todos Get e Set da classe
	 * 
	 */
	
	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
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
		return "Produto [getDescri��o()=" + getDescri��o() + ", getTag()="
				+ getTag() + ", getNome()=" + getNome() + "]";
	}

	
	
}
