package Jogo.Objetos;

import ClassesBasicas.Ferramenta; 
import ClassesBasicas.Objeto;
import Jogo.Ferramentas.PeDeCabra;

public class Portao extends Objeto {
	public Portao() {
		super("Meu parceiro parece estar atrás destas grades.\nPreciso achar um jeito de abrir este portão enferrujado.",
				"A tranca estava meio enferrujada, não foi tão dificil quanto eu esperava para abrir");
	}

	@Override
	public boolean usarItem(Ferramenta f) {
		if (f instanceof PeDeCabra) {
			this.setAcaoOk(true);
			return true;
		}
		return false;
	}

}
