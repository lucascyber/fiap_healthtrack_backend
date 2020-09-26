package com.br.healthtrack;

import java.util.Date;

/**
 * Classe da abstra��o das atividades do usu�rio
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
	 * Adiciona uma nova atividade realizada pelo usu�rio
	 * no banco de dados da aplica��o.
	 * 
	 * @param idUsuario
	 * @param atividade
	 */
	public void addAtividade(int idUsuario, Atividade atividade) {
		// Regra de neg�cio aqui
	}
	/**
	 * Retorna todas as atividades gravadas no banco 
	 * adicionadas pelo usu�rio
	 * 
	 * @param idUsuario
	 * @return Atividade[]
	 */
	public Atividade[] listarAtividades(int idUsuario) {
		Atividade item[] = new Atividade[1];
		return item;
	}
	/**
	 * Retorna a consulta de uma atividade espec�fica
	 * 
	 * @param idUsuario
	 * @param idAtividade
	 * @return Atividade
	 */
	public Atividade consultarAtividade(int idUsuario, int idAtividade) {
		return new Atividade();
	}
}
