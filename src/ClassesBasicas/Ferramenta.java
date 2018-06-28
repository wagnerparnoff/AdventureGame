package ClassesBasicas;

public class Ferramenta {
	private String nome;

	public Ferramenta(String nome) {
		super();
		this.nome = nome;
	}

	public String getDescricao() {
		return nome;
	}
	
	public boolean usarItem() {
		return true;
	}
}
