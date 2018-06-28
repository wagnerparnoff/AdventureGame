package Jogo.Objetos;

import ClassesBasicas.Ferramenta; 
import ClassesBasicas.Objeto;
import Jogo.Ferramentas.PeDeCabra;

public class Portao extends Objeto {
	public Portao() {
		super("Meu parceiro parece estar atr�s destas grades.\nPreciso achar um jeito de abrir este port�o enferrujado.",
				"A tranca estava meio enferrujada, n�o foi t�o dificil quanto eu esperava para abrir");
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
