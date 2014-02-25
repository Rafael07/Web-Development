/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues
 * @author Lenildo Sousa
 * 
 * Classe respons�vel pela cria��o de Objetos MP3
 *
 */
public class ArquivosMP3 extends Produto {

	/**
	 * Atributos da classe
	 */
	
	private double tamanho;
	
	private String artista;
	
	private String genero;

	/**
	 * Construtor da classe e seus par�metros
	 * @param nome
	 * @param descri��o
	 * @param tag
	 * @param tamanho
	 * @param artista
	 * @param genero
	 */
	
	public ArquivosMP3(String nome, String descri��o, int tag, double tamanho, String artista, String genero) {
		super(nome, descri��o, tag);
		this.artista = artista;
		this.genero = genero;
		this.tamanho = tamanho;
		
	}

	/**
	 * M�todos Get e Set da classe
	 * 
	 */
	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * M�todo toString da classe
	 */
	
	@Override
	public String toString() {
		return "ArquivosMP3 [getTamanho()=" + getTamanho() + ", getArtista()="
				+ getArtista() + ", getGenero()=" + getGenero()
				+ ", getDescri��o()=" + getDescri��o() + ", getTag()="
				+ getTag() + ", getNome()=" + getNome() + "]";
	}

	

	
	
	

	

}
