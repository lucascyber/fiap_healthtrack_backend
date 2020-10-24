package br.com.healthtrack.models;

import java.util.Date;

/**
 * Classe da abstração de usuário
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class Peso {
	private int idPeso;
	private double peso;
	private Date data;

	public Peso() {
	}

	/**
	 * inicializacao de um novo peso
	 * @param peso peso novo
	 */
	public Peso(double peso) {
		this.peso = peso;
		this.data = new Date();
	}
	
	/**
	 * get codigo peso
	 * @return
	 */
	public int getIdPeso() {
		return idPeso;
	}

	/**
	 * set codigo
	 * @param idPeso
	 */
	public void setIdPeso(int idPeso) {
		this.idPeso = idPeso;
	}

	/**
	 * obter peso
	 * @return
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * atualizar peso
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obtem data
	 * @return
	 */
	public Date getData() {
		return data;
	}

	/**
	 * atualiza a data
	 * @param data
	 */
	public void setData(Date data) {
		this.data = data;
	}


}
