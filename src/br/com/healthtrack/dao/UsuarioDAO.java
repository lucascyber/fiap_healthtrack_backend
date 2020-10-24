package br.com.healthtrack.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.models.*;;

public class UsuarioDAO {

	/**
	 * Busca a usuario pelo id
	 * 
	 * @param id id da usuario
	 * @return um objeto do tipo usuario
	 */
	public Usuario getById(int id) {
		return new Usuario(1, "Nome", "Sobrenome", "****", "email@email.com", 1.90, 1000, "12355435");
	}

	/**
	 * resumo usuario
	 * 
	 * @param id codigo do usuario
	 * @return
	 */
	public UsuarioResumoDTO getUsuarioResumoById(int id) {
		return new UsuarioResumoDTO(1, "Nome", "Sobrenome", "email@email.com", 80, 1.90, 25, 1000, "1235543");
	}

	/**
	 * insere uma nova usuario no banco
	 * 
	 * @param usuario objeto com os dados da usuario
	 * @return o codigo da usuario salvo
	 */
	public int insert(Usuario usuario) {
		System.out.println("usuario inserido com sucesso");
		return usuario.getIdUsuario();
	}

	/**
	 * Exclui um usuario
	 * 
	 * @param idUsuario codigo do usuario a ser excluido
	 */
	public void delete(int idUsuario) {
		System.out.println("Usuario excluido com sucesso!:");
	}

	/**
	 * Atualiza os dados de um usuario existente
	 * 
	 * @param usuario usuario a ser atualizado
	 */
	public void update(Usuario usuario) {
		System.out.println("Usuario atualizado com sucesso");
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
