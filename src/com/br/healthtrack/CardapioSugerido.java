package com.br.healthtrack;

public class CardapioSugerido extends Cardapio{
	public CardapioSugerido() {
		
	}
	
	@Override
	public CardapioSugerido consultarCardapio(int idUsuario, int idCardapio) {
		//Regra de negócio com o backend vai aqui
		super.consultarCardapio(idUsuario, idCardapio);
		if (this.tipo == "sugerido") {
			System.out.println("Isto é um cardápio de sugeridos");
		} else {
			System.out.println("Tipo inválido");
		}
		return new CardapioSugerido();
	}
}
