package br.com.healthtrack.models;

/**
 * Classe da abstração dos alimentos adicionados pelo usuário
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class Alimento {
	public int idAlimento;
	public String nomeAlimento;
	public float alimentoCalorias;
	public int ptsHealthTrack;


	/* getter and setters */	
	public int getIdAlimento() {
		return idAlimento;
	}

	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}

	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public float getAlimentoCalorias() {
		return alimentoCalorias;
	}

	public void setAlimentoCalorias(float alimentoCalorias) {
		this.alimentoCalorias = alimentoCalorias;
	}

	public int getPtsHealthTrack() {
		return ptsHealthTrack;
	}

	public void setPtsHealthTrack(int ptsHealthTrack) {
		this.ptsHealthTrack = ptsHealthTrack;
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
	 * @param idUsuario codigo do usuario
	 * @param idAlimento codigo do alimento
	 * @param idRefeicao codigo da refeicao
	 */
	public void adicionarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		// Regra de negócio com o backend vai aqui
	}

	/**
	 * Exclui um alimento a uma refeição criada pelo usuário
	 * 
	 * @param idUsuario codigo do usuario
	 * @param idAlimento codigo do alimento
	 * @param idRefeicao codigo da refeicao
	 */
	public void deletarAlimento(int idUsuario, int idAlimento, int idRefeicao) {
		// Regra de negócio com o backend vai aqui
	}

}
