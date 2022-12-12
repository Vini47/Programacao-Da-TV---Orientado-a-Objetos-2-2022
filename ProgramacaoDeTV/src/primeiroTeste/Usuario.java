package primeiroTeste;

public class Usuario {

	private String nome;
	
	public Usuario( String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + nome ;
	}
}
