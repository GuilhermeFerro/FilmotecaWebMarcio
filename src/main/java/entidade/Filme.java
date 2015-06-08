package entidade;

public class Filme {
	private String titulo;
	private String diretor;
		
	public Filme(String titulo, String diretor, Classificacao classificao) {
		super();
		this.titulo = titulo;
		this.diretor = diretor;
		this.classificao = classificao;
	}
	private Classificacao classificao;
	public String getTitulo() {
		return titulo;
	}
	public String getDiretor() {
		return diretor;
	}
	public Classificacao getClassificao() {
		return classificao;
	}

	
	
}
