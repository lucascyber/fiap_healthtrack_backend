package com.br.healthtrack;

import java.util.Date;

/**
 * Classe da abstração das atividades do usuário
 * 
 * @author Lucas Teixeira e Lucas Coutinho
 * @version 1.0
 */
public class Atividade {
	int idAtividade;
	float qtdAgua;
	int calConsumidas;
	int calMeta;
	Date datAtividade;
	int ptsHealthScore;
	
	/**
	 * Adiciona uma nova atividade realizada pelo usuário
	 * no banco de dados da aplicação.
	 * 
	 * @param idUsuario
	 * @param atividade
	 */
	public void addAtividade(int idUsuario, Atividade atividade) {
		// Regra de negócio aqui
	}
	/**
	 * Retorna todas as atividades gravadas no banco 
	 * adicionadas pelo usuário
	 * 
	 * @param idUsuario
	 * @return Atividade[]
	 */
	public Atividade[] listarAtividades(int idUsuario) {
		Atividade item[] = new Atividade[1];
		return item;
	}
	/**
	 * Retorna a consulta de uma atividade específica
	 * 
	 * @param idUsuario
	 * @param idAtividade
	 * @return Atividade
	 */
	public Atividade consultarAtividade(int idUsuario, int idAtividade) {
		return new Atividade();
	}
}
