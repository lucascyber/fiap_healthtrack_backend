package com.br.healthtrack;

import java.util.Date;

/**
 * Classe da abstração das Refeições do usuário
 * 
 * @author Lucas Teixeira e Lucas Coutinho
 * @version 1.0
 */

public class Refeicao {
	int idRefeicao;
	String descricaoRefeicao;
	Date horaRefeicao;
	int ptsHealthScore;
	Alimento[] alimentos;
	
	public Refeicao() {
		
	}
	
	public Refeicao(String descricaoRefeicao) {
		this.descricaoRefeicao = descricaoRefeicao;
	}
	
	/**
	 * Consulta uma refeicao que foi adicionada pelo usuário
	 * 
	 * @param idUsuario
	 * @param idCardapio
	 * @param idRefeicao
	 * @return Refeicao
	 */
	public Refeicao consultarRefeicao(int idUsuario, int idCardapio, int idRefeicao) {
		//Regra de negócio com o backend vai aqui
		return new Refeicao();
	}
	/**
	 * Faz uma consulta no banco e retorna as refeições adicionas pelo usuário
	 * 
	 * @param idUsuario
	 * @param idCardapio
	 * @return Refeicao[]
	 */
	public Refeicao[] listarRefeicao(int idUsuario, int idCardapio) {
		//Regra de negócio com o backend vai aqui
		Refeicao item[] = new Refeicao[1];
		return item;
	}
	/**
	 * Atualiza os dados de uma refeição 
	 * adicionada no banco de dados
	 * 
	 * @param idUsuario
	 * @param idCardapio
	 * @param refeicao
	 * @return Refeicao
	 */
	public Refeicao atualizarRefeicao(int idUsuario, int idCardapio, Refeicao refeicao) {
		//Regra de negócio com o backend vai aqui
		return new Refeicao();
	}
	/**
	 * Exclui do banco de dados uma refeição 
	 * adicionada pelo usuário.
	 * 
	 * @param idUsuario
	 * @param idCardapio
	 * @param idRefeicao
	 */
	public void deletarRefeicao(int idUsuario, int idCardapio, int idRefeicao) {
		//Regra de negócio com o backend vai aqui
	}
}