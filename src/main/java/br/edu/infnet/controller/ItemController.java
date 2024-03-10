package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Item;
import br.edu.infnet.model.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Item item){
        itemService.incluir(item);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable int id) {
        itemService.excluir(id);
    }

    @GetMapping(value = "/listar")
    public Collection<Item> obterLista(){
        return itemService.obterLista();
    }

    @GetMapping(value = "/{id}/listar")
    public Item obter(@PathVariable int id){
        return itemService.obter(id);
    }
}
