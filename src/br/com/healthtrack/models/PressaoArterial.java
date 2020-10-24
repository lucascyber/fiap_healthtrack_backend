package br.com.healthtrack.models;

import java.util.Date;

/**
 * Classe da abstração de pressao do usuario
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class PressaoArterial {
	private int idPressaoArterial;
	private int idUsuario;
	private double PressaoArterial;
	private Date data;

	public PressaoArterial() {
	}

	/**
	 * inicializacao de um novo PressaoArterial
	 * 
	 * @param PressaoArterial PressaoArterial novo
	 */
	public PressaoArterial(double PressaoArterial, int idUsuario) {
		this.idUsuario = idUsuario;
		this.PressaoArterial = PressaoArterial;
		this.data = new Date();
	}

	/**
	 * get codigo PressaoArterial
	 * 
	 * @return
	 */
	public int getidPressaoArterial() {
		return idPressaoArterial;
	}

	/**
	 * set codigo
	 * 
	 * @param idPressaoArterial
	 */
	public void setidPressaoArterial(int idPressaoArterial) {
		this.idPressaoArterial = idPressaoArterial;
	}

	/**
	 * obter PressaoArterial
	 * 
	 * @return
	 */
	public double getPressaoArterial() {
		return PressaoArterial;
	}

	/**
	 * atualizar PressaoArterial
	 * 
	 * @param PressaoArterial
	 */
	public void setPressaoArterial(double pressaoArterial) {
		this.PressaoArterial = pressaoArterial;
	}

	/**
	 * Obtem data
	 * 
	 * @return
	 */
	public Date getData() {
		return data;
	}

	/**
	 * atualiza a data
	 * 
	 * @param data
	 */
	public void setData(Date data) {
		this.data = data;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
