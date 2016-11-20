/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Viagens
 * 
 * Classe Viagem
 * 
 */

package projetoViagens;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
	private String nome;
	private List <Local> listaLocais;
	
	public Viagem(String n) {
		nome = n;
		listaLocais = new ArrayList <Local> ();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionaLocal(Local l) {
		listaLocais.add(l);
	}
	
	public List <Local> getLocais() {
		return listaLocais;
	}
	
	public float totalGasto() {
		float total = 0;
		
		for(Local l: listaLocais) {
			total += l.totalGasto();
		}
		return total;
	}

}
