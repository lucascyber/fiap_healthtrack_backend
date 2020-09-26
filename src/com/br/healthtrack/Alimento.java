package com.br.healthtrack;

/**
 * Classe da abstra��o dos alimentos adicionados pelo usu�rio
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
	 * realizada pelo usu�rio
	 * @param term
	 * @return Alimento[]
	 */
	public Alimento[] buscarAlimento(String term) {
		Alimento item[] = new Alimento[1];
		return item;
	}
	/**
	 * Adiciona um alimento a uma refei��o criada pelo usu�rio
	 * @param idUsuario
	 * @param idAlimento
	 * @param idRefeicao
	 */
	public void adicionarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		//Regra de neg�cio com o backend vai aqui
	}
	/**
	 * Exclui um alimento a uma refei��o criada pelo usu�rio
	 * @param idUsuario
	 * @param idAlimento
	 * @param idRefeicao
	 */
	public void deletarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		//Regra de neg�cio com o backend vai aqui
	}
	
}
