package controller;

import DAO.ProdutoDAO;
import model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ProdutoController {

    // 1. Método para APENAS ABRIR a página inicial
    @RequestMapping("/index")
    public String irParaIndex() {
        return "index"; // Abre o WEB-INF/jsp/index.jsp
    }

    // 2. Método para REALIZAR A BUSCA (chamado quando clica no botão)
    @RequestMapping("/buscarProduto") 
    public String buscar(@RequestParam("idProduto") int id, Model model) {
        
        ProdutoDAO DAO = new ProdutoDAO();
        Produto p = DAO.buscarPorId(id);

        if (p != null) {
            model.addAttribute("produto", p);
            return "resultado";
        } else {
            model.addAttribute("erro", "Produto não encontrado!");
            return "index";
        }
    }
}