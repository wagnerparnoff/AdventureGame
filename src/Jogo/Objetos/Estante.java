package Jogo.Objetos;

import ClassesBasicas.Ferramenta; 
import ClassesBasicas.Objeto;
import Jogo.Ferramentas.Livro;

public class Estante extends Objeto {
	public Estante() {
		super("Parece estar faltando um livro na estante...",
				"Ela abriu para o lado...\nParece ter uma passagem atrás dela.");
	}

	@Override
	public boolean usarItem(Ferramenta f) {
		if (f instanceof Livro) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}
	
}
