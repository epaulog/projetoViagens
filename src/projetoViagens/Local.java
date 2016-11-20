/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Viagens
 * 
 * Classe Local
 * 
 */

package projetoViagens;

public abstract class Local {
	private String nome;
	private float gastosDiversos;
	private float gastoEstacionamento;
	
	public Local(String n, float gd, float ge) {
		nome = n;
		gastosDiversos = gd;
		gastoEstacionamento = ge;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getGastosDiversos() {
		return gastosDiversos;
	}
	
	public float getGastoEstacionamento() {
		return gastoEstacionamento;
	}
	
	public abstract float gastoEspecifico();
	
	public float totalGasto() {
		return (gastosDiversos + gastoEstacionamento + gastoEspecifico());
	}
}
