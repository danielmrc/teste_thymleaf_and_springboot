package br.com.teste.docket.cartorios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.teste.docket.cartorios.domain.Cartorio;
import br.com.teste.docket.cartorios.domain.CartorioRepositorio;

@Controller
public class CartorioControle {

    @Autowired
    private CartorioRepositorio cartorioRepo;

    public CartorioControle(CartorioRepositorio cartorioRepositorio){
        this.cartorioRepo = cartorioRepositorio;
    }
    
    @GetMapping("/cartorio/index")
    public String cartorios(Model model){
        String url = "/cartorio/index";
        model.addAttribute("listaCartorios", cartorioRepo.findAll());
        return url;
    }

    @GetMapping("/cartorio/novoCartorio")
    public String novoCartorio(@ModelAttribute("cartorio") Cartorio cartorio){
        String url = "cartorio/formCartorio";
        return url;
    }

    @PostMapping("/cartorio/salvarCartorio")
    public String salvarCartorio(@ModelAttribute("cartorio") Cartorio cartorio){
        String url= "/cartorio/index";
        cartorioRepo.save(cartorio);
        return url;
    }
}
