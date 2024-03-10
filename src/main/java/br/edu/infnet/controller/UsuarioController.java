package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Usuario usuario){
        usuarioService.incluir(usuario);
}

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable int id) {
        usuarioService.excluir(id);
    }

    @GetMapping(value = "/listar")
    public Collection<Usuario> obterLista(){
        return usuarioService.obterLista();
    }

    @GetMapping(value = "/{id}/listar")
    public Usuario obter(@PathVariable int id){
        return usuarioService.obter(id);
    }
}