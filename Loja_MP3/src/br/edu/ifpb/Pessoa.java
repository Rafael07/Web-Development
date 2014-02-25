/**
 * 
 */
package br.edu.ifpb;

/**
 * @author Rafael
 *
 */
public abstract class Pessoa {

	
	private String nome;
	
	private int idade;
	
	private float cpf;
	
	private String email;
	
	
	

	public Pessoa(String nome, int idade, float cpf, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa nome: " + nome + "\nidade: " + idade + "\ncpf: " + cpf
				+ "\nemail: " + email;
	}

	
}
