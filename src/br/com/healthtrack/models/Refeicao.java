package br.com.healthtrack.models;

import java.util.Date;

/**
 * Classe da abstração das Refeições do usuário
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */
public class Refeicao {
	int idRefeicao;
	private String descricaoRefeicao;
	Date horaRefeicao;
	private int ptsHealthScore;
	Alimento[] alimentos;

	public Refeicao() {

	}

	public Refeicao(String descricaoRefeicao) {
		this.setDescricaoRefeicao(descricaoRefeicao);
	}

	/**
	 * Consulta uma refeicao que foi adicionada pelo usuário
	 * 
	 * @param idUsuario codigo do usuario
	 * @param idCardapio codigo do cardapio
	 * @param idRefeicao codigo da refeicao
	 * @return Refeicao objeto do tipo refeicao
	 */
	public Refeicao consultarRefeicao(int idUsuario, int idCardapio, int idRefeicao) {
		// Regra de negócio com o backend vai aqui
		return new Refeicao();
	}

	/**
	 * Faz uma consulta no banco e retorna as refeições adicionas pelo usuário
	 * 
	 * @param idUsuario codigo do usuario
	 * @param idCardapio codigo do cardapio
	 * @return Refeicao[] lista de refeicoes
	 */
	public Refeicao[] listarRefeicao(int idUsuario, int idCardapio) {
		// Regra de negócio com o backend vai aqui
		Refeicao item[] = new Refeicao[1];
		return item;
	}

	/**
	 * Atualiza os dados de uma refeição adicionada no banco de dados
	 * 
	 * @param idUsuario  Codigo do Usuario
	 * @param idCardapio Codigo do Cardapio
	 * @param refeicao   Objeto com os detalhes da refeicao do usuario
	 * @return Refeicao
	 */
	public Refeicao atualizarRefeicao(int idUsuario, int idCardapio, Refeicao refeicao) {
		// Regra de negócio com o backend vai aqui
		return new Refeicao();
	}

	/**
	 * Exclui do banco de dados uma refeição adicionada pelo usuário.
	 * 
	 * @param idUsuario  Codigo do usuario
	 * @param idCardapio Codigo do cardapio
	 * @param idRefeicao Codigo da refeicao
	 */
	public void deletarRefeicao(int idUsuario, int idCardapio, int idRefeicao) {
		// Regra de negócio com o backend vai aqui
	}

	public int getPtsHealthScore() {
		return ptsHealthScore;
	}

	public void setPtsHealthScore(int ptsHealthScore) {
		this.ptsHealthScore = ptsHealthScore;
	}

	public String getDescricaoRefeicao() {
		return descricaoRefeicao;
	}

	public void setDescricaoRefeicao(String descricaoRefeicao) {
		this.descricaoRefeicao = descricaoRefeicao;
	}
}