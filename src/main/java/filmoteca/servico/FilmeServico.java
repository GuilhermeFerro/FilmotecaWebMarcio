package filmoteca.servico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import filmoteca.entidade.Classificacao;
import filmoteca.entidade.Filme;

@Service
@EnableAutoConfiguration
public class FilmeServico {
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public FilmeServico(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Filme> obterFilmes() {
		return jdbcTemplate.query("select * from Filme", new RowMapper<Filme>() {
			@Override
			public Filme mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Filme(rs.getString("titulo"), 
						rs.getString("diretor"), 
						Classificacao.valueOf(rs.getString("classificacao")));
			}			
		});
	}
}