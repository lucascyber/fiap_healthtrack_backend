package br.com.healthtrack.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe da abstração das atividades do usuário
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class Atividade {
	public int idAtividade;
	public float qtdAgua;
	public int calConsumidas;
	public int calMeta;
	public Date datAtividade;
	public int ptsHealthScore;


	public Atividade() {

	}

	public Atividade(float qtdAgua, int calConsumidas, int calMeta) {
		this.qtdAgua = qtdAgua;
		this.calConsumidas = calConsumidas;
		this.calMeta = calMeta;
		this.datAtividade = new Date();
		this.ptsHealthScore = 200;
	}	

	@SuppressWarnings("deprecation")
	public Atividade(int id,float qtdAgua, int calConsumidas, int calMeta, int dia) {
		this.idAtividade = id;
		this.qtdAgua = qtdAgua;
		this.calConsumidas = calConsumidas;
		this.calMeta = calMeta;
		this.datAtividade = new Date(2020,9,dia);
		this.ptsHealthScore = calConsumidas / 10;
	}	
	
	/* getter and setters */	
	public int getIdAtividade() {
		return idAtividade;
	}

	public void setIdAtividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}

	public float getQtdAgua() {
		return qtdAgua;
	}

	public void setQtdAgua(float qtdAgua) {
		this.qtdAgua = qtdAgua;
	}

	public int getCalConsumidas() {
		return calConsumidas;
	}

	public void setCalConsumidas(int calConsumidas) {
		this.calConsumidas = calConsumidas;
	}

	public int getCalMeta() {
		return calMeta;
	}

	public void setCalMeta(int calMeta) {
		this.calMeta = calMeta;
	}

	public Date getDatAtividade() {
		return datAtividade;
	}

	public void setDatAtividade(Date datAtividade) {
		this.datAtividade = datAtividade;
	}

	public int getPtsHealthScore() {
		return ptsHealthScore;
	}

	public void setPtsHealthScore(int ptsHealthScore) {
		this.ptsHealthScore = ptsHealthScore;
	}

	/**
	 * Adiciona uma nova atividade realizada pelo usuário no banco de dados da
	 * aplicação.
	 * 
	 * @param idUsuario codigo do usuario
	 * @param atividade objeto preenchido com os dados da atividade
	 */
	public void addAtividade(int idUsuario, Atividade atividade) {
		// Regra de negócio aqui
	}

	/**
	 * Retorna todas as atividades gravadas no banco adicionadas pelo usuário
	 * 
	 * @param idUsuario codigo do usuario
	 * @return Atividade[] lista de atividades
	 */
	public Atividade[] listarAtividades(int idUsuario) {
		Atividade item[] = new Atividade[1];
		return item;
	}

	/**
	 * Retorna a consulta de uma atividade específica
	 * 
	 * @param idUsuario codigo do usuario
	 * @param idAtividade codigo da atividade
	 * @return Atividade objeto do tipo atividade
	 */
	public Atividade consultarAtividade(int idUsuario, int idAtividade) {
		return new Atividade();
	}
}
