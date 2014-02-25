/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael
 *
 */
public class ArquivosMP3 extends Produto {

	
	private double tamanho;
	
	private String artista;
	
	private String genero;

	public ArquivosMP3(String nome, String descrição, int tag, double tamanho, String artista, String genero) {
		super(nome, descrição, tag);
		this.artista = artista;
		this.genero = genero;
		this.tamanho = tamanho;
		
	}

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

	@Override
	public String toString() {
		return "ArquivosMP3 [tamanho=" + tamanho + ", artista=" + artista
				+ ", genero=" + genero + "]";
	}

	
	
	

	

}
