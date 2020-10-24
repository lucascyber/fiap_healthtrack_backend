package br.com.healthtrack.teste;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import br.com.healthtrack.dao.AtividadeDAO;
import br.com.healthtrack.models.Atividade;
import br.com.healthtrack.models.Refeicao;
import br.com.healthtrack.models.Usuario;

/**
 * Classe de teste do aplicativo
 * 
 * @author Lucas Coutinho
 * @author Lucas Teixeira
 * @version 1.1
 */

public class HealthTrackTest {

	public static void main(String[] args) throws ParseException {
		// inicializacao
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario("Mateus Oliveira", "123456", "mateus@oliveira.com.br");
		AtividadeDAO atividadeDAO = new AtividadeDAO();
		Refeicao refeicao = new Refeicao("Almoço");
		boolean encerrar = false;

		// dados usuario
		usuario.setAltura(1.82);
		//usuario.setPeso(85.5);
		//usuario.setImc(usuario.getPeso(), usuario.getAltura());
		refeicao.setPtsHealthScore(8989);

		System.out.println("Ola, " + usuario.getNome());
		while (!encerrar) {
			System.out.println("\r\nQual opçao gostaria de consultar agora?");
			System.out.println("1 - Consultar meus dados");
			System.out.println("2 - atividades");
			System.out.println("digite 0 para encerrar.");

			int opcaoSelecionada = sc.nextInt();
			switch (opcaoSelecionada) {
			case 1:
				System.out.println("\r\nMeus dados");
				System.out.println(usuario.getNome() + ", " + usuario.getEmail());
				// System.out.println("Peso:" + usuario.getPeso() + " \t Altura:" +
				// usuario.getAltura());
				System.out.println("Seu imc é:" + usuario.getImc());

				break;
			case 2:
				System.out.println("\r\nAtividades");
				// todo listar atividades

				List<Atividade> atividadesLst = atividadeDAO.getAll();
				System.out.println("");

				for (Atividade atividade : atividadesLst) {

					System.out.print("Id: " + atividade.getIdAtividade());
					System.out.print("\tData: " + atividade.getDatAtividade().toString());
					System.out.print("\tCalorias Consumidas: " + atividade.getCalConsumidas());
					System.out.print("\tMeta de calorias: " + atividade.getCalMeta());
					System.out.print("\tQuantidade de agua: " + atividade.getQtdAgua());
					System.out.println("\tHealth Score: " + atividade.getPtsHealthScore() + "pts");
				}

				break;
			case 0:
				encerrar = sc.nextInt() == 0;
				break;
			default:
				System.out.println("Comando invalido");
			}
		}
	}

}
