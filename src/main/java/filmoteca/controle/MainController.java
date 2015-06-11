package filmoteca.controle;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import filmoteca.entidade.Filme;
import filmoteca.servico.FilmeServico;

@Controller
@EnableAutoConfiguration
public class MainController {

	@Autowired
    private FilmeServico servico;

	@RequestMapping("/")
   @ResponseBody
    String home() {
        return "Alo FilmotecaWebMarcio!";
    }
    
    @RequestMapping("/filmes")
    public String verFilmes(Map<String, Object> model) 
    {
    	List<Filme> filmes = servico.obterFilmes();
    	model.put("filmes", filmes);
    	return "listar"; 
    }    
}