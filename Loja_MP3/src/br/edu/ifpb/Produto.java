/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael
 *
 */

public abstract class Produto {

	
	private String descrição;
	
	private int tag;
	
	private String nome;
	
	public Produto(String nome, String descrição, int tag){
		this.nome = nome;
		this.descrição = descrição;
		this.tag = tag;
		
	}

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

	
}
