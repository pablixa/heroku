package controle;

import entidade.Piada;
import entidade.PiadaDAO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://editor.swagger.io")
@RestController
public class Controle {

    @RequestMapping(method = RequestMethod.POST, value="/piada")
    public Piada salvarPiada(@RequestBody Piada p){
       PiadaDAO dao = new PiadaDAO();
       Piada piadaSalva = dao.salvar(p);
      return piadaSalva;
    
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/piada/{id}")
    public Piada listarPiada(Piada p){
       
       return p;
    
    }
    
}



