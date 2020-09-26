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
		//Regra de negócio com o backend vai aqui
		System.out.println("Isto é um cardápio");
		return new Cardapio();
	}
	
	public Cardapio[] listarCardapios(int idUsuario, String tipo) {
		//Regra de negócio com o backend vai aqui
		return new Cardapio[1];
	}
}
