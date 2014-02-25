/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael Rodrigues
 * @author Lenildo Sousa
 * 
 * Classe responsável pela criação de Objetos MP3
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
	 * Construtor da classe e seus parâmetros
	 * @param nome
	 * @param descrição
	 * @param tag
	 * @param tamanho
	 * @param artista
	 * @param genero
	 */
	
	public ArquivosMP3(String nome, String descrição, int tag, double tamanho, String artista, String genero) {
		super(nome, descrição, tag);
		this.artista = artista;
		this.genero = genero;
		this.tamanho = tamanho;
		
	}

	/**
	 * Métodos Get e Set da classe
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
	 * Método toString da classe
	 */
	
	@Override
	public String toString() {
		return "ArquivosMP3 [getTamanho()=" + getTamanho() + ", getArtista()="
				+ getArtista() + ", getGenero()=" + getGenero()
				+ ", getDescrição()=" + getDescrição() + ", getTag()="
				+ getTag() + ", getNome()=" + getNome() + "]";
	}

	

	
	
	

	

}
