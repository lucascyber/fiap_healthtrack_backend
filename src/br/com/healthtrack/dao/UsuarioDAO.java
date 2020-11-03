package br.com.healthtrack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.com.healthtrack.models.*;

public class UsuarioDAO {

	/**
	 * Busca a usuario pelo id
	 * 
	 * @param id id da usuario
	 * @return um objeto do tipo usuario
	 */
	public Usuario getById(int id) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		Usuario usuario = new Usuario();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			ps = conexao.prepareStatement("SELECT * FROM t_ht_usuario WHERE ID_USUARIO = ?");
			ps.setInt(1, id);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario(rs.getInt("ID_USUARIO"), rs.getString("NM_USUARIO"),
						rs.getString("SENHA_USUARIO"), rs.getString("EMAIL_USUARIO"), rs.getDouble("ALTURA"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}

		return usuario;
	}

	/**
	 * resumo usuario
	 * 
	 * @param id codigo do usuario
	 * @return
	 */
	public UsuarioResumoDTO getUsuarioResumoById(int id) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		UsuarioResumoDTO usuario = new UsuarioResumoDTO();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			ps = conexao.prepareStatement("select U.id_usuario, U.nm_usuario, U.email_usuario, U.altura, P.qtd_peso, A.vl_pressao from T_HT_USUARIO U INNER JOIN T_HT_PESO P ON (U.id_usuario = P.id_usuario) INNER JOIN T_HT_PRESSAO A ON (U.id_usuario = A.id_usuario) WHERE U.id_usuario = ? AND P.dt_registro = (SELECT max(dt_registro) FROM T_HT_PESO WHERE id_usuario = U.id_usuario) AND A.dt_registro = (SELECT max(dt_registro) FROM T_HT_PRESSAO WHERE id_usuario = U.id_usuario);");
			ps.setInt(1, id);

			// ps.executeUpdate();
			rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("nm_usuario"));
				System.out.println("id_usuario");				
				
				usuario.setIdUsuario(rs.getInt("id_usuario"));
				usuario.setNomeUsuario(rs.getString("nm_usuario"));
				usuario.setEmail(rs.getString("email_usuario"));
				usuario.setAltura(rs.getDouble("altura"));
				usuario.setPeso(rs.getDouble("qtd_peso"));
				usuario.setPressao(rs.getInt("VL_PRESSAO"));
				usuario.setImc();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}

		return usuario;
	}

	/**
	 * insere uma nova usuario no banco
	 * 
	 * @param usuario objeto com os dados da usuario
	 * @return o codigo da usuario salvo
	 */
	public void insert(Usuario usuario) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			PreparedStatement stmt = conexao.prepareStatement(
					"insert into T_HT_USUARIO (ID_USUARIO, NM_USUARIO, EMAIL_USUARIO, SENHA_USUARIO,ALTURA) "
							+ "VALUES (select nvl(max(ID_USUARIO),0)+ 1, ?, ?, ?, ? from T_HT_USUARIO;)");
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(1, usuario.getSenha());
			stmt.setInt(1, usuario.getIdUsuario());
			stmt.setDouble(2, usuario.getAltura());

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}

		System.out.println("usuario inserido com sucesso");
	}

	/**
	 * Exclui um usuario
	 * 
	 * @param idUsuario codigo do usuario a ser excluido
	 */
	public void delete(int idUsuario) {
		Connection conexao;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");
			stmt = conexao.createStatement();
			stmt.executeUpdate("DELETE FROM T_HT_USUARIO WHERE ID_USUARIO = " + idUsuario);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			stmt = null;
			conexao = null;
		}

		System.out.println("Usuario excluido com sucesso!:");
	}

	/**
	 * Atualiza os dados de um usuario existente
	 * 
	 * @param usuario usuario a ser atualizado
	 */
	public void update(Usuario usuario) {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84177",
					"111297");

			PreparedStatement stmt = conexao.prepareStatement(
					"UPDATE T_HT_USUARIO SET	NM_USUARIO = ?, EMAIL_USUARIO = ?, SENHA_USUARIO = ?, ALTURA = ? WHERE ID_USUARIO = ?");

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.setDouble(4, usuario.getAltura());

			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
			ps = null;
			conexao = null;
		}
		System.out.println("Usuario atualizado com sucesso");
	}
}
