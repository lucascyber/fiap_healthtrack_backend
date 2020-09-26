package com.br.healthtrack;

public class CardapioSugerido extends Cardapio{
	public CardapioSugerido() {
		
	}
	
	@Override
	public CardapioSugerido consultarCardapio(int idUsuario, int idCardapio) {
		//Regra de neg�cio com o backend vai aqui
		super.consultarCardapio(idUsuario, idCardapio);
		if (this.tipo == "sugerido") {
			System.out.println("Isto � um card�pio de sugeridos");
		} else {
			System.out.println("Tipo inv�lido");
		}
		return new CardapioSugerido();
	}
}
