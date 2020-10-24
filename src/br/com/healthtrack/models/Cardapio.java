package br.com.healthtrack.models;

/**
 * Classe da abstra��o base dos cardapios do usuario
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class Cardapio {

	public int idCardapio;
	private String nomeCardapio;
	public String tipo;
	public Refeicao[] refeicoes;

	public Cardapio() {

	}

	/* getter and setters */	
	public int getIdCardapio() {
		return idCardapio;
	}

	public void setIdCardapio(int idCardapio) {
		this.idCardapio = idCardapio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Refeicao[] getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(Refeicao[] refeicoes) {
		this.refeicoes = refeicoes;
	}

	public Cardapio(String nomeCardapio) {
		this.setNomeCardapio(nomeCardapio);
	}

	public Cardapio consultarCardapio(int idUsuario, int idCardapio) {
		// Regra de neg�cio com o backend vai aqui
		System.out.println("Isto � um card�pio");
		return new Cardapio();
	}

	public Cardapio[] listarCardapios(int idUsuario, String tipo) {
		// Regra de neg�cio com o backend vai aqui
		return new Cardapio[1];
	}

	public String getNomeCardapio() {
		return nomeCardapio;
	}

	public void setNomeCardapio(String nomeCardapio) {
		this.nomeCardapio = nomeCardapio;
	}
}
