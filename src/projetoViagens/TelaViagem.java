/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Viagens
 * 
 * Classe TelaViagem
 * 
 */

package projetoViagens;

import java.util.List;

public class TelaViagem {

	public void mostraViagem(Viagem v) {
		List <Local> listaLocais;
		listaLocais = v.getLocais();
		
		System.out.println("Viagem: " + v.getNome());
		System.out.println("Locais Visitados:");
		System.out.println("-----------------------------------");
		
		for(Local l: listaLocais) {
			if (l instanceof Passeio) {
				System.out.println("Passeio: " + l.getNome());
				
				Passeio p = (Passeio)l;
				
				System.out.println("Horas:             = " + p.getQuantHoras());
				System.out.println("Valor Por Hora:    = R$ " + p.getValorPorHora());
				System.out.println("                    ----------");
				System.out.println("SubTotal           = R$ " + p.gastoEspecifico());
				System.out.println("Estacionamento     = R$ " + p.getGastoEstacionamento());
				System.out.println("Diversos           = R$ " + p.getGastosDiversos());
				System.out.println("Total              = R$ " + p.totalGasto());
				System.out.println("           = ");
				System.out.println("-----------------------------------");
			} else if (l instanceof Restaurante) {
                System.out.println("Restaurante: " + l.getNome());
				
				Restaurante r = (Restaurante)l;
				List <Prato> pratos;
				pratos = r.getPratos();
				
				for(Prato prat: pratos) {
					System.out.println(prat.getNome() + "  = R$ " + prat.getPreco());
				}
				System.out.println("                    ----------");
				System.out.println("SubTotal           = " + r.gastoEspecifico());
				System.out.println("Estacionamento     = " + r.getGastoEstacionamento());
				System.out.println("Diversos           = " + r.getGastosDiversos());
				System.out.println("Total              = " + r.totalGasto());
				System.out.println("           = ");
				System.out.println("-----------------------------------");
			}
			
		}
		
		System.out.println("Total Gasto Viagem: " + v.totalGasto());
		System.out.println("-----------------------------------");
	}
}
