package br.com.healthtrack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.models.Peso;

public class PesoDAO {

	/**
	 * Busca a peso pelo id
	 * 
	 * @param id id da peso
	 * @return um objeto do tipo peso
	 */
	public Peso getById(int id) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		Peso peso = new Peso();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			ps = conexao.prepareStatement("SELECT * FROM t_ht_usuario WHERE ID_USUARIO = ?");
			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("ID_PESO"));
				
				peso = new Peso(rs.getInt("ID_PESO"), rs.getInt("ID_USUARIO"), rs.getDouble("QTD_PESO"),
						rs.getDate("DT_REGISTRO"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}

		return peso;
	}

	/**
	 * insere uma nova peso no banco
	 * 
	 * @param atividade objeto com os dados da peso
	 * @return o codigo da peso salva
	 */
	public void insert(Peso peso) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			ps = conexao.prepareStatement("INSERT INTO t_ht_peso (id_peso, id_usuario,qtd_peso,dt_registro) VALUES (SEQ_T_HT_PESO.NEXTVAL, ?, ?, ?);");

			ps.setInt(1, peso.getUsuarioId());
			ps.setDouble(2, peso.getPeso());
			java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
			ps.setDate(3, data);

			ps.executeUpdate();

			System.out.println("Peso inserido com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}
	}

	/**
	 * exclui uma peso
	 * 
	 * @param id id do peso que sera excluido
	 */
	public void delete(int id) {

		Connection conexao;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");
			stmt = conexao.createStatement();
			stmt.executeUpdate("DELETE FROM t_ht_peso WHERE id_peso = " + id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			stmt = null;
			conexao = null;
		}

		System.out.println("Peso excluido com sucesso!:");
	}

	/**
	 * Atualiza os dados de uma peso existente
	 * 
	 * @param atividade objeto que sera atualizado
	 */
	public void update(Peso peso) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			ps = conexao.prepareStatement("UPDATE t_ht_peso SET qtd_peso = ? WHERE id_peso = ?");

			ps.setDouble(1, peso.getPeso());
			ps.setInt(2, peso.getIdPeso());

			ps.executeUpdate();

			System.out.println("Atividade Atualizada com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}
	}

	/**
	 * Retorna uma lista com todfos os pesos
	 * 
	 * @return lista com todas as atividades
	 */
	public List<Peso> getAll(int idUsuario) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		List<Peso> lista = new ArrayList<Peso>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			ps = conexao.prepareStatement("SELECT * FROM T_HT_PESO WHERE ID_USUARIO = ?");
			ps.setInt(1, idUsuario);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				lista.add(new Peso(rs.getInt("ID_PESO"), rs.getInt("ID_USUARIO"), rs.getDouble("QTD_PESO"),
						rs.getDate("DT_REGISTRO")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}

		return lista;
	}
}
