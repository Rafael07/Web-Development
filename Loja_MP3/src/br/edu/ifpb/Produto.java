/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael
 *
 */

public abstract class Produto {

	
	private String descri��o;
	
	private int tag;
	
	private String nome;
	
	public Produto(String nome, String descri��o, int tag){
		this.nome = nome;
		this.descri��o = descri��o;
		this.tag = tag;
		
	}

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

	
}
