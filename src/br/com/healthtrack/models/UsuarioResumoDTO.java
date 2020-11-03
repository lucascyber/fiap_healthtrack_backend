package br.com.healthtrack.models;

/**
 * Classe de resumo de dados do usuario
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class UsuarioResumoDTO {
	private int id;
	private String nomeUsuario;
	private String sobrenomeUsuario;
	private String email;
	private double peso;
	private double altura;
	private int pressao;
	private double imc;
	private int healthScore;
	private String authToken;

	public UsuarioResumoDTO() {
	}

	public UsuarioResumoDTO(int id, String nome, String email, double peso, double altura, int pressao, int healthscore,
			String authToken) {
		this.id = id;
		this.nomeUsuario = nome;
		this.altura = altura;
		this.email = email;
		this.peso = peso;
		this.altura = altura;
		this.setPressao(pressao);
		this.imc = (int) (peso / (altura * altura));
		this.healthScore = healthscore;
		this.authToken = authToken;
	}

	public int getIdUsuario() {
		return id;
	}

	/**
	 * seta o codigo do usuario
	 * 
	 * @param idUsuario codigo do usuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.id = idUsuario;
	}

	/**
	 * retorna o nome do usuario
	 * 
	 * @return
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	/**
	 * atualiza o nome do usuario
	 * 
	 * @param nomeUsuario nome do usuario
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	/**
	 * obtem o sobrenome do usuario
	 * 
	 * @return
	 */
	public String getSobrenomeUsuario() {
		return sobrenomeUsuario;
	}

	/**
	 * atualiza o sobrenome do usuario
	 * 
	 * @param sobrenomeUsuario sobrenome do usuario
	 */
	public void setSobrenomeUsuario(String sobrenomeUsuario) {
		this.sobrenomeUsuario = sobrenomeUsuario;
	}

	/**
	 * atualiza o sobrenome do usuario
	 * 
	 * @param sobrenomeUsuario sobrenome do usuario
	 * @return
	 */
	public String getNomeCompletoUsuario() {
		return this.nomeUsuario + " " + this.sobrenomeUsuario;
	}

	/**
	 * obtem email
	 * 
	 * @return retorna o email do usuario
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;

		this.setImc();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;

		this.setImc();
	}

	/**
	 * retorna o imc
	 * 
	 * @return imc do usuario
	 */
	public double getImc() {
		return imc;
	}

	/**
	 * atualizar o imc do usuario
	 */
	public void setImc() {
		this.imc = (int) (this.peso / (this.altura * this.altura));
	}

	/**
	 * obtem o healthscore
	 * 
	 * @return
	 */
	public int getHealthScore() {
		return healthScore;
	}

	/**
	 * atualizar healthscre
	 * 
	 * @param healthScore
	 */
	public void setHealthScore(int healthScore) {
		this.healthScore = healthScore;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public int getPressao() {
		return pressao;
	}

	public void setPressao(int pressao) {
		this.pressao = pressao;
	}

}
