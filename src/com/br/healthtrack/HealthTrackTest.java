package com.br.healthtrack;

public class HealthTrackTest {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Refeicao refeicao = new Refeicao("Almo�o");
		CardapioPersonalizado cardapioPersonalizado = new CardapioPersonalizado(
				"personalizado"
		);
		
		usuario.setNomeUsuario("Mateus Oliveira");
		usuario.setAltura(1.82);
		usuario.setPeso(85.5);
		usuario.setImc(usuario.getPeso(), usuario.getAltura());
		
		refeicao.ptsHealthScore = 8989;
		
		System.out.println("Este � o seu IMC:" + usuario.getImc());
		cardapioPersonalizado.atualizarCardapio(22, 123, "Meu card�pio personalizado");
		System.out.println(cardapioPersonalizado.nomeCardapio);
		cardapioPersonalizado.consultarCardapio(2, 2);
		
		System.out.println("Nome refei��o: "+ refeicao.descricaoRefeicao);
		System.out.println("Pontos HealthScore da Refeicao: "+ refeicao.ptsHealthScore);
	}
}
