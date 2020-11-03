package br.com.healthtrack.teste;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.healthtrack.dao.AtividadeDAO;
import br.com.healthtrack.dao.PesoDAO;
import br.com.healthtrack.dao.UsuarioDAO;
import br.com.healthtrack.models.Atividade;
import br.com.healthtrack.models.Peso;
import br.com.healthtrack.models.Refeicao;
import br.com.healthtrack.models.Usuario;
import br.com.healthtrack.models.UsuarioResumoDTO;
import br.com.healthtrack.utils.Util;

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
		PesoDAO pesoDAO = new PesoDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Util util = new Util();
		Usuario usuario = usuarioDAO.getById(1);
		boolean encerrar = false;

		System.out.println("Ola, " + usuario.getIdUsuario());

		while (!encerrar) {
			System.out.println("\r\nQual opçao gostaria de consultar agora?");
			System.out.println("1 - Consultar meus dados");
			System.out.println("2 - Peso");
			System.out.println("digite 0 para encerrar.");

			int opcaoSelecionada = sc.nextInt();
			switch (opcaoSelecionada) {
			case 1:
				System.out.println("\r\nMeus dados");
				System.out.println(usuario.getNome() + ", " + usuario.getEmail());

				break;
			case 2:
				System.out.println("\r\nPeso");

				List<Peso> pesoLst = pesoDAO.getAll(usuario.getIdUsuario());
				
				for (Peso peso : pesoLst) {
					System.out.print("\r\nId: " + peso.getIdPeso());
					System.out.print("\tData: " + peso.getData().toString());
					System.out.print("\tPesos: " + peso.getPeso());
				}

				System.out.println(
						"Digite o codigo do peso que deseja editar,\n digite 0 para criar um novo\ndigite 2 sair para sair");
				String valorEditavel = sc.next();
				if (util.tryParse(valorEditavel)) {
					if (Integer.parseInt(valorEditavel) > 0) {

						boolean encontrado = false;
						for (Peso peso : pesoLst) {
							if (peso.getIdPeso() == Integer.parseInt(valorEditavel)) {
								encontrado = true;
								// editar

								System.out.println("\r\nDigite o novo peso para o registro: " + peso.getIdPeso());
								peso.setPeso(sc.nextDouble());
								pesoDAO.update(peso);
							}
						}

						if (!encontrado) {
							System.out.println("\r\nValor nao encontrado!");
						}

					}
					if (Integer.parseInt(valorEditavel) == 0) {
						System.out.println("\r\nDigite o novo peso");
						Peso novoPeso = new Peso(sc.nextDouble());
						novoPeso.setUsuarioId(usuario.getIdUsuario());
						pesoDAO.insert(novoPeso);
					}

				} else {
					System.out.println("\r\nSaindo");

					encerrar = true;
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
