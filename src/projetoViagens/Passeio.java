/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Viagens
 * 
 * Classe Passeio
 * 
 */

package projetoViagens;

public class Passeio extends Local {
	private float valorPorHora;
	private float quantHoras;
	
	public Passeio(String n, float gd, float ge) {
		super(n, gd, ge);
	}
	
	public float gastoEspecifico() {
		return (quantHoras * valorPorHora);
	}
	
	public float getValorPorHora() {
		return valorPorHora;
	}
	
	public void setValorPorHora(float vph) {
		valorPorHora = vph;
	}
	
	public float getQuantHoras() {
		return quantHoras;
	}
	
	public void setQuantHoras(float qh) {
		quantHoras = qh;
	}

}
