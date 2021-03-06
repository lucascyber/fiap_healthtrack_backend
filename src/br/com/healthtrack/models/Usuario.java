package br.com.healthtrack.models;

import java.io.Serializable;

/**
 * Classe da abstra��o de usu�rio
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private static final long usuarioSerial = 1L;

	// Atributos
	private int idUsuario;
	private String nome;
	private String email;
	private String senha;
	private double altura;
	String authToken;

	private Atividade[] atividades;

	public Usuario() {

	}

	/**
	 * Inicializao do usuario
	 * 
	 * @param idUsuario   codigo do usuairo
	 * @param nome        nome
	 * @param senha       senha
	 * @param email       email
	 * @param altura      altura
	 * @param healthScore pontuacao
	 * @param authToken   token de autenticacao
	 */
	public Usuario(int idUsuario, String nome, String senha, String email, double altura) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.altura = altura;
	}

	public Usuario(String nome, String senha, String email) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obter o email do usuario
	 * 
	 * @return email do usuario
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Alterar o email atual do usuario
	 * 
	 * @param novoEmail Novo email
	 * @param senha     Senha atual
	 */
	public void setEmail(String novoEmail, String senha) {
		if (senha == this.senha)
			this.email = novoEmail;
	}
	
	/**
	 * obtem o valor da senha
	 * @return
	 */
	public String getSenha() {
		return this.senha;
	}
	
	/**
	 * atualiza o valor da senha se ela tiver sido definida
	 * @param senha senha
	 */
	public void setSenha(String senha) {
		if (!(this.senha != null && this.senha.isEmpty())) {
			this.senha = senha;
		}
	}



	/**
	 * Recebe a senha atual e verifica e trocar por uma nova senha
	 * 
	 * @param senha     senha atual
	 * @param novaSenha senha nova
	 * @return Senha Alterada com sucesso
	 */
	public String alterarSenha(String senha, String novaSenha) {
		if (senha == this.senha) {
			this.senha = novaSenha;
			return "Senha Alterada com sucesso";
		} else {
			return "Senha Inv�lida";
		}
	}

	/**
	 * retorna uma lista com as atividades do usuario
	 * 
	 * @return lista com as atividades do usuario
	 */
	public Atividade[] getAtividades() {
		return this.atividades;
	}

	/**
	 * obtem altura do usuario
	 * 
	 * @return
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Atualizar a altura do usuario e o imc
	 * 
	 * @param altura nova altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getAuthToken() {
		return authToken;
	}

	public static long getUsuarioserial() {
		return usuarioSerial;
	}

}
