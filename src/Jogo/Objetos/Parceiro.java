package Jogo.Objetos;

import ClassesBasicas.Ferramenta; 
import ClassesBasicas.Objeto;
import Jogo.Ferramentas.MolhoDeChaves;


public class Parceiro extends Objeto {
	public Parceiro() {
		super("Ele está amarrado a uma parede por correntes.\nPreciso achar uma chave para abrir o cadeado.",
				"Agora preciso leva-lo ao hospital...");
	}

	@Override
	public boolean usarItem(Ferramenta f) {
		if (f instanceof MolhoDeChaves) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}
	
}
