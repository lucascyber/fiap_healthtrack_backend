package br.com.healthtrack.models;

import java.util.Date;

/**
 * Classe da abstração dos alimentos adicionados pelo usuário
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class Alimento {
	private int idAlimento;
	private int idUsuario;
	private String nomeAlimento;
	private float alimentoCalorias;
	private int ptsHealthTrack;
	private Date dataRegistro;

	public Alimento() {
	}

	public Alimento(int idUsuario, String nome, float calorias, int pontuacao) {
		this.idUsuario = idUsuario;
		this.nomeAlimento = nome;
		this.alimentoCalorias = calorias;
		this.ptsHealthTrack = pontuacao;
		this.dataRegistro = new Date();
	}
	
	
	/**
	 * obtem o codigo do alimento
	 * 
	 * @return
	 */
	public int getIdAlimento() {
		return idAlimento;
	}

	/**
	 * atualiza o codigo do alimento
	 * 
	 * @param idAlimento
	 */
	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}

	/**
	 * obtem o codigo do usuario
	 * 
	 * @return
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * atualiza o codigo do usuario
	 * 
	 * @param idUsuario codigo do usuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * obtem o nome do alimento
	 * 
	 * @return
	 */
	public String getNomeAlimento() {
		return nomeAlimento;
	}

	/**
	 * atualiza o nome do alimento
	 * 
	 * @param nomeAlimento nome do alimento
	 */
	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	/**
	 * obtem as calorias do alimento
	 * 
	 * @return
	 */
	public float getAlimentoCalorias() {
		return alimentoCalorias;
	}

	/**
	 * atualiza as calorias do alimento
	 * 
	 * @param alimentoCalorias calorias do alimento
	 */
	public void setAlimentoCalorias(float alimentoCalorias) {
		this.alimentoCalorias = alimentoCalorias;
	}

	/**
	 * obtem a pontuacao do alimento
	 * 
	 * @return
	 */
	public int getPtsHealthTrack() {
		return ptsHealthTrack;
	}

	/**
	 * atualiza a pontuacao do alimento
	 * 
	 * @param ptsHealthTrack
	 */
	public void setPtsHealthTrack(int ptsHealthTrack) {
		this.ptsHealthTrack = ptsHealthTrack;
	}

	/**
	 * obtem a data de registro do alimento
	 * 
	 * @return
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * atualiza a data do registro
	 * 
	 * @param dataRegistro data do registro
	 */
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	/**
	 * Retorna uma lista de alimentos de acordo com a busca realizada pelo usuário
	 * 
	 * @param term Parmetro da busca
	 * @return Alimento[] Lista de alimentos
	 */
	public Alimento[] buscarAlimento(String term) {
		Alimento item[] = new Alimento[1];
		return item;
	}

	/**
	 * Adiciona um alimento a uma refeição criada pelo usuário
	 * 
	 * @param idUsuario  codigo do usuario
	 * @param idAlimento codigo do alimento
	 * @param idRefeicao codigo da refeicao
	 */
	public void adicionarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		// Regra de negócio com o backend vai aqui
	}

	/**
	 * Exclui um alimento a uma refeição criada pelo usuário
	 * 
	 * @param idUsuario  codigo do usuario
	 * @param idAlimento codigo do alimento
	 * @param idRefeicao codigo da refeicao
	 */
	public void deletarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		// Regra de negócio com o backend vai aqui
	}
}
