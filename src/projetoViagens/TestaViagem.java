/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Viagens
 * 
 * Classe TestaViagem
 * 
 */

package projetoViagens;


public class TestaViagem {
    public static void main(String[] args) {
        Viagem v1 = new Viagem("Pantanal");
        Passeio p1 = new Passeio("Mergulho", 80, 20);
        Passeio p2 = new Passeio("Cavalgada", 100, 0);
        
        p1.setQuantHoras(2);
        p2.setQuantHoras(4);
        p1.setValorPorHora(150);
        p2.setValorPorHora(50);
        
        Restaurante r1 = new Restaurante("Lago Azul", 0, 10);
        Restaurante r2 = new Restaurante("Campos Verdes", 0, 0);
        
        Prato prato1 = new Prato("Filé Traíra", 30);
        Prato prato2 = new Prato("Moqueca peixe", 40);
        Prato prato3 = new Prato("Taça Vinho", 20);
        Prato prato4 = new Prato("Costela Assada", 30);
        Prato prato5 = new Prato("Cerveja", 20);
        
        v1.adicionaLocal(p1);
        v1.adicionaLocal(p2);
        v1.adicionaLocal(r1);
        v1.adicionaLocal(r2);
        
        r1.adicionaPrato(prato1);
        r1.adicionaPrato(prato2);
        r1.adicionaPrato(prato3);
        
        r2.adicionaPrato(prato4);
        r2.adicionaPrato(prato5);
        
        TelaViagem tela = new TelaViagem();
        tela.mostraViagem(v1);
    }
}
