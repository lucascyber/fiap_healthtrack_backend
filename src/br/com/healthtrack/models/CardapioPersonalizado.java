package br.com.healthtrack.models;

/**
 * Classe da abstração do cardapio adicionado pelo usuário
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class CardapioPersonalizado extends Cardapio {

	public CardapioPersonalizado() {

	}

	public CardapioPersonalizado(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public CardapioPersonalizado consultarCardapio(int idUsuario, int idCardapio) {
		// Regra de negócio com o backend vai aqui
		super.consultarCardapio(idUsuario, idCardapio);
		if (this.tipo == "personalizado") {
			System.out.println("Isto é um cardápio personalizado");
		} else {
			System.out.println("Tipo inválido");
		}
		return new CardapioPersonalizado();
	}

	public void adicionarCardapio(int idUsuario, CardapioPersonalizado cardapio) {
		// Regra de negócio com o backend vai aqui
	}

	public void deletarCardapio(int idUsuario, int idCardapio) {
		// Regra de negócio com o backend vai aqui
	}

	public String atualizarCardapio(int idUsuario, int idCardapio, String nomeCardapio) {
		// Regra de negócio com o backend vai aqui
		this.setNomeCardapio(nomeCardapio);
		return this.getNomeCardapio();
	}

	public CardapioPersonalizado atualizarRefeicao(int idUsuario, int idRefeicao, int idCardapio, Refeicao refeicao) {
		// Regra de negócio com o backend vai aqui
		return new CardapioPersonalizado();
	}
}
