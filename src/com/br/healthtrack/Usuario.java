package com.br.healthtrack;

import java.io.Serializable;

/**
 * Classe da abstração de usuário
 * 
 * @author Lucas Teixeira e Lucas Coutinho
 * @version 1.0
 */

public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long usuarioSerial = 1L;
	
	// Atributos
	private int idUsuario;
	private String nomeUsuario;
	private String senhaUsuario = "senha123";
	private double peso;
	private double altura;
	private int imc;
	private int healthScore;
	private String authToken;
	private Atividade[] atividades;
	
	public Usuario() {
		
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	/**
	 * Recebe a senha atual e verifica e trocar por uma nova senha
	 * @param senha - senha atual
	 * @param novaSenha - nova senha escolhida
	 * @return Senha Alterada com sucesso
	 * @throws Senha Inválida
	 */
	public String alterarSenha(String senha, String novaSenha) {
		if (senha == this.senhaUsuario) {
			this.senhaUsuario = novaSenha;
			return "Senha Alterada com sucesso";
		} else {
			return "Senha Inválida";
		}
	}
	
	public Atividade[] getAtividades() {
		return this.atividades;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getImc() {
		return this.imc;
	}
	/**
	 * Recebe o peso e altura e seta o IMC
	 * @param peso
	 * @param altura
	 */
	public void setImc(double peso, double altura) {
		this.imc = (int) (peso / (altura * altura));
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getHealthScore() {
		return healthScore;
	}
	
	public String getAuthToken() {
		return authToken;
	}
	
	
}
