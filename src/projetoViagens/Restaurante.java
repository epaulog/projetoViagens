/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Viagens
 * 
 * Classe Restaurante
 * 
 */

package projetoViagens;

import java.util.ArrayList;
import java.util.List;

public class Restaurante extends Local{
	private List <Prato> listaPratos;
	
	public Restaurante(String n, float gd, float ge) {
		super(n, gd, ge);
		listaPratos = new ArrayList <Prato> ();
	}
	
	public float gastoEspecifico() {
		float total = 0f;
		
		for (Prato p: listaPratos) {
			total += p.getPreco();
		}
		return total;
	}
	
	public void adicionaPrato(Prato p) {
		listaPratos.add(p);
	}

	public List <Prato> getPratos() {
		return listaPratos;
	}
	
}
