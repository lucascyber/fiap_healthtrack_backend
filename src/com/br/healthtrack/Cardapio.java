package com.br.healthtrack;

public class Cardapio {
	
	int idCardapio;
	String nomeCardapio;
	String tipo;
	Refeicao[] refeicoes;
	
	public Cardapio() {
		
	}
	
	public Cardapio(String nomeCardapio) {
		this.nomeCardapio = nomeCardapio;
	}
	
	public Cardapio consultarCardapio(int idUsuario, int idCardapio) {
		//Regra de neg�cio com o backend vai aqui
		System.out.println("Isto � um card�pio");
		return new Cardapio();
	}
	
	public Cardapio[] listarCardapios(int idUsuario, String tipo) {
		//Regra de neg�cio com o backend vai aqui
		return new Cardapio[1];
	}
}
