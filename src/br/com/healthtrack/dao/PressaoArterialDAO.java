package br.com.healthtrack.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.models.*;;

public class PressaoArterialDAO {

	/**
	 * Busca a atividade pelo id
	 * 
	 * @param id id da atividade
	 * @return um objeto do tipo atividade
	 */
	public Atividade getById(int id) {
		return new Atividade(1, 10, 200, 4000, 1);
	}

	/**
	 * insere uma nova atividade no banco
	 * @param atividade objeto com os dados da atividade
	 * @return o codigo da atividade salva
	 */
	public int insert(Atividade atividade) {
		System.out.println("Atividade inserido com sucesso");
		return atividade.getIdAtividade();
	}

	/**
	 * exclui uma atividade
	 * 
	 * @param id id da atividade que sera excluida
	 */
	public void delete(int id) {
		System.out.println("Atividade excluida com sucesso!:");
	}

	/**
	 * Atualiza os dados de uma atividade existente
	 * 
	 * @param atividade objeto que sera atualizado
	 */
	public void update(Atividade atividade) {
		System.out.println("Atividade Atualizada com sucesso");
	}

	/**
	 * Retorna uma lista com todas as atividades
	 * 
	 * @return lista com todas as atividades
	 */
	public List<Atividade> getAll() {
		List<Atividade> lista = new ArrayList<Atividade>();
		for (int i = 0; i < 10; i++) {
			int calorias = 4000;
			int perda = 200;

			lista.add(new Atividade(i + 1, 10, perda, calorias, i));

		}
		return lista;
	}
}
