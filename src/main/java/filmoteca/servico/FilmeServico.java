package filmoteca.servico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import filmoteca.entidade.Classificacao;
import filmoteca.entidade.Filme;

@Service
@EnableAutoConfiguration
public class FilmeServico {

	public List<Filme> obterFilmes() {
		List<Filme> filmes = new ArrayList<Filme>();
		filmes.add( new Filme("Star Wars", "George Lucas", Classificacao.MEDIA));
		filmes.add( new Filme("Superman", "Spilberg", Classificacao.ALTA));
		filmes.add( new Filme("Batman", "Oliver Stone", Classificacao.ALTA));
		return filmes;
	}
}