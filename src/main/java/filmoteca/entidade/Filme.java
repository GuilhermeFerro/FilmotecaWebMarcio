package filmoteca.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Filme implements Serializable {
	
	private Long id;
	private String titulo;
	private String diretor;
	private Classificacao classificao;
		
	public Filme(String titulo, String diretor, Classificacao classificao) {
		super();
		this.titulo = titulo;
		this.diretor = diretor;
		this.classificao = classificao;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false)
	public String getTitulo() {
		return titulo;
	}
	
	@Column(nullable = false)
	public String getDiretor() {
		return diretor;
	}
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	public Classificacao getClassificao() {
		return classificao;
	}

	
}
