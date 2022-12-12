package primeiroTeste;

public class Canal {

	private int numeroDoCanal;
	private String nomeDoCanal;
	
	public Canal(int numdc, String ndc) {
		numeroDoCanal = numdc;
		nomeDoCanal = ndc;
	}
	
	public int getNumeroDoCanal() {
		return numeroDoCanal;
	}
	
	public void setNumeroDoCanal(int numeroDoCanal) {
		this.numeroDoCanal = numeroDoCanal;
	}
	
	public String getNomeDoCanal() {
		return nomeDoCanal;
	}
	
	public void setNomeDoCanal(String nomeDoCanal) {
		this.nomeDoCanal = nomeDoCanal;
	}
	
	@Override
	public String toString() {
		return "Numero do canal criado: " + numeroDoCanal + "\n" +
				"Nome do canal criado: " + nomeDoCanal + "\n" ;
	}
}
