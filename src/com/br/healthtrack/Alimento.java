package com.br.healthtrack;

/**
 * Classe da abstração dos alimentos adicionados pelo usuário
 * 
 * @author Lucas Teixeira e Lucas Coutinho
 * @version 1.0
 */
public class Alimento {
	int idAlimento;
	String nomeAlimento;
	float alimentoCalorias;
	int ptsHealthTrack;
	
	/**
	 * Retorna uma lista de alimentos de acordo com a busca
	 * realizada pelo usuário
	 * @param term
	 * @return Alimento[]
	 */
	public Alimento[] buscarAlimento(String term) {
		Alimento item[] = new Alimento[1];
		return item;
	}
	/**
	 * Adiciona um alimento a uma refeição criada pelo usuário
	 * @param idUsuario
	 * @param idAlimento
	 * @param idRefeicao
	 */
	public void adicionarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		//Regra de negócio com o backend vai aqui
	}
	/**
	 * Exclui um alimento a uma refeição criada pelo usuário
	 * @param idUsuario
	 * @param idAlimento
	 * @param idRefeicao
	 */
	public void deletarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		//Regra de negócio com o backend vai aqui
	}
	
}
