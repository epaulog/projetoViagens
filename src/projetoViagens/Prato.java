/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Viagens
 * 
 * Classe Prato
 * 
 */

package projetoViagens;

public class Prato {
	private String nome;
	private float preco;
	
	public Prato(String n, float p) {
		nome = n;
		preco = p;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getPreco() {
		return preco;
	}

}
