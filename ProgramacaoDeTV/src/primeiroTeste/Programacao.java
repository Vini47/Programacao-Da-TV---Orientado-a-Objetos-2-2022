package primeiroTeste;

public abstract class Programacao {

	protected String nome;
	protected String horaDeInicio;
	protected String horaDeFim;
	protected String descricao;
	 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHoraDeInicio() {
		return horaDeInicio;
	}
	
	public void setHoraDeInicio(String horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}
	
	public String getHoraDeFim() {
		return horaDeFim;
	}
	
	public void setHoraDeFim(String horaDeFim) {
		this.horaDeFim = horaDeFim;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Nome " + nome + 
				" Hora de inicio: " + horaDeInicio +
				" Hora de fim: " + horaDeFim +
				" Descrição: " + descricao ;
	}
}
