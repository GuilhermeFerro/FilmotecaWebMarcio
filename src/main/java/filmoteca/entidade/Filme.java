package filmoteca.entidade;

import java.io.Serializable;

public class Filme implements Serializable {
	
	private Long id;
	private String titulo;
	private String diretor;
	private Classificacao classificao;
		
	public Filme(String titulo, String diretor, Classificacao classificacao) {
		super();
		this.titulo = titulo;
		this.diretor = diretor;
		this.classificao = classificacao;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
